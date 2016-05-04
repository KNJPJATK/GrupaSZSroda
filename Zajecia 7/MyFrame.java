import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		super("Moje okienko");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		setLayout(boxLayout);

		// setSize(300, 300);

		JButton startBtn = new JButton("Start");
//		startBtn.setPreferredSize(new Dimension(50, 20));
		startBtn.addActionListener((e) -> {new GameFrame();});
		

		JButton exitBtn = new JButton("Exit");
//		exitBtn.setPreferredSize(new Dimension(50, 20));
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
//				MyFrame.this.dispose();
			}
		});
		
		
		add(startBtn);
		add(exitBtn);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
