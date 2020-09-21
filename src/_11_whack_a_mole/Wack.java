package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Wack {
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		for (int i = 0; i < 18; i++) {
			panel.add(new JButton());
		}
		frame.add(panel);
		frame.setSize(150, 150);
		frame.setVisible(true);
	}
}
