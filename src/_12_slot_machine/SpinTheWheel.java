package _12_slot_machine;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SpinTheWheel implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel label = new JLabel();
	JLabel Label = new JLabel();
	JLabel LAbel = new JLabel();
	Random rand = new Random();
public void run() throws MalformedURLException {
	spin.setPreferredSize(new Dimension(5000,75));
    spin.setFont(new Font("Arial", Font.PLAIN, 85));
	spin.setText("S P I N");
	spin.addActionListener(this);
	panel.add(spin);
	frame.add(panel);
	frame.setSize(1300, 1000);
	frame.setVisible(true);
	label = createLabelImage("cherry.png");
	panel.add(label);
	Label = createLabelImage("orange.png");
	panel.add(Label);
	LAbel = createLabelImage("lemon1.png");
	panel.add(LAbel);
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent arg0){
	// TODO Auto-generated method stub
	panel.remove(label);
	panel.remove(Label);
	panel.remove(LAbel);
	frame.pack();
	int image = rand.nextInt(3);
	int Image = rand.nextInt(3);
	int IMage = rand.nextInt(3);
	if (image == 0) {
		try {
			label = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(label);
	}
	if (image == 1) {
		try {
			label = createLabelImage("lemon1.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(label);
	}
	if (image == 2) {
		try {
			label = createLabelImage("orange.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(label);
	}
	if (Image == 0) {
		try {
			Label = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(Label);
	}
	if (Image == 1) {
		try {
			Label = createLabelImage("lemon1.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(Label);
	}
	if (Image == 2) {
		try {
			Label = createLabelImage("orange.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(Label);
	}
	if (IMage == 0) {
		try {
			LAbel = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(LAbel);
	}
	if (IMage == 1) {
		try {
			LAbel = createLabelImage("lemon1.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(LAbel);
	}
	if (IMage == 2) {
		try {
			LAbel = createLabelImage("orange.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(LAbel);
	}
	if (image == 0 && Image == 0 & IMage == 0) {
		JOptionPane.showMessageDialog(null, "You win!");
		System.exit(0);
	}
	if (image == 1 && Image == 1 & IMage == 1) {
		JOptionPane.showMessageDialog(null, "You win!");
		System.exit(0);
	}
	if (image == 2 && Image == 2 & IMage == 2) {
		JOptionPane.showMessageDialog(null, "You win!");
		System.exit(0);
	}
}
}
