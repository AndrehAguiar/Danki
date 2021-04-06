package View;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import Controller.ControlDefense;
import Controller.ControlGame;
import Controller.ControlInvader;
import Controller.ControlPlayer;
import Controller.ControlShot;

public class ViewGame extends Canvas implements Runnable, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ControlGame ctrlGame = new ControlGame(); 
	ControlInvader ctrlInvader = new ControlInvader(); 
	ControlDefense ctrlDefense = new ControlDefense(); 
	ControlPlayer ctrlPlayer = new ControlPlayer(); 
	ControlShot ctrlShot = new ControlShot(); 
	
	public ViewGame() {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(480,480));
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		ctrlGame.start(bs);
		ctrlInvader.start(bs);
		ctrlDefense.start(bs);
		ctrlPlayer.start(bs);
		ctrlShot.start(bs);
		bs.show();
		
	}

	@Override
	public void run() {
		double fps = 60.0;
		while(true) {
			ctrlInvader.update();
			ctrlPlayer.update();
			ctrlShot.update();
			render();
			try {
				Thread.sleep((int)(1000/fps));
			} catch (InterruptedException e) {}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == 37) {
			ctrlPlayer.side = 37;
			
		}else if(e.getKeyCode() == 39) {
			ctrlPlayer.side = 39;
			
		}else if(e.getKeyCode() == 38) {
			ctrlShot.shoted = true;
			ctrlShot.shooter = "player";
			ctrlShot.x = ctrlPlayer.x;
			ctrlShot.y = ctrlPlayer.y;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == 37) {
			ctrlPlayer.side = 37;
			
		}else if(e.getKeyCode() == 39) {
			ctrlPlayer.side = 39;
			
		}
	}

}
