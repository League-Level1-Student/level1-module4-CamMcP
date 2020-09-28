package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.RandomAccess;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Wack implements ActionListener {
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		Random rand = new Random();
		int mole = rand.nextInt(19);
		for (int i = 0; i < 18; i++) {
			if (i == mole) {
				JButton button = new JButton("mole!");
				button.setSize(100, 100);
				button.addActionListener(this);
				panel.add(button);
			}
			else {
				JButton button = new JButton("     ");
				button.setSize(50, 50);
				button.addActionListener(this);
				panel.add(button);			
			}
		}
		frame.add(panel);
		frame.setSize(570, 100);
		frame.setVisible(true);		
}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) arg0.getSource();
		if(buttonClicked.getText().equals("mole!")){
		
	}
		else {
			System.out.println("You missed!");
}
	}
}
