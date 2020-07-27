package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class L_A_U_G_H implements ActionListener{
public static void main(String[] args) {
makeButton();
}
private void makeButton() {
JFrame A = new JFrame();
A.setVisible(true);
JPanel AA = new JPanel();
JButton AAA = new JButton();
JButton AAAA = new JButton();
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
	// TODO Auto-generated method stub
	
}
}
