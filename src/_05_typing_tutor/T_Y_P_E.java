package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class T_Y_P_E implements KeyListener {
	char currentLetter;
	JFrame B = new JFrame();
	JLabel label = new JLabel();
public static void main(String[] args) {
	
	new T_Y_P_E().currentMethod();
	

	
}
public void currentMethod() {
	B.setSize(350, 250);
	B.setName("type or perish");
	B.setVisible(true);
	currentLetter = generateRandomLetter();
	B.add(label);
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(50.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	B.addKeyListener(this);
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println(arg0.getKeyChar());
	if (currentLetter == arg0.getKeyChar()) {
		System.out.println("Correct!");
		B.setBackground(Color.GREEN);
	}
	else {
		System.out.println("Incorrect");
		B.setBackground(Color.RED);
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
