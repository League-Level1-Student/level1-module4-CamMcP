package _01_nasty_surprise;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

public class Nasty {
	
public static void main(String[] args) {	
JButton A = new JButton();
JButton B = new JButton();

JFrame AA = new JFrame();
JPanel Hold = new JPanel();

JLabel a = new JLabel();
JLabel b = new JLabel();

a.setText("Trick");
b.setText("Treat");

A.add(a);
B.add(b);

Hold.add(A);
Hold.add(B);
AA.add(Hold);
AA.setVisible(true);
AA.setSize(100, 100);
}

}