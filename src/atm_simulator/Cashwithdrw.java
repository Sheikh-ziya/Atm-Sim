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
import javax.swing.JTextField;

public class Cashwithdrw extends JFrame implements ActionListener{
	

	private JLabel l1,l2;
	private JTextField tf1;
	private JButton b1,b2,b3;
	
	public Cashwithdrw() {
		l1 = new JLabel("     Maximum Daily Withdrawal is 10,000 Only");
		l1.setFont(new Font("Osward", Font.BOLD, 30));
		l1.setBounds(12, 45, 708, 89);
		getContentPane().add(l1);
		
		l2 = new JLabel("Please Enter the Amount");
		l2.setFont(new Font("Osward", Font.BOLD, 30));
		l2.setBounds(177, 147, 362, 59);
		getContentPane().add(l2);
		
		tf1 = new JTextField(15);
		tf1.setBounds(130, 252, 496, 50);
		getContentPane().add(tf1);
		
		b1 = new JButton("Withdrawn");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(130, 355, 195, 51);
		getContentPane().add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(431, 355, 195, 51);
		getContentPane().add(b2);

		b3 = new JButton("EXIT");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		b3.setBounds(285, 480, 195, 51);
		getContentPane().add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setSize(750, 750);
		setLocation(300, 50);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String amnt=(tf1.getText());
		if(e.getSource()==b1)
		{
			if(tf1.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Enter the amount");
			}
			else{
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
		}
		if(e.getSource()==b2)
		{
			new Transaction().setVisible(true);
			setVisible(false);
		}
		if(e.getSource()==b3)
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
