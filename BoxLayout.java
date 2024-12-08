package com.swinnng;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayout extends JFrame {
	JButton btn[]; 
	
	public static void name(String[] args) {
		
	
	
	for(int i = 0;i<5;i++){
		btn[i] = new JButton("Button" + (i + 1));
		add(btn[i]);
	}
	}

	setLayout(new BoxLayout(this,BoxLayout_Axis));
	setSize(400,400);
	setVisible(true);
}

}
