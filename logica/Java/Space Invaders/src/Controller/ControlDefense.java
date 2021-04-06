package Controller;

import java.awt.image.BufferStrategy;

import Model.Defense;

public class ControlDefense {

	public int x = 0;
	public int y = 0;
	
	public void start(BufferStrategy bs) {
		new Defense(bs, x, y);
	}

}
