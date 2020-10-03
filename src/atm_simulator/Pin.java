package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Pin extends JFrame implements ActionListener {

	private JLabel l1, l2, l3, l4;
	private JTextField tf1, tf2, tf3;
	private JButton b1, b2,b3;

	public Pin() {
		l1 = new JLabel("Change Your PIN");
		l1.setFont(new Font("Osward", Font.BOLD, 30));
		l1.setBounds(267, 110, 363, 61);
		getContentPane().add(l1);

		l2 = new JLabel("Current PIN:");
		l2.setFont(new Font("Raleway", Font.BOLD, 20));
		l2.setBounds(52, 211, 122, 61);
		getContentPane().add(l2);

		l3 = new JLabel("New PIN:");
		l3.setFont(new Font("Raleway", Font.BOLD, 20));
		l3.setBounds(52, 284, 105, 61);
		getContentPane().add(l3);

		l4 = new JLabel("Re-Enter New PIN:");
		l4.setFont(new Font("Raleway", Font.BOLD, 20));
		l4.setBounds(52, 358, 186, 61);
		getContentPane().add(l4);

		tf1 = new JTextField(15);
		tf1.setBounds(230, 219, 400, 50);
		getContentPane().add(tf1);

		tf2 = new JTextField(15);
		tf2.setBounds(230, 292, 400, 50);
		getContentPane().add(tf2);

		tf3 = new JTextField(15);
		tf3.setBounds(230, 358, 400, 50);
		getContentPane().add(tf3);

		b1 = new JButton("Submit");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(230, 497, 135, 51);
		getContentPane().add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(495, 497, 135, 51);
		getContentPane().add(b2);
		
		b3 = new JButton("Clear");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		b3.setBounds(364, 582, 135, 51);
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
		if (e.getSource() == b1) {
			String cpin = tf1.getText();
			String npin = tf2.getText();
			String rnpin = tf3.getText();

			if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Fill all the Fields");
			} else {
				if (npin.equals(rnpin)) {
					String q1 = "UPDATE BANK SET PIN='" + npin + "' WHERE PIN='" + cpin + "'";
					String q2 = "UPDATE LOGIN SET PASS='" + npin + "' WHERE PASS='" + cpin + "'";
					String q3 = "UPDATE SIGNUP3 SET PINNO='" + npin + "' WHERE PINNO='" + cpin + "'";
					Conn conn = new Conn();
					try {
						Conn.pstnt = Conn.con.prepareStatement(q1);
						Conn.pstnt.executeUpdate();
						Conn.pstnt = Conn.con.prepareStatement(q2);
						Conn.pstnt.executeUpdate();
						Conn.pstnt = Conn.con.prepareStatement(q3);
						int x = Conn.pstnt.executeUpdate();
						if (x > 0) {
							JOptionPane.showMessageDialog(null, "PIN Changed Succesfully");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}

		}

		if (e.getSource() == b2) {
			new Transaction().setVisible(true);
			setVisible(false);
		}
		
		if (e.getSource() == b3) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}

	}

}
