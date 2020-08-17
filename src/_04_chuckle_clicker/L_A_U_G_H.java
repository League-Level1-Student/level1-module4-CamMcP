package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.AALOAD;


public class L_A_U_G_H implements ActionListener{
	JButton AAA = new JButton();
	JButton AAAA = new JButton();
	public static void main(String[] args) {
new L_A_U_G_H().makeButton();
}
private void makeButton() {
JFrame A = new JFrame();
A.setVisible(true);
JPanel AA = new JPanel();
AAA.setText("Joke");
AAA.addActionListener(this);
AAAA.setText("Punchline");
AAAA.addActionListener(this);
AA.add(AAA);
AA.add(AAAA);
A.add(AA);
A.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton ButtonCLicked = (JButton) arg0.getSource();
	if (AAA == ButtonCLicked) {
		JOptionPane.showMessageDialog(null, "Hello!");
		JOptionPane.showMessageDialog(null, "What is the best part about Sweden?");
	}
	if (AAAA == ButtonCLicked) {
		JOptionPane.showMessageDialog(null, "I don't know, but the flag is a big plus.");
	}
}
}
