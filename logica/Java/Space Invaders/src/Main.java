import javax.swing.JFrame;

import View.ViewGame;

public class Main{

	public static void main(String[] args) {
		ViewGame viewGame = new ViewGame();
		JFrame frame = new JFrame();
		frame.setTitle("Exercicio Logica");
		frame.add(viewGame);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		new Thread(viewGame).start();
	}

}
