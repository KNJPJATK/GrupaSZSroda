package ticTacToe;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final int CIRCLE = 1;
	private static final int CROSS = 2;

	private int[][] gameBoard = new int[3][3];
	private int turn = 1;

	public GamePanel() {
		setPreferredSize(new Dimension(300, 300));

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				int x = e.getX();
				int y = e.getY();
				int columnWidth = GamePanel.this.getWidth() / gameBoard.length;
				int rowHeight = GamePanel.this.getHeight() / gameBoard.length;

				x = x / columnWidth;
				y = y / rowHeight;

				gameBoard[y][x] = turn;

				if (turn == CIRCLE) {
					turn = CROSS;

				} else if (turn == CROSS) {
					turn = CIRCLE;
				}

				repaint();

				if (hasWinner()) {
					JOptionPane.showMessageDialog(GamePanel.this,
							"Player " + ((turn % 2 == 0) ? 1 : 2) + " has won :D");
					System.exit(0);
				} else if (isTie()) {
					JOptionPane.showMessageDialog(GamePanel.this, "Its a tie!");
					System.exit(0);
				}
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int columnWidth = this.getWidth() / gameBoard.length;
		int rowHeight = this.getHeight() / gameBoard.length;

		for (int i = 1; i < gameBoard.length; i++) {
			g.drawLine(0, i * rowHeight, this.getWidth(), i * rowHeight);
		}

		for (int i = 1; i < gameBoard.length; i++) {
			g.drawLine(i * columnWidth, 0, i * columnWidth, this.getHeight());
		}

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				int startX = i * columnWidth;
				int startY = j * rowHeight;
				if (gameBoard[j][i] == 1) {

					g.drawOval(startX + 10, startY + 10, columnWidth - 20, rowHeight - 20);

				} else if (gameBoard[j][i] == 2) {
					g.drawLine(startX + 10, startY + 10, startX + columnWidth - 10, startY + rowHeight - 10);
					g.drawLine(startX + 10, startY + rowHeight - 10, startX + columnWidth - 10, startY + 10);
				}
			}
		}
	}

	private boolean hasWinner() {
		if (gameBoard[0][0] != 0 && gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2])
			return true;

		if (gameBoard[1][0] != 0 && gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2])
			return true;

		if (gameBoard[2][0] != 0 && gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2])
			return true;

		if (gameBoard[0][0] != 0 && gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0])
			return true;

		if (gameBoard[0][1] != 0 && gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1])
			return true;

		if (gameBoard[0][2] != 0 && gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2])
			return true;

		if (gameBoard[0][0] != 0 && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2])
			return true;

		if (gameBoard[2][0] != 0 && gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2])
			return true;

		return false;
	}

	private boolean isTie() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (gameBoard[i][j] == 0) {
					return false;
				}
			}
		}

		return true;
	}

}
