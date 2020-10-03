package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fastcash extends JFrame implements ActionListener {

	private JLabel l1;
	private JButton b1, b2, b3, b4, b5, b6, b7;

	public Fastcash() {
		l1 = new JLabel("Select Your Amount");
		l1.setFont(new Font("Osward", Font.BOLD, 30));
		l1.setBounds(230, 80, 298, 89);
		getContentPane().add(l1);

		b1 = new JButton("100");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(83, 192, 205, 51);
		getContentPane().add(b1);

		b2 = new JButton("500");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(458, 192, 205, 51);
		getContentPane().add(b2);

		b3 = new JButton("1000");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		b3.setBounds(83, 309, 205, 51);
		getContentPane().add(b3);

		b4 = new JButton("2000");
		b4.setFont(new Font("Raleway", Font.BOLD, 20));
		b4.setBackground(Color.black);
		b4.setForeground(Color.WHITE);
		b4.setBounds(458, 309, 205, 51);
		getContentPane().add(b4);

		b5 = new JButton("10000");
		b5.setFont(new Font("Raleway", Font.BOLD, 20));
		b5.setBackground(Color.black);
		b5.setForeground(Color.WHITE);
		b5.setBounds(83, 420, 205, 51);
		getContentPane().add(b5);

		b6 = new JButton("20000");
		b6.setFont(new Font("Raleway", Font.BOLD, 20));
		b6.setBackground(Color.black);
		b6.setForeground(Color.WHITE);
		b6.setBounds(458, 420, 205, 51);
		getContentPane().add(b6);

		b7 = new JButton("EXIT");
		b7.setFont(new Font("Raleway", Font.BOLD, 20));
		b7.setBackground(Color.black);
		b7.setForeground(Color.WHITE);
		b7.setBounds(272, 536, 205, 51);
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
		setSize(750, 750);
		setLocation(300, 50);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String amnt=null;
		if (e.getSource() == b1) {
			amnt="100";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		if (e.getSource() == b2) {
			amnt="500";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == b3) {
			amnt="1000";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == b4) {
			amnt="2000";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == b5) {
			amnt="10000";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == b6) {
			amnt="20000";
			String pin=JOptionPane.showInputDialog("Enter your Pin:");
			String q1="SELECT * FROM BANK WHERE PIN='"+pin+"' ORDER BY BALANCE DESC ";
			try {
				Conn con=new Conn();
				Conn.pstnt=Conn.con.prepareStatement(q1);
				Conn.res=Conn.pstnt.executeQuery();
				if(Conn.res.next())
				{
					String p=Conn.res.getString("PIN");
					Double bal=(double) 0;
					if(p.equals(pin))
					{
						bal=Double.parseDouble(Conn.res.getString("BALANCE"));
						if(Double.parseDouble(amnt)>=bal) {
							JOptionPane.showMessageDialog(null, "Amount is invalid");
						}
						else {
							bal=bal-Double.parseDouble(amnt);
							String q2="INSERT INTO BANK VALUES('"+p+"','"+0.0+"','"+amnt+"','"+bal+"')";
							Conn.pstnt=Conn.con.prepareStatement(q2);
							Conn.pstnt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Rs: "+amnt+" Withdrawn sucessfully");
						}	
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter the valid Pin");
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
