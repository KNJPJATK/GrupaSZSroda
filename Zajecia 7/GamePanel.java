import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	public static final int CIRCLE = 1;
	public static final int CROSS = -1;

	private int[][] board = new int[3][3];
	private int turn = CIRCLE;
	private int offset = 10;

	public GamePanel() {
		setPreferredSize(new Dimension(300, 300));

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				int x = e.getX();
				int y = e.getY();

				int scaleX = GamePanel.this.getWidth() / 3;
				int scaleY = GamePanel.this.getHeight() / 3;

				x /= scaleX;
				y /= scaleY;

				// System.out.println("X = " + x + ", Y = " + y);

				board[y][x] = turn;

				if (turn == CIRCLE) {
					turn = CROSS;
				} else if (turn == CROSS) {
					turn = CIRCLE;
				}

				repaint();
			}

		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int columnWidth = getWidth() / 3;
		int rowHeight = getHeight() / 3;

		g.drawLine(0, rowHeight, getWidth(), rowHeight);
		g.drawLine(0, 2 * rowHeight, getWidth(), 2 * rowHeight);

		g.drawLine(columnWidth, 0, columnWidth, getHeight());
		g.drawLine(2 * columnWidth, 0, 2 * columnWidth, getHeight());

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] == CIRCLE) {
					g.drawOval(j * columnWidth + offset, 
							i * rowHeight + offset, 
							columnWidth - 2 * offset,
							rowHeight - 2 * offset);

				} else if (board[j][i] == CROSS) {
					g.drawLine(j * columnWidth + offset, 
							i * rowHeight + offset, 
							columnWidth - 2 * offset,
							rowHeight - 2 * offset);
					
					g.drawLine(j * columnWidth + columnWidth - offset, 
							i * rowHeight + offset, 
							offset * i, //TODO 
							rowHeight - 2 * offset);
				}
			}
		}

	}
}
