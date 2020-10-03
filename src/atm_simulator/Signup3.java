package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Signup3 extends JFrame implements ActionListener {

	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
	private JTextField tf1;
	private JRadioButton r1, r2, r3, r4;
	private JCheckBox c1, c2, c3, c4, c5, c6, c7;
	private JButton b1, b2;

	
		Random ran = new Random();
		long first1 = (ran.nextLong() % 900000000L) + 5040936000000000L;
		long cardno = (long) Math.abs(first1);
		
	

	
		Random ran1 = new Random();
		long first2 = (ran.nextLong() % 9000L) + 1000L;
		long pinno = (long) Math.abs(first2);
		

	public Signup3() {

		l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Osward", Font.BOLD, 20));
		l1.setBounds(270, 12, 258, 52);
		getContentPane().add(l1);

		l2 = new JLabel("Form no:");
		l2.setFont(new Font("Osward", Font.BOLD, 15));
		l2.setBounds(607, 13, 70, 52);
		getContentPane().add(l2);

		l3 = new JLabel("Account type:");
		l3.setFont(new Font("Osward", Font.BOLD, 18));
		l3.setBounds(34, 82, 135, 52);
		getContentPane().add(l3);

		l4 = new JLabel("Card No:");
		l4.setFont(new Font("Osward", Font.BOLD, 18));
		l4.setBounds(34, 208, 135, 52);
		getContentPane().add(l4);

		l5 = new JLabel("XXXX-XXXX-XXXX-4586");
		l5.setFont(new Font("Osward", Font.BOLD, 18));
		l5.setBounds(293, 208, 258, 52);
		getContentPane().add(l5);

		l6 = new JLabel("(Your 16-Digit Card Number)");
		l6.setFont(new Font("Osward", Font.BOLD, 12));
		l6.setBounds(34, 234, 171, 52);
		getContentPane().add(l6);

		l7 = new JLabel("(Kindly note down your Card no. and Pin no. when it appears)");
		l7.setFont(new Font("Osward", Font.BOLD, 12));
		l7.setBounds(293, 234, 362, 52);
		getContentPane().add(l7);

		l8 = new JLabel("PIN:");
		l8.setFont(new Font("Osward", Font.BOLD, 18));
		l8.setBounds(34, 290, 135, 52);
		getContentPane().add(l8);

		l9 = new JLabel("XXXX");
		l9.setFont(new Font("Osward", Font.BOLD, 18));
		l9.setBounds(293, 290, 135, 52);
		getContentPane().add(l9);

		l10 = new JLabel("(4-Digit Password)");
		l10.setFont(new Font("Osward", Font.BOLD, 12));
		l10.setBounds(34, 314, 135, 52);
		getContentPane().add(l10);

		l11 = new JLabel("Service Required:");
		l11.setFont(new Font("Osward", Font.BOLD, 18));
		l11.setBounds(34, 379, 171, 52);
		getContentPane().add(l11);

		c1 = new JCheckBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setBackground(Color.WHITE);
		c1.setLocation(54, 431);
		c1.setSize(135, 34);
		c1.setText("ATM CARD");
		getContentPane().add(c1);

		c2 = new JCheckBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 15));
		c2.setBackground(Color.WHITE);
		c2.setLocation(54, 470);
		c2.setSize(151, 34);
		c2.setText("Mobile Banking");
		getContentPane().add(c2);

		c3 = new JCheckBox();
		c3.setFont(new Font("Tahoma", Font.BOLD, 15));
		c3.setBackground(Color.WHITE);
		c3.setLocation(293, 431);
		c3.setSize(190, 34);
		c3.setText("Internet Banking");
		getContentPane().add(c3);

		c4 = new JCheckBox();
		c4.setFont(new Font("Tahoma", Font.BOLD, 15));
		c4.setBackground(Color.WHITE);
		c4.setLocation(293, 470);
		c4.setSize(151, 34);
		c4.setText("Email Alerts");
		getContentPane().add(c4);

		c5 = new JCheckBox();
		c5.setFont(new Font("Tahoma", Font.BOLD, 15));
		c5.setBackground(Color.WHITE);
		c5.setLocation(54, 509);
		c5.setSize(135, 34);
		c5.setText("Cheque Book");
		getContentPane().add(c5);

		c6 = new JCheckBox();
		c6.setFont(new Font("Tahoma", Font.BOLD, 15));
		c6.setBackground(Color.WHITE);
		c6.setLocation(293, 509);
		c6.setSize(135, 34);
		c6.setText("E-Statement");
		getContentPane().add(c6);

		c7 = new JCheckBox();
		c7.setFont(new Font("Tahoma", Font.BOLD, 12));
		c7.setBackground(Color.WHITE);
		c7.setLocation(106, 586);
		c7.setSize(549, 34);
		c7.setText("I herby declare that the above enterd details correct to the best of my knowledge.");
		getContentPane().add(c7);

		r1 = new JRadioButton();
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r1.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
				}
			}
		});
		r1.setBackground(Color.WHITE);
		r1.setText("Savings Account");
		r1.setBounds(54, 125, 151, 34);
		getContentPane().add(r1);

		r2 = new JRadioButton();
		r2.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r2.isSelected()) {
					r1.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
				}
			}
		});
		r2.setBackground(Color.WHITE);
		r2.setText("Current Acoount");
		r2.setBounds(54, 164, 161, 25);
		getContentPane().add(r2);

		r3 = new JRadioButton();
		r3.setFont(new Font("Tahoma", Font.BOLD, 15));
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r3.isSelected()) {
					r2.setSelected(false);
					r1.setSelected(false);
					r4.setSelected(false);
				}
			}
		});
		r3.setBackground(Color.WHITE);
		r3.setText("Fixed Deposit Account");
		r3.setBounds(291, 130, 237, 25);
		getContentPane().add(r3);

		r4 = new JRadioButton();
		r4.setFont(new Font("Tahoma", Font.BOLD, 15));
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r4.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r1.setSelected(false);
				}
			}
		});
		r4.setBackground(Color.WHITE);
		r4.setText("Recurring Deposit Account");
		r4.setBounds(291, 164, 242, 25);
		getContentPane().add(r4);

		tf1 = new JTextField(15);
		tf1.setBounds(673, 23, 85, 34);
		getContentPane().add(tf1);

		b1 = new JButton("Submit");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(566, 681, 124, 41);
		getContentPane().add(b1);

		b2 = new JButton("Cancel");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(404, 681, 124, 41);
		getContentPane().add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 800);
		setLocation(300, 50);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String fno = tf1.getText();

		String accType = null;
		if (r1.isSelected()) {
			accType = "Savings Account";
		} else if (r2.isSelected()) {
			accType = "Current Acoount";
		} else if (r3.isSelected()) {
			accType = "Fixed Deposit Account";
		} else if (r4.isSelected()) {
			accType = "Recurring Deposit Account";
		}

		String service = "";
		if (c1.isSelected()) {
			service = service + "ATM CARD";
		} 
		if (c2.isSelected()) {
			service =service + "," + "Mobile Banking";
		} 
		if (c3.isSelected()) {
			service =service +"," + "Internet Banking";
		} 
		if (c4.isSelected()) {
			service =service + "," + "Email Alerts";
		} 
		if (c5.isSelected()) {
			service =service +"," + "Cheque Book";
		} 
		if (c6.isSelected()) {
			service =service + "," + "E-Statement";
		}
		if(c7.isSelected()) {
			if (e.getSource() == b1) {
				try {
					if ( fno.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Fill all the required fields");
				} else {
					Conn conn = new Conn();
					String q1 = "INSERT INTO SIGNUP3 VALUES('" + fno + "','" + accType + "','" + cardno + "','" + pinno
							+ "','" + service + "')";
					String q2 = "INSERT INTO LOGIN VALUES('" + cardno + "','" + pinno + "')";
					String q3 = "INSERT INTO BANK VALUES('" + pinno + "','"+0.0+"','"+0.0+"','"+0.0+"')";
					
						Conn.pstnt = Conn.con.prepareStatement(q1);
						Conn.pstnt.executeUpdate();
						Conn.pstnt = Conn.con.prepareStatement(q2);
						Conn.pstnt.executeUpdate();
						Conn.pstnt = Conn.con.prepareStatement(q3);
						Conn.pstnt.executeUpdate();
						JOptionPane.showMessageDialog(null, "Card no: "+cardno+"\n Pin: "+pinno);
						
						new Deposit().setVisible(true);
						setVisible(false);
						
				}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			
		}
		
		if(e.getSource()==b2) {
			System.exit(EXIT_ON_CLOSE);
		}
		}

	}

