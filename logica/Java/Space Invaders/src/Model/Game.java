package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game{
	
	int spaceX = 0;
	int spaceY = 0;
	
	public Game(BufferStrategy bs) {

		Graphics g = bs.getDrawGraphics();
		setDisplay(g);
	}
	
	public void setDisplay(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 480, 480);
	}
}
