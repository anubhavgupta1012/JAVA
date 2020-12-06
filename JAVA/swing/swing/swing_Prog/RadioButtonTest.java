// RadioButtonTest.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioButtonTest implements ActionListener
{
	JFrame fr;
	JRadioButton rb1,rb2,rb3;
	JLabel lb;
		
	RadioButtonTest()
	{
		fr = new JFrame("Color Sample");
		fr.setLayout(null);

		rb1=new JRadioButton("Red");
		rb2=new JRadioButton("Green");
		rb3=new JRadioButton("Blue");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);	
		bg.add(rb2);
		bg.add(rb3);
	
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
	lb=new JLabel("Select the color to apply on the Frame");
		
		lb.setBounds(30,50,200,50);
		rb1.setBounds(50,120,100,50);		
		rb2.setBounds(50,190,100,50);		
		rb3.setBounds(50,260,100,50);		
		fr.add(lb);
		fr.add(rb1);  fr.add(rb2);  fr.add(rb3);
		
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Color c;

		if(rb1.isSelected())
		{	c = Color.red;
		}
		else if(rb2.isSelected())
		{	c=Color.green;
		}	
		else
		{	c=Color.blue;
		}	
		
		Container cnt=fr.getContentPane();
		cnt.setBackground(c);
	}
	public static void main(String s[])
	{
		new RadioButtonTest();
	}	
}
