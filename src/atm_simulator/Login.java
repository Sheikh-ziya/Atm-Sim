package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private JLabel l1, l2, l3;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton b1, b2, b3,b4;

	public Login() throws HeadlessException {
		setTitle("                                                                    ATM SIMULATOR");

		l1 = new JLabel("Welcome To ATM");
		l1.setFont(new Font("Osward", Font.BOLD, 30));
		l1.setBounds(251, 28, 278, 210);
		getContentPane().add(l1);

		l2 = new JLabel("Card No:");
		l2.setFont(new Font("Raleway", Font.BOLD, 20));
		l2.setBounds(69, 211, 105, 61);
		getContentPane().add(l2);

		l3 = new JLabel("PIN:");
		l3.setFont(new Font("Raleway", Font.BOLD, 20));
		l3.setBounds(83, 326, 105, 61);
		getContentPane().add(l3);

		tf1 = new JTextField(15);
		tf1.setBounds(199, 219, 400, 50);
		getContentPane().add(tf1);

		pf1 = new JPasswordField(15);
		pf1.setBounds(200, 334, 400, 50);
		getContentPane().add(pf1);

		b1 = new JButton("Login");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(199, 432, 135, 51);
		getContentPane().add(b1);

		b2 = new JButton("Clear");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(464, 432, 135, 51);
		getContentPane().add(b2);

		b3 = new JButton("Sign up");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		b3.setBounds(199, 521, 135, 51);
		getContentPane().add(b3);
		
		b4 = new JButton("EXIT");
		b4.setFont(new Font("Raleway", Font.BOLD, 20));
		b4.setBackground(Color.black);
		b4.setForeground(Color.WHITE);
		b4.setBounds(464, 521, 135, 51);
		getContentPane().add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setSize(750, 750);
		setLocation(300, 50);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {
			try {
				Conn conn = new Conn();
				String a = tf1.getText();
				char[] pass = pf1.getPassword();
				String b = new String(pass);
				String q = "SELECT * FROM LOGIN WHERE CARDNO='" + a + "' AND PASS='" + b + "'";
				conn.pstnt = conn.con.prepareStatement(q);
				Conn.res = Conn.pstnt.executeQuery();
				if (Conn.res.next()) {
					new Transaction().setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Card No or PIN");
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ae.getSource() == b2) {
			tf1.setText("");
			pf1.setText("");
		}
		if (ae.getSource() == b3) {
			new Signup().setVisible(true);
			setVisible(false);
		}
		if(ae.getSource()==b4)
		{
			try {
				Conn.con.close();
				Conn.pstnt.close();
				Conn.res.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(EXIT_ON_CLOSE);
		}
	}
}
