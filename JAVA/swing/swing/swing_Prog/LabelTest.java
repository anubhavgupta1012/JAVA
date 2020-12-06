import javax.swing.*;
import java.awt.event.*;

class LabelTest implements ActionListener
{	JFrame fr;
	JButton b1,b2,b3;
	JLabel lb;
	
	LabelTest()
	{	fr = new JFrame();
		fr.setLayout(null);

		lb=new JLabel();
		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		lb.setBounds(30,50,250,250);
		b1.setBounds(50,320,100,50);
		b2.setBounds(180,320,100,50);
		b3.setBounds(300,320,100,50);	

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	fr.add(lb);fr.add(b1);fr.add(b2);fr.add(b3);
	
		fr.setVisible(true);
		fr.setSize(400,400);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			lb.setIcon(new ImageIcon("1.jpg"));
		}
		if(e.getSource()==b2)
		{
			lb.setIcon(new ImageIcon("2.jpg"));
		}
		if(e.getSource()==b3)
		{
			lb.setIcon(new ImageIcon("3.jpg"));
		}
	}
	public static void main(String s[])
	{
		new LabelTest();
	}
}		
