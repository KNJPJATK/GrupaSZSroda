import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame() {
		super("Tic tac toe");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		GamePanel gamePanel = new GamePanel();
		
		add(gamePanel);
		pack();
		setVisible(true);
	}
}
