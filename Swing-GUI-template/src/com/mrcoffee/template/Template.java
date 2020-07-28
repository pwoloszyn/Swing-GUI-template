package com.mrcoffee.template;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Template {

	private JFrame frame;
	private JPanel pane;
	
	public Template() {
		init();
	}
	
	public void init() {
		frame = new JFrame("GUI template");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		
		pane = new JPanel();
		frame.add(pane);
		
		GridBagLayout gbl = new GridBagLayout();
		pane.setLayout(gbl);
		
		frame.setVisible(true);
	}
	
	public void addComp(JComponent cmp, Insets ins, int gridx, int gridy,
			int gridwidth, int gridheight, int ipadx, int ipady, 
			double weightx, double weighty, int fill, int anchor) {
		
		GridBagConstraints c = new GridBagConstraints();
		if(ins != null)
			c.insets = ins;
		if(fill < 4 && fill >= 0)
			c.fill = fill;
		if(anchor < 27 && anchor >= 10)
			c.anchor = anchor;
		c.gridx = gridx;
		c.gridy = gridy;
		c.gridwidth = gridwidth;
		c.gridheight = gridheight;
		c.ipadx = ipadx;
		c.ipady = ipady;
		c.weightx = weightx;
		c.weighty = weighty;
		
		pane.add(cmp, c);
	}
	
}
