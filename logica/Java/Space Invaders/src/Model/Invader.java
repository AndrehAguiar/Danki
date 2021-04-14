package Model;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class Invader extends Canvas {
	
	public ArrayList<Integer> positionX;
	public ArrayList<Integer> positionY;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Invader(BufferStrategy bs, int x, int y) {
		
		positionX = new ArrayList<>();
		positionY = new ArrayList<>();
		
		Graphics g = bs.getDrawGraphics();
		setInvader(g, x, y);
	}
	
	public void setInvader(Graphics g, int ctrlx, int ctrly) {		
		
		g.setColor(Color.red);		
		int spaceX = 0;
		int spaceY = 0;
		for (int k = 1; k <= 50; k++) {
			int count = 5;
			for(int j = 0; j <= 5; j++) {
				int y = j * 2;
				for(int i = 0; i <= count; i++){
					int x = i*2 + j;
					g.fillRect(x+ctrlx+spaceX, y+ctrly+spaceY, 2, 2);
					this.positionX.add(x+ctrlx+spaceX);
					this.positionY.add(y+ctrly+spaceY);
					
				}
				count -= 1;
			}
			spaceX += 30;
			if(k % 10 == 0) {
				spaceY += 30;
				spaceX = 0;
			}
		}
		System.out.println(this.positionY);
		System.out.println(this.positionX);
	}

}
