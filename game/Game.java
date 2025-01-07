package game;

import javax.swing.*;

public class Game extends JFrame {
    private GamePanel gamePanel;
    
    public Game() {
        setTitle("공피하기 게임");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//사이즈 조절 못하게 막기
        
        gamePanel = new GamePanel();
        add(gamePanel);//판넬 프레임에 추가
        
        setLocationRelativeTo(null);//프로그램 화면 가운데에 보이게하기
        setVisible(true);//최종 프로그램 보이게 하기
    }
    
    public static void main(String[] args) {
        new Game();
    }
}