import java.awt.event.*;
import javax.swing.*;

class CheckBoxTest implements ActionListener
{
	JFrame fr1,fr2;
	JCheckBox cb1,cb2,cb3,cb4;
	JLabel lb;
	JButton b1,b2;

	CheckBoxTest()
	{
		fr1=new JFrame();
		fr2=new JFrame();
		fr1.setLayout(null);
		fr2.setLayout(null);

		cb1=new JCheckBox("Mobile");
		cb2=new JCheckBox("Laptop");
		cb3=new JCheckBox("IPod");
		cb4=new JCheckBox("All");

		lb=new JLabel();
		b1=new JButton("Get Bill");
		b2=new JButton("Exit");
	
		cb1.setBounds(30,50,100,50);
		cb2.setBounds(30,120,100,50);
		cb3.setBounds(30,190,100,50);
		cb4.setBounds(30,260,100,50);
		b1.setBounds(160,70,100,50);

		lb.setBounds(50,50,150,50);
		b2.setBounds(70,120,100,50);

		fr1.add(cb1);fr1.add(cb2);fr1.add(cb3);fr1.add(cb4);fr1.add(b1);
		fr2.add(lb); fr2.add(b2);
		
		cb4.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	
		fr1.setSize(400,400);
		fr2.setSize(300,300);
		fr1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)	
	{
		if(e.getSource()==cb4)	
		{
			if(cb4.isSelected())
			{
				cb1.setSelected(true);
				cb2.setSelected(true);
				cb3.setSelected(true);
			}			
			else
			{
				cb1.setSelected(false);	
				cb2.setSelected(false);
				cb3.setSelected(false);
			}
		}
		if(e.getSource()==b1)
		{
			int amt=0;
			if(cb1.isSelected())
				amt+=5000;
			if(cb2.isSelected())
				amt+=20000;
			if(cb3.isSelected())
				amt+=1000;
		lb.setText("Payable Amount=  "+amt);	
			fr2.setVisible(true);
		}
		if(e.getSource()==b2)
			System.exit(0);
	}
	public static void main(String s[])
	{
		new CheckBoxTest();
	}
}	
