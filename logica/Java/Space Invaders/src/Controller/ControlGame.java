package Controller;

import java.awt.image.BufferStrategy;

import Model.Game;

public class ControlGame {
	
	public void start(BufferStrategy bs) {
		new Game(bs);
	}

}
