package Controller;

import java.awt.image.BufferStrategy;

import Model.Player;

public class ControlPlayer {
	
	public int x = 15;
	public int y = 460;
	public int side = 0;
	
	int maxDistance = 450;	
	int minDistance = 15;
	boolean chegou = false;

	public void start(BufferStrategy bs) {
		new Player(bs, x, y);
	}
	
	public void update() {
		if(x < maxDistance && side == 39) {
			x+=5;
		}else if(x > minDistance && side == 37){
			x-=5;
		}else {
			side = 0;
		}
	}

}
