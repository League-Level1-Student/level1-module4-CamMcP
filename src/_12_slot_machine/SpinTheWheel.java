package _12_slot_machine;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SpinTheWheel {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
public void run() {
	spin.setPreferredSize(new Dimension(750,75));
    spin.setFont(new Font("Comic Sans", Font.PLAIN, 85));
	spin.setText("S P I N");
	panel.add(spin);
	frame.add(panel);
	frame.setSize(750, 300);
	frame.setVisible(true);
}
}
