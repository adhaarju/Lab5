package com.swinnng;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExample {
	public static void main(String[] args) {
		JFrame j = new JFrame("Swing Component Example");
		j.setSize(400, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("What is your name??");
		JTextField textField =new JTextField(15);
		JButton button = new JButton("Done");
		 panel.add(label);
		 panel.add(textField);
		 panel.add(button);
		 j.add(panel);
		 j.setVisible(true);
	}
}
