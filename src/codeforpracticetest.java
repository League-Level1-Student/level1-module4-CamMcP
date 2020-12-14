import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class codeforpracticetest {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JTextField text = new JTextField();
	public void run() {
frame.setVisible(true);
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(text);
}
}
