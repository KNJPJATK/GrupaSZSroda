import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class MyFrame extends JFrame implements ActionListener {
	private JTextField textField = new JTextField();
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	public MyFrame() {
		super("Lista");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);

		JList<String> list = new JList<>(listModel);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JPanel downPanel = new JPanel(new BorderLayout());
		textField.addActionListener(this);
		JButton addBtn = new JButton("Add");

		addBtn.addActionListener(this);

		downPanel.add(textField);
		downPanel.add(addBtn, BorderLayout.EAST);

		add(scrollPane);
		add(downPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		if (text.equals("")) {
			return;
		}
		listModel.addElement(text);
		textField.setText("");
	}

}
