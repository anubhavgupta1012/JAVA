import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BorderLayoutTest implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3,b4;
	JTextField tf;
	BorderLayoutTest()
	{
		fr=new JFrame();
		fr.setLayout(new BorderLayout(5,5));
		
		b1=new JButton("North");
		b2=new JButton("South");
		b3=new JButton("East");
		b4=new JButton("West");
		tf=new JTextField();

	fr.add(b1,BorderLayout.NORTH);
	fr.add(b2,BorderLayout.SOUTH);
	fr.add(b3,BorderLayout.EAST);
	fr.add(b4,BorderLayout.WEST);
	fr.add(tf,BorderLayout.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			tf.setText("North selected");
		if(e.getSource()==b2)
			tf.setText("South selected");
		
		if(e.getSource()==b3)
			tf.setText("East selected");
		
		if(e.getSource()==b4)
			tf.setText("West selected");
	}
	public static void main(String s[])
	{
		new BorderLayoutTest();
	}
}
