import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class codeforpracticetest implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JTextField text = new JTextField(20);
	public void run() {
frame.setVisible(true);
frame.add(panel);
panel.add(label);
panel.add(button1);
panel.add(button2);
panel.add(text);
label.setText("What month of the year has 28 days?");
button1.setText("Hint");
button2.setText("Submit answer");
button1.addActionListener(this);
button2.addActionListener(this);
frame.pack();
}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (button1 == arg0.getSource()) {
				JOptionPane.showMessageDialog(null, "Think big");
		}
		else if (button2 == arg0.getSource()) {
		if (text.getText().equals("all of them")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			System.exit(0);
		}	
		else {
			JOptionPane.showMessageDialog(null, "You are incorrect");
			System.exit(0);
		}
		}
	}
}
