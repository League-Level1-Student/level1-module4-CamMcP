package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class calculate implements Runnable, ActionListener {
	int one = 0;
	int two = 0;
	int answer = 0;
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);

	public void run() {

		panel.add(text1);
		panel.add(text2);
		add.setText("Addition");
		sub.setText("Subtraction");
		mul.setText("Multiplacation");
		div.setText("Division");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		add.setSize(50, 50);
		sub.setSize(50, 50);
		mul.setSize(50, 50);
		div.setSize(50, 50);
		frame.add(panel);
		frame.setSize(650, 75);
		frame.setVisible(true);
	}

	public void addition() {
		answer = one + two;
	}

	public void subtraction() {
		answer = one - two;
	}

	public void multiplacation() {
		answer = one * two;
	}

	public void division() {
		answer = one / two;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String num1 = text1.getText();
		one = Integer.parseInt(num1);
		String num2 = text2.getText();
		two = Integer.parseInt(num2);

		JButton buttonClicked = (JButton) arg0.getSource();
		if (buttonClicked == add) {
			addition();

		}

		if (buttonClicked == sub) {
			subtraction();

		}

		if (buttonClicked == mul) {
			multiplacation();

		}

		if (buttonClicked == div) {
			division();

		}
		label.setText(answer + "");
	}
}
