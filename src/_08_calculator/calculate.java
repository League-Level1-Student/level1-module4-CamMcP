package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class calculate implements Runnable {
	int one = 0;
	int two = 0;
	int answer = 0;
public static void main(String[] args) {
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	add.setText("Addition");
	sub.setText("Subtraction");
	mul.setText("Multiplacation");
	div.setText("Division");
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	add.setSize(50, 50);
	sub.setSize(50, 50);
	mul.setSize(50, 50);
	div.setSize(50, 50);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
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
public void run() {
	// TODO Auto-generated method stub
	
}
}

