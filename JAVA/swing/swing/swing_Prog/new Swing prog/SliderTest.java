

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class SliderTest implements ChangeListener
{
	JFrame fr;
	JSlider slider;
	JLabel lb;
	JRadioButton rb1,rb2,rb3;
	SliderTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());

		slider=new JSlider(0,255);
		slider.setMajorTickSpacing(20);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
	slider.setPreferredSize(new Dimension(500,50));	
lb=new JLabel("Use the slider to change the color");
		rb1=new JRadioButton("Red");	
		rb2=new JRadioButton("Green");	
		rb3=new JRadioButton("Blue");
	
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		slider.addChangeListener(this);
		fr.add(lb);
		fr.add(slider);
		fr.add(rb1);fr.add(rb2);fr.add(rb3);
		fr.setSize(600,300);
		fr.setVisible(true);
	}
	public void stateChanged(ChangeEvent e)
	{
		int x=slider.getValue();
		Container c=fr.getContentPane();	
		if(rb1.isSelected())
			c.setBackground(new Color(x,0,0));
		if(rb2.isSelected())
			c.setBackground(new Color(0,x,0));
		if(rb3.isSelected())
			c.setBackground(new Color(0,0,x));
	}
	public static void main(String s[])
	{	
		new SliderTest();
	}
}
	
	