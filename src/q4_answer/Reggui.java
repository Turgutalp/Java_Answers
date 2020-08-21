package q4_answer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Reggui {

	private JFrame frame;
	private JTextField txtValue;
	private JTextField txtPattern;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Reggui window = new Reggui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reggui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblPattern = new JLabel("Pattern");
		JLabel lblResult = new JLabel("Result");
		JLabel lblValue = new JLabel("Value");
		JButton btnSubmit = new JButton("Submit");
		txtPattern = new JTextField();
		txtValue = new JTextField();

		// The setBounds() method not only specifies the size of the frame, but the
		// location of the upper left corner:
		// public void setBounds(int x, int y, int width, int height)
		txtPattern.setBounds(60, 80, 80, 20);
		lblValue.setBounds(160, 80, 50, 20);
		lblPattern.setBounds(10, 80, 80, 20);
		lblResult.setBounds(300, 110, 50, 20);
		txtValue.setBounds(200, 80, 80, 20);
		btnSubmit.setBounds(200, 110, 90, 20);

		frame.getContentPane().add(lblValue);
		frame.getContentPane().add(lblPattern);
		frame.getContentPane().add(txtValue);
		frame.getContentPane().add(txtPattern);
		frame.getContentPane().add(lblResult);
		frame.getContentPane().add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (txtPattern.getText().matches(txtValue.getText())) {
					lblResult.setForeground(Color.green);
					lblResult.setText("TRUE");
				} else {
					lblResult.setForeground(Color.red);
					lblResult.setText("FALSE");
				}

			}

		});
	}
}
