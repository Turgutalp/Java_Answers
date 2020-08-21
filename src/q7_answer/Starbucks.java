package q7_answer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Starbucks extends JFrame {

	private JFrame frmStarbucks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Starbucks window = new Starbucks();
					window.frmStarbucks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Starbucks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	class ComboItem {
		private String key;
		private String value;

		public ComboItem(String key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return key;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
	}

	static int totalcost = 0;

	private void initialize() {
		frmStarbucks = new JFrame();
		frmStarbucks.setTitle("Starbucks");
		frmStarbucks.setBounds(100, 100, 450, 200);
		frmStarbucks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarbucks.getContentPane().setLayout(null);

		JComboBox coffeetype = new JComboBox();
		coffeetype.setBounds(10, 10, 170, 20);
		frmStarbucks.getContentPane().add(coffeetype);
		coffeetype.addItem(new ComboItem("Latte - 8TL", "8"));
		coffeetype.addItem(new ComboItem("Machiato - 13TL", "13"));
		coffeetype.addItem(new ComboItem("Coffee - 5TL", "5"));
		JRadioButton vanillard = new JRadioButton("Vanilla - 2TL");
		vanillard.setBounds(6, 37, 83, 20);
		frmStarbucks.getContentPane().add(vanillard);

		JRadioButton mintrd = new JRadioButton("Mint - 2TL");
		mintrd.setBounds(90, 40, 80, 20);
		frmStarbucks.getContentPane().add(mintrd);

		JRadioButton creamrd = new JRadioButton("Cream - 1TL");
		creamrd.setBounds(180, 40, 110, 20);
		frmStarbucks.getContentPane().add(creamrd);

		ButtonGroup bg = new ButtonGroup();
		bg.add(creamrd);
		bg.add(mintrd);
		bg.add(vanillard);
		JCheckBox donutcb = new JCheckBox("Donut - 11TL");
		donutcb.setBounds(10, 60, 100, 20);
		frmStarbucks.getContentPane().add(donutcb);

		JCheckBox sandwichcb = new JCheckBox("Sandwich - 9TL");
		sandwichcb.setBounds(130, 60, 100, 20);
		frmStarbucks.getContentPane().add(sandwichcb);

		JCheckBox cheesecakecb = new JCheckBox("Cheesecake - 15TL");
		cheesecakecb.setBounds(240, 60, 120, 20);
		frmStarbucks.getContentPane().add(cheesecakecb);

		JButton checkoutbtn = new JButton("Check Out");
		checkoutbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame ordersframe;
				JTextField txttip;
				ordersframe = new JFrame();
				ordersframe.setTitle("Orders");
				ordersframe.setBounds(100, 100, 450, 210);
				ordersframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ordersframe.getContentPane().setLayout(null);

				JLabel lblOrders = new JLabel("<html>Orders Details:");
				lblOrders.setVerticalAlignment(SwingConstants.TOP);
				lblOrders.setBounds(10, 30, 240, 240);
				ordersframe.getContentPane().add(lblOrders);

				JLabel lblNewLabel_1 = new JLabel("Tip:");
				lblNewLabel_1.setBounds(10, 120, 30, 15);
				ordersframe.getContentPane().add(lblNewLabel_1);

				JLabel lblTotal = new JLabel("Total:");
				lblTotal.setBounds(60, 150, 50, 15);
				ordersframe.getContentPane().add(lblTotal);

				JButton btnPay = new JButton("Pay");
				btnPay.setBounds(170, 140, 90, 20);
				ordersframe.getContentPane().add(btnPay);

				txttip = new JTextField();
				txttip.setBounds(70, 120, 100, 20);
				ordersframe.getContentPane().add(txttip);
				ordersframe.setVisible(true);
				if (coffeetype.getSelectedIndex() == 0) {
					totalcost += 8;
					lblOrders.setText(lblOrders.getText() + "<br/>Coffee Type: Latte - 8TL");
				} else if (coffeetype.getSelectedIndex() == 0) {
					totalcost += 13;
					lblOrders.setText(lblOrders.getText() + "<br/>Coffee Type: Machiato - 13TL");
				} else {
					totalcost += 5;
					lblOrders.setText(lblOrders.getText() + "<br/>Coffee Type: Coffee - 5TL");
				}
				if (vanillard.isSelected()) {
					lblOrders.setText(lblOrders.getText() + "<br/>Flavour: Vanilla - 2TL");
					totalcost += 2;
				} else if (mintrd.isSelected()) {
					lblOrders.setText(lblOrders.getText() + "<br/>Flavour: Mint - 2TL");
					totalcost += 2;
				} else if (creamrd.isSelected()) {

					lblOrders.setText(lblOrders.getText() + "<br/>Flavour: Cream - 1TL");
					totalcost += 1;
				} else {
					lblOrders.setText(lblOrders.getText() + "<br/>Flavour: None(-)");
				}
				lblOrders.setText(lblOrders.getText() + "\nFood:");
				if (donutcb.isSelected()) {
					lblOrders.setText(lblOrders.getText() + " Donut - 11TL  ");
					totalcost += 11;
				}
				if (sandwichcb.isSelected()) {
					lblOrders.setText(lblOrders.getText() + " Sandwich - 9TL  ");
					totalcost += 11;
				}
				if (cheesecakecb.isSelected()) {
					lblOrders.setText(lblOrders.getText() + " Cheesecake - 15TL  ");
					totalcost += 11;
				}

				lblOrders.setText(lblOrders.getText() + "<br/> Total:" + totalcost + "</html>");
				txttip.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						try {
							int tip = Integer.parseInt(txttip.getText());
							if (tip <= 1) {
								JOptionPane.showMessageDialog(null, "Your coffee will be decaf!");
							}
							totalcost += tip;
							txttip.setEditable(false);
							txttip.setFocusable(false);
							btnPay.requestFocusInWindow();
							lblTotal.setText("Total :" + totalcost);
						} catch (NumberFormatException e) {
							System.out.println("You have entered incorrectly\n" + ": " + e.getMessage());
						}
					}
				});

				btnPay.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Runtime.getRuntime().exit(0);
					}
				});

			}
		});
		checkoutbtn.setBounds(10, 93, 100, 23);
		frmStarbucks.getContentPane().add(checkoutbtn);

		JButton clearbtn = new JButton("Clear");
		clearbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bg.clearSelection();
				coffeetype.setSelectedIndex(0);
				sandwichcb.setSelected(false);
				donutcb.setSelected(false);
				cheesecakecb.setSelected(false);
			}
		});
		clearbtn.setBounds(109, 93, 89, 23);
		frmStarbucks.getContentPane().add(clearbtn);

		JButton exitbtn = new JButton("Exit");
		exitbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Runtime.getRuntime().exit(0);
			}
		});
		exitbtn.setBounds(208, 93, 89, 23);
		frmStarbucks.getContentPane().add(exitbtn);

	}
}
