package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
    private Player player;
    private ArrayList<Circle> circles;
    private Timer timer;
    private int score;
    private boolean isGameOver;
    
    public GamePanel() {
        setBackground(new Color(0, 150, 200));
        setFocusable(true);
        
        player = new Player(220, 400);
        circles = new ArrayList<>();
        score = 0;
        isGameOver = false;
        
        //addKeyListener:키보드 입력시 실행하는 메소드
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (!isGameOver) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_LEFT:
                            player.moveLeft();
                            break;
                        case KeyEvent.VK_RIGHT:
                            player.moveRight();
                            break;
                    }
                }
            }
        });
        
        timer = new Timer(20, this);
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // 점수 표시
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score : " + score, 10, 25);
        
        // 플레이어 그리기
        player.draw(g);
        
        // 버섯 그리기
        for (Circle mushroom : circles) {
            mushroom.draw(g);
        }
        
        if (isGameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over!", 150, 250);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            // 새로운 버섯 생성
            if (Math.random() < 0.02) {
                circles.add(new Circle((int)(Math.random() * 460), 0));
            }
            
            // 버섯 이동
            for (int i = circles.size() - 1; i >= 0; i--) {
                Circle mushroom = circles.get(i);
                mushroom.move();
                
                // 충돌 체크
                if (player.intersects(mushroom)) {
                    isGameOver = true;
                }
                
                // 화면 밖으로 나간 버섯 제거
                if (mushroom.getY() > 500) {
                    circles.remove(i);
                    score++;
                }
            }
        }
        repaint();
    }
}