package q5_answer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Gui5 {

	private JTextField text;
	private JLabel label;

	public Gui5() {

		JFrame frame = new JFrame("Comma Monster");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		text = new JTextField(20);

		JButton clear = new JButton("Clear All Coma !!!! ");

		label = new JLabel(" ");

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				text.setText("");
			}
		});

		text.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {

				label.setText(addCommasToNumber(text.getText()));
			}

			@Override
			public void insertUpdate(DocumentEvent e) {

				label.setText(addCommasToNumber(text.getText()));
			}

			@Override
			public void changedUpdate(DocumentEvent e) {

				label.setText(addCommasToNumber(text.getText()));
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(text);
		panel.add(clear);
		panel.add(label);

		frame.add(panel);
		frame.pack();
		frame.setSize(400, 200);
		frame.setVisible(true);
	}

	private String addCommasToNumber(String nmbr) {
		String sstring = " ";
		for (int i = 0; i < nmbr.length(); i++) {
			if (nmbr.charAt(i) < '0' || nmbr.charAt(i) > '9') {
				return "invalid number";
			} else {
				sstring = sstring + nmbr.charAt(i);
			}
			if (i != 0 && (i % 3 == 0)) {
				sstring = sstring + ",";
			}
		}
		return sstring;
	}

	public static void main(String[] args) {

		new Gui5();

	}
}