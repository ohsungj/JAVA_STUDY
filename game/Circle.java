package game;

import java.awt.Color;
import java.awt.Graphics;

public class Circle { private int x, y;
private final int WIDTH = 60;
private final int HEIGHT = 60;

public Circle(int x, int y) {
    this.x = x;
    this.y = y;
}

public void move() {
    y += 3;
}

public void draw(Graphics g) {
    g.setColor(Color.GRAY);
    g.fillOval(x, y, WIDTH, HEIGHT);
}

public int getX() { return x; }
public int getY() { return y; }
public int getWidth() { return WIDTH; }
public int getHeight() { return HEIGHT; }
}


