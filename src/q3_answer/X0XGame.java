package q3_answer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class X0XGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					X0XGame window = new X0XGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public X0XGame() {
		initialize();
	}

	protected void check() {

		JButton[] boxes = new JButton[9];

		int k = 0;

		for (java.awt.Component c : frame.getContentPane().getComponents())

		{

			if (c instanceof JButton)

			{

				boxes[k] = (JButton) c;

				k++;

			}

		}

		int winners[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },

				{ 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 },

				{ 2, 4, 6 } };

		for (int i = 0; i < winners.length; i++) {

			String btn1 = boxes[winners[i][0]].getText();

			String btn2 = boxes[winners[i][1]].getText();

			String btn3 = boxes[winners[i][2]].getText();

			if (btn1.equals(btn2) && btn2.equals(btn3) && btn1.length() > 0) {

				JOptionPane.showMessageDialog(null, "winner: XXX ");

				System.exit(0);

				break;

			}

		}

		boolean empty = false;

		for (int i = 0; i < boxes.length; i++) {

			if (boxes[i].getText().equals(""))

				empty = true;

		}

		if (!empty) {

			JOptionPane.showMessageDialog(null, "draw");

			System.exit(0);

		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public String turn(String currentTurn) {
		if (currentTurn.equals("X")) {
			return "O";
		} else
			return "X";
	}

	static String cturn = "X";

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 191, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				b1.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b1.setBounds(0, 0, 60, 51);
		frame.getContentPane().add(b1);

		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b2.setBounds(61, 0, 60, 51);
		frame.getContentPane().add(b2);

		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b3.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b3.setBounds(120, 0, 60, 51);
		frame.getContentPane().add(b3);

		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b4.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b4.setBounds(0, 47, 60, 51);
		frame.getContentPane().add(b4);

		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b5.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b5.setBounds(61, 47, 60, 51);
		frame.getContentPane().add(b5);

		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b6.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b6.setBounds(120, 47, 60, 51);
		frame.getContentPane().add(b6);

		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b7.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b7.setBounds(0, 96, 60, 51);
		frame.getContentPane().add(b7);

		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b8.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b8.setBounds(61, 96, 60, 51);
		frame.getContentPane().add(b8);

		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b9.setText(cturn);
				cturn = turn(cturn);
				check();
			}
		});
		b9.setBounds(120, 96, 60, 51);
		frame.getContentPane().add(b9);

	}
}
