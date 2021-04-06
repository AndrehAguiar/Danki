package Controller;

import java.awt.image.BufferStrategy;

import Model.Shot;

public class ControlShot {
	
	Shot[] shots = new Shot[10];
	protected int countShots = 0;
	public boolean shoted = false;
	public String shooter = "";
	public int x;
	public int y;
	
	
	
	public void start(BufferStrategy bs) {
		if (shoted == true){
			if(shooter == "player") {
				
				new Shot(bs, shooter, x, y);
				countShots++;
			}
			
		}
	}
	
	public void update() {
		y-=10;
					
	}
}
