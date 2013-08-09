import java.awt.Color;
import java.awt.Graphics;


public class Enemy {
	int x;
	int y;
	int xv;
	int yv;

	
	public Enemy(int startx, int starty) {
		x = startx;
		y = starty;
	}

	public void setVelocity(int xvelocity, int yvelocity) {
		xv = xvelocity;
		yv = yvelocity;
	}
	public void move() {
		x = x + xv;
		y = y + yv;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x-5, x -5, 20, 20);
	}
}
