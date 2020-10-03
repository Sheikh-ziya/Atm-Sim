package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Transaction extends JFrame implements ActionListener {

	private  JLabel l1;
	private JButton b1, b2, b3, b4, b5, b6, b7;

	public Transaction() {

		l1 = new JLabel("Please Select Your Transaction");
		l1.setFont(new Font("Osward", Font.BOLD, 30));
		l1.setBounds(170, 60, 457, 94);
		getContentPane().add(l1);

		b1 = new JButton("DEPOSIT");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(50, 208, 279, 51);
		getContentPane().add(b1);

		b2 = new JButton("CASH WITHDRAWAL");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(450, 208, 279, 51);
		getContentPane().add(b2);

		b3 = new JButton("FAST CASH");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		b3.setBounds(50, 320, 279, 51);
		getContentPane().add(b3);

		b4 = new JButton("MINI STATEMENT");
		b4.setFont(new Font("Raleway", Font.BOLD, 20));
		b4.setBackground(Color.black);
		b4.setForeground(Color.WHITE);
		b4.setBounds(450, 320, 279, 51);
		getContentPane().add(b4);

		b5 = new JButton("PIN CHANGE");
		b5.setFont(new Font("Raleway", Font.BOLD, 20));
		b5.setBackground(Color.black);
		b5.setForeground(Color.WHITE);
		b5.setBounds(50, 435, 279, 51);
		getContentPane().add(b5);

		b6 = new JButton("BALANCE ENQUIRY");
		b6.setFont(new Font("Raleway", Font.BOLD, 20));
		b6.setBackground(Color.black);
		b6.setForeground(Color.WHITE);
		b6.setBounds(450, 435, 279, 51);
		getContentPane().add(b6);

		b7 = new JButton("EXIT");
		b7.setFont(new Font("Raleway", Font.BOLD, 20));
		b7.setBackground(Color.black);
		b7.setForeground(Color.WHITE);
		b7.setBounds(248, 550, 279, 51);
		getContentPane().add(b7);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);

		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 800);
		setLocation(300, 50);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
				new Deposit().setVisible(true);
				setVisible(false);
		}

		if (e.getSource() == b2) {
			new Cashwithdrw().setVisible(true);
			setVisible(false);
		}

		if (e.getSource() == b3) {
			new Fastcash().setVisible(true);
			setVisible(false);
		}

		if (e.getSource() == b4) {
			new MiniState().setVisible(true);
			setVisible(false);
		}

		if (e.getSource() == b5) {
			new Pin().setVisible(true);
			setVisible(false);
		}

		if (e.getSource() == b6) {
			String pin=JOptionPane.showInputDialog("Enter your pin");
			Conn conn=new Conn();
			String q3="SELECT * FROM BANK WHERE PIN='"+pin+"'ORDER BY BALANCE DESC ";
			try {
				Conn.pstnt=Conn.con.prepareStatement(q3);
				ResultSet res=Conn.pstnt.executeQuery();
				if(res.next())
				{
					String bal=res.getString("Balance");
					JOptionPane.showMessageDialog(null, "Balance= "+bal);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		if (e.getSource() == b7) {
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
