package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Defense {

	public Defense(BufferStrategy bs, int x, int y) {
		
		Graphics g = bs.getDrawGraphics();
		setDefense(g, x, y);
	}	
	
	public void setDefense(Graphics g, int ctrlx, int ctrly) {		

		g.setColor(Color.green);	
		int spaceX = 60;
		int spaceY = 348;
		for (int k = 1; k <= 4; k++) {
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
	
		spaceX = 30;
		spaceY = 380;
		for (int k = 1; k <= 4; k++) {
			int count = 15;
			
			for(int j = 0; j <= 15; j++) {
				int y = j * 2;
				
				for(int i = 0; i <= count; i++){
					int x = i*4 + j*2;
					g.fillRect(x+spaceX, y+spaceY, 4, 2);
				}
				count -= 1;
			}
			spaceX += 120;
		}
	}
}
