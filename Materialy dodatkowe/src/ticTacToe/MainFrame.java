package ticTacToe;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		super("Tic Tac Toe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new GamePanel());
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MainFrame());

	}

}
