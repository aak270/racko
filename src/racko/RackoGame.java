package racko;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RackoGame implements Runnable {
	public void run() {
		final JFrame frame = new JFrame("Rack-o!");
		frame.setLocation(0, 0);
		frame.setLayout(new BorderLayout());

		final Racko court = new Racko();
		frame.add(court, BorderLayout.CENTER);


		frame.pack();
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void gameOver() {
		JFrame gameOverFrame = new JFrame();
		JLabel gameOverLabel = new JLabel("Game Over");
		gameOverFrame.setVisible(true);
		gameOverFrame.add(gameOverLabel);
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new RackoGame());
	}
}
