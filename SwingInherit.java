package com.swinnng;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingInherit extends JFrame {
	SwingInherit(){
		JButton b= new JButton("plss click meee...");
		b.setBounds(130, 100, 200, 40);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingInherit();

	}

}
