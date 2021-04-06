package Controller;

import java.awt.image.BufferStrategy;

import Model.Invader;

public class ControlInvader{

	public int x = 0;
	public int y = 0;
	
	int maxDistance = 200;	
	int minDistance = 0;
	boolean chegou = false;
	
	public void start(BufferStrategy bs) {
		new Invader(bs, x, y);
	}
	
	public void update() {
		if(x < maxDistance && chegou == false) {
			x++;
			if(x == maxDistance) {
				chegou = true;
				y+=4;
			}
		}else {
			x--;
			if(x == minDistance) {
				chegou = false;
				y+=4;
			}
		}
	}

}
