package q6_answer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class uniquee {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					uniquee window = new uniquee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public uniquee() {
		initialize();
	}

	private JFrame frame;
	private JTextField txtName;
	public ArrayList<String> Names = new ArrayList<String>();

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Name:");
		JButton btnNext = new JButton("Next");
		txtName = new JTextField();
		JButton btnFinished = new JButton("Finished");
		btnFinished.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame listFrame;
				listFrame = new JFrame();
				listFrame.setBounds(100, 100, 300, 300);
				listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				listFrame.getContentPane().setLayout(null);
				DefaultListModel<String> nameModel = new DefaultListModel<String>();

				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 264, 239);
				listFrame.getContentPane().add(scrollPane);

				JList listNames = new JList();
				scrollPane.setViewportView(listNames);
				for (String name : Names) {
					nameModel.addElement(name);
				}

				listNames.setModel(nameModel);
				listFrame.setVisible(true);
			}
		});

		txtName.setBounds(95, 58, 86, 20);
		btnNext.setBounds(191, 57, 71, 23);
		lblName.setBounds(39, 61, 46, 14);
		btnFinished.setBounds(272, 57, 89, 23);

		frame.getContentPane().add(lblName);
		frame.getContentPane().add(txtName);
		frame.getContentPane().add(btnFinished);
		frame.getContentPane().add(btnNext);

		JList list = new JList();
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!(txtName.getText().contains(" ")) && !(txtName.getText().equals(""))
						&& !(Names.contains(txtName.getText()))) {
					Names.add(txtName.getText());
				} else
					JOptionPane.showMessageDialog(null, "Can not contain the same, empty or empty data");
			}
		});

	}
}
