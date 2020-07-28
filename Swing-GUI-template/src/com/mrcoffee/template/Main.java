package com.mrcoffee.template;

import java.awt.Color;

import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		Template tmp = new Template();
		
		JPanel p0 = new JPanel();
		p0.setBackground(Color.BLUE);
		tmp.addComp(p0, null, 0, 0, 2, 1, 5, 5, 1, 1, 0, 11);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.RED);
		tmp.addComp(p1, null, 2, 0, 1, 1, 5, 5, 1, 1, 1, 12);
		
		JPanel p15 = new JPanel();
		tmp.addComp(p15, null, 1, 0, 1, 1, 5, 5, 1, 1, 0, 13);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.YELLOW);
		tmp.addComp(p2, null, 0, 2, 1, 1, 5, 5, 1, 1, 2, 14);
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.GREEN);
		tmp.addComp(p3, null, 1, 2, 2, 1, 5, 5, 1, 1, 3, 15);
		
	}
}
