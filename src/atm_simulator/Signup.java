package atm_simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {

	private JLabel l1, l2, l3, l4, l5, l6, l7, l10, l11, l12, l13, l14, l15, l16;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
	private JRadioButton r1, r2, r3, r4, r5;
	private JDateChooser dateChooser;
	private JButton b1, b2;

	public int random() {
		Random random = new Random();
		long first4 = (random.nextLong() % 9000L) + 1000L;
		int first = (int) Math.abs(first4);
		return first;
	}

	public Signup() throws NullPointerException {

		l1 = new JLabel("   APPLICATION FORM NO " + random());
		l1.setFont(new Font("Dialog", Font.BOLD, 35));
		l1.setBounds(86, -18, 554, 97);
		getContentPane().add(l1);

		l7 = new JLabel("*Kindly note down Form no.");
		l7.setFont(new Font("Osward", Font.BOLD, 15));
		l7.setBounds(258, 39, 210, 40);
		getContentPane().add(l7);

		l2 = new JLabel("Page 1: Personal Details");
		l2.setFont(new Font("Osward", Font.BOLD, 15));
		l2.setBounds(268, 62, 183, 52);
		getContentPane().add(l2);

		l3 = new JLabel("First Name:");
		l3.setFont(new Font("Osward", Font.BOLD, 15));
		l3.setBounds(12, 127, 85, 52);
		getContentPane().add(l3);

		l4 = new JLabel("Last Name:");
		l4.setFont(new Font("Osward", Font.BOLD, 15));
		l4.setBounds(373, 127, 85, 52);
		getContentPane().add(l4);

		l5 = new JLabel("Father Name:");
		l5.setFont(new Font("Osward", Font.BOLD, 15));
		l5.setBounds(8, 188, 101, 52);
		getContentPane().add(l5);

		l6 = new JLabel("Date Of Birth:");
		l6.setFont(new Font("Osward", Font.BOLD, 15));
		l6.setBounds(12, 253, 97, 52);
		getContentPane().add(l6);

		l10 = new JLabel("Gender:");
		l10.setFont(new Font("Osward", Font.BOLD, 15));
		l10.setBounds(12, 300, 64, 52);
		getContentPane().add(l10);

		l11 = new JLabel("Email Address:");
		l11.setFont(new Font("Osward", Font.BOLD, 15));
		l11.setBounds(12, 356, 118, 52);
		getContentPane().add(l11);

		l12 = new JLabel("Marital Status:");
		l12.setFont(new Font("Osward", Font.BOLD, 15));
		l12.setBounds(12, 408, 107, 52);
		getContentPane().add(l12);

		l13 = new JLabel("Address:");
		l13.setFont(new Font("Osward", Font.BOLD, 15));
		l13.setBounds(12, 459, 113, 52);
		getContentPane().add(l13);

		l14 = new JLabel("City:");
		l14.setFont(new Font("Osward", Font.BOLD, 15));
		l14.setBounds(12, 518, 40, 52);
		getContentPane().add(l14);

		l15 = new JLabel("Pincode:");
		l15.setFont(new Font("Osward", Font.BOLD, 15));
		l15.setBounds(12, 579, 97, 52);
		getContentPane().add(l15);

		l16 = new JLabel("State:");
		l16.setFont(new Font("Osward", Font.BOLD, 15));
		l16.setBounds(12, 639, 47, 52);
		getContentPane().add(l16);

		tf1 = new JTextField(15);
		tf1.setBounds(109, 135, 250, 40);
		getContentPane().add(tf1);

		tf2 = new JTextField(15);
		tf2.setBounds(463, 134, 250, 40);
		getContentPane().add(tf2);

		tf3 = new JTextField(15);
		tf3.setBounds(137, 195, 576, 40);
		getContentPane().add(tf3);

		tf4 = new JTextField(15);
		tf4.setBounds(137, 363, 576, 40);
		getContentPane().add(tf4);

		tf5 = new JTextField(15);
		tf5.setBounds(137, 646, 576, 40);
		getContentPane().add(tf5);

		tf6 = new JTextField(15);
		tf6.setBounds(137, 526, 576, 40);
		getContentPane().add(tf6);

		tf7 = new JTextField(15);
		tf7.setBounds(137, 586, 576, 40);
		getContentPane().add(tf7);

		tf8 = new JTextField(15);
		tf8.setBounds(137, 466, 576, 40);
		getContentPane().add(tf8);

		r1 = new JRadioButton();
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r1.isSelected()) {
					r2.setSelected(false);
				}
			}
		});
		r1.setBackground(Color.WHITE);
		r1.setText("Female");
		r1.setBounds(382, 315, 70, 25);
		getContentPane().add(r1);

		r2 = new JRadioButton("Male");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r2.isSelected()) {
					r1.setSelected(false);
				}
			}
		});
		r2.setBackground(Color.WHITE);
		r2.setBounds(195, 315, 75, 25);
		getContentPane().add(r2);

		r3 = new JRadioButton();
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r3.isSelected()) {
					r4.setSelected(false);
					r5.setSelected(false);
				}
			}
		});
		r3.setBackground(Color.WHITE);
		r3.setText("Married");
		r3.setBounds(195, 423, 85, 25);
		getContentPane().add(r3);

		r4 = new JRadioButton();
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r4.isSelected()) {
					r3.setSelected(false);
					r5.setSelected(false);
				}
			}
		});
		r4.setBackground(Color.WHITE);
		r4.setText("Unmarried");
		r4.setBounds(355, 423, 97, 25);
		getContentPane().add(r4);

		r5 = new JRadioButton();
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r5.isSelected()) {
					r3.setSelected(false);
					r4.setSelected(false);
				}
			}
		});
		r5.setBackground(Color.WHITE);
		r5.setText("Other");
		r5.setBounds(515, 423, 64, 25);
		getContentPane().add(r5);

		b1 = new JButton("Next");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.setBounds(589, 699, 124, 41);
		getContentPane().add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		b2.setBounds(416, 699, 124, 41);
		getContentPane().add(b2);

		dateChooser = new JDateChooser();
		dateChooser.setCalendar(Calendar.getInstance());
		dateChooser.setBounds(137, 265, 336, 40);
		dateChooser.setBackground(Color.WHITE);
		getContentPane().add(dateChooser);

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setSize(800, 800);
		setLocation(300, 50);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String fname = tf1.getText();
		String lname = tf2.getText();
		String fathern = tf3.getText();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(dateChooser.getDate());

		String gender = null;
		if (r2.isSelected()) {
			gender = "Male";
		} else if (r1.isSelected()) {
			gender = "Female";
		}

		String email = tf4.getText();

		String martial = null;
		if (r3.isSelected()) {
			martial = "Married";

		} else if (r4.isSelected()) {
			martial = "Unmarried";

		} else if (r5.isSelected()) {
			martial = "Other";

		}

		String Addr = tf8.getText();
		String city = tf6.getText();
		String pin = tf7.getText();
		String state = tf5.getText();

		if (e.getSource() == b1) {

			try {

				if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()
						|| tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty()
						|| tf7.getText().isEmpty() || tf8.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fill all the required fields");
					new Signup2().setVisible(false);
					setVisible(true);

				} else {
					Conn conn = new Conn();
					String q1 = "INSERT INTO SIGNUP VALUES('" + random() + "','" + fname + "','" + lname + "','"
							+ fathern + "','" + date + "','" + gender + "','" + email + "','" + martial + "','" + Addr
							+ "','" + city + "','" + state + "','" + pin + "')";
					Conn.pstnt = Conn.con.prepareStatement(q1);
					int x = Conn.pstnt.executeUpdate();
					new Signup2().setVisible(true);
					setVisible(false);
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource() == b2) {
			new Login().setVisible(true);
			setVisible(false);
		}

	}
}
