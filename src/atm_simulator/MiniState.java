package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class MiniState extends JFrame implements ActionListener {
	private JTable t1;
	private JScrollPane s1;
	private JButton b1,b2;

	public MiniState() {

		s1 = new JScrollPane();
		s1.setBounds(34, 85, 655, 579);
		getContentPane().add(s1);

		t1 = new JTable();
		t1.setBounds(334, 521, 135, 51);
		s1.setViewportView(t1);

		b1 = new JButton("Get Statement");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(137, 21, 185, 51);
		getContentPane().add(b1);
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(415, 21, 185, 51);
		getContentPane().add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setSize(750, 750);
		setLocation(300, 50);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			String pin = JOptionPane.showInputDialog("Enter Your Pin: ");
			String q1 = "SELECT DEPOSIT,WITHDRAW,BALANCE FROM BANK WHERE PIN='" + pin + "'";
			Conn conn = new Conn();
			try {
				Conn.pstnt = Conn.con.prepareStatement(q1);
				Conn.res = Conn.pstnt.executeQuery();
				if (Conn.res.next()) {
					t1.setModel(DbUtils.resultSetToTableModel(Conn.res));
				} else {
					JOptionPane.showMessageDialog(null, "Enter the valid PIN");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==b2){
			new Transaction().setVisible(true);
			setVisible(false);
		}
	}
}
