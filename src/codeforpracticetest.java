import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class codeforpracticetest {
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
frame.pack();
}
}
