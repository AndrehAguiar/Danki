package Model;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Player  extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Player(BufferStrategy bs, int x, int y) {
		
		Graphics g = bs.getDrawGraphics();
		setPlayer(g, x, y);
	}
	public void setPlayer(Graphics g, int spaceX, int spaceY) {
		
		g.setColor(Color.blue);	
		int count = 0;
		
		for(int j = 0; j <= 15; j++) {
			int y = j * 2;
			
			for(int i = 0; i <= count; i++){
				int x = i*4 - j*2;
				g.fillRect(x+spaceX, y+spaceY, 4, 2);
			}
			count += 1;
		}
		spaceX += 120;		
	}

}
