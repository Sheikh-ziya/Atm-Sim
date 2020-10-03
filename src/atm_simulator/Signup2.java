package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener {

	private JLabel  l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	private JComboBox c1, c2, c3, c4, c5;
	private JTextField tf1, tf2, tf3;
	private JRadioButton r1, r2, r3, r4;
	private JButton b1, b2;
	int fno;

	public Signup2() {

		l2 = new JLabel("Page 2: Additional Details");
		l2.setFont(new Font("Osward", Font.BOLD, 20));
		l2.setBounds(270, 12, 258, 52);
		getContentPane().add(l2);

		l3 = new JLabel("Religion:");
		l3.setFont(new Font("Osward", Font.BOLD, 15));
		l3.setBounds(34, 82, 85, 52);
		getContentPane().add(l3);

		l4 = new JLabel("Category:");
		l4.setFont(new Font("Osward", Font.BOLD, 15));
		l4.setBounds(34, 149, 85, 52);
		getContentPane().add(l4);

		l5 = new JLabel("Income:");
		l5.setFont(new Font("Osward", Font.BOLD, 15));
		l5.setBounds(34, 214, 85, 52);
		getContentPane().add(l5);

		l6 = new JLabel("Education:");
		l6.setFont(new Font("Osward", Font.BOLD, 15));
		l6.setBounds(34, 283, 85, 52);
		getContentPane().add(l6);

		l7 = new JLabel("Occupation:");
		l7.setFont(new Font("Osward", Font.BOLD, 15));
		l7.setBounds(34, 350, 114, 52);
		getContentPane().add(l7);

		l8 = new JLabel("PAN Number:");
		l8.setFont(new Font("Osward", Font.BOLD, 15));
		l8.setBounds(34, 416, 114, 52);
		getContentPane().add(l8);

		l9 = new JLabel("Aadhar Number:");
		l9.setFont(new Font("Osward", Font.BOLD, 15));
		l9.setBounds(34, 483, 124, 52);
		getContentPane().add(l9);

		l10 = new JLabel("Senior Citizen:");
		l10.setFont(new Font("Osward", Font.BOLD, 15));
		l10.setBounds(34, 542, 124, 52);
		getContentPane().add(l10);

		l11 = new JLabel("Existing Account:");
		l11.setFont(new Font("Osward", Font.BOLD, 15));
		l11.setBounds(34, 627, 132, 52);
		getContentPane().add(l11);

		l12 = new JLabel("Form no:");
		l12.setFont(new Font("Osward", Font.BOLD, 15));
		l12.setBounds(607, 13, 70, 52);
		getContentPane().add(l12);

		tf1 = new JTextField(15);
		tf1.setBounds(171, 490, 520, 40);
		getContentPane().add(tf1);

		tf2 = new JTextField(15);
		tf2.setBounds(171, 423, 520, 40);
		getContentPane().add(tf2);

		tf3 = new JTextField(15);
		tf3.setBounds(673, 23, 85, 34);
		getContentPane().add(tf3);

		String[] religion = { "Muslim", "Hindu", "Sikh", "Christain", "Other" };
		c1 = new JComboBox(religion);
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway", Font.BOLD, 14));
		c1.setBounds(171, 88, 520, 40);
		getContentPane().add(c1);

		String[] catergory = { "General", "OBC", "SC", "ST", "Other" };
		c2 = new JComboBox(catergory);
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway", Font.BOLD, 14));
		c2.setBounds(171, 155, 520, 40);
		getContentPane().add(c2);

		String[] income = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
		c3 = new JComboBox(income);
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway", Font.BOLD, 14));
		c3.setBounds(171, 222, 520, 40);
		getContentPane().add(c3);

		String[] education = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other" };
		c4 = new JComboBox(education);
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway", Font.BOLD, 14));
		c4.setBounds(171, 289, 520, 40);
		getContentPane().add(c4);

		String[] occupation = { "Student", "Self-Employeed", "Salaried", "Business", "Retired", "Other" };
		c5 = new JComboBox(occupation);
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway", Font.BOLD, 14));
		c5.setBounds(171, 356, 520, 40);
		getContentPane().add(c5);

		r1 = new JRadioButton();
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r1.isSelected()) {
					r2.setSelected(false);
				}
			}
		});
		r1.setBackground(Color.WHITE);
		r1.setText("Yes");
		r1.setBounds(187, 557, 70, 25);
		getContentPane().add(r1);

		r2 = new JRadioButton();
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r2.isSelected()) {
					r1.setSelected(false);
				}
			}
		});
		r2.setBackground(Color.WHITE);
		r2.setText("No");
		r2.setBounds(364, 557, 70, 25);
		getContentPane().add(r2);

		r3 = new JRadioButton();
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r3.isSelected()) {
					r4.setSelected(false);
				}
			}
		});
		r3.setBackground(Color.WHITE);
		r3.setText("Yes");
		r3.setBounds(187, 642, 70, 25);
		getContentPane().add(r3);

		r4 = new JRadioButton();
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r4.isSelected()) {
					r3.setSelected(false);
				}
			}
		});
		r4.setBackground(Color.WHITE);
		r4.setText("No");
		r4.setBounds(364, 642, 70, 25);
		getContentPane().add(r4);

		b1 = new JButton("Next");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(567, 699, 124, 41);
		getContentPane().add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(415, 699, 124, 41);
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

		String fno = tf3.getText();
		String rel = (String) c1.getSelectedItem();
		String cat = (String) c2.getSelectedItem();
		String inc = (String) c3.getSelectedItem();
		String edu = (String) c4.getSelectedItem();
		String occ = (String) c5.getSelectedItem();

		String pan = tf1.getText();
		String ada = tf2.getText();

		String sen = null;
		if (r1.isSelected()) {
			sen = "Yes";
		} else if (r2.isSelected()) {
			sen = "No";
		}

		String acc_ex = null;
		if (r3.isSelected()) {
			acc_ex = "Yes";
		} else if (r4.isSelected()) {
			acc_ex = "No";
		}
		
		if (e.getSource() == b1) {
			try {
			if (tf1.getText().equals("") || tf2.getText().equals("") || tf3.getText().equals("")
					|| c1.getSelectedItem().equals("") || c2.getSelectedItem().equals("")
					|| c3.getSelectedItem().equals("") || c4.getSelectedItem().equals("")
					|| c5.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the required fields");
				new Signup3().setVisible(false);
				setVisible(true);

			}
			else {
					Conn con = new Conn();
					String q2 = "INSERT INTO SIGNUP2 VALUES('" + fno + "','" + rel + "','" + cat + "','" + inc + "','"
							+ edu + "','" + occ + "','" + pan + "','" + ada + "','" + sen + "','" + acc_ex + "')";
					Conn.pstnt = Conn.con.prepareStatement(q2);
					Conn.pstnt.executeUpdate();		
					
					new Signup3().setVisible(true);
					setVisible(false);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		 else if (e.getSource() == b2) {
			new Signup().setVisible(true);
			setVisible(false);
		}
	}

}
