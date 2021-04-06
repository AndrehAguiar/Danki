package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Shot {
	
	public int yShot;

	public Shot(BufferStrategy bs, String shooter, int x, int y) {
		// TODO Auto-generated constructor stub
		Graphics g = bs.getDrawGraphics();
		yShot = y;
		setShot(g, shooter, x, yShot);
		
	}
	public void setShot(Graphics g, String shooter, int x, int y) {
		if(shooter == "player") {
			g.setColor(Color.blue);	
			
		}else {
			g.setColor(Color.red);
			
		}
		for(int i = 0; i <= 4; i++){
			g.fillRect(x, y, 4, 4);
			y-=4;
		}
	}

}
