package com.swinnng;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SecondSwing {
	JFrame f;
 SecondSwing(){
	f=new JFrame();
	JButton b= new JButton("click meee..");
	b.setBounds(130, 100, 100, 40);
	f.add(b);
	f.setSize(400, 500);
	f.setLayout(null);
	f.setVisible(true);
}

public static void main(String[] args)
{
	new SecondSwing();
}
}