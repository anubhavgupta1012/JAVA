// JCheckBoxTest.java
 
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 class CheckBoxTest implements ActionListener
{int s=0; 

JFrame fr1,fr2;
 JCheckBox cb1,cb2,cb3,cb4;
JButton b1,b2;
JLabel lb;
 CheckBoxTest()
{ fr1=new JFrame();
 fr2=new JFrame();
fr1.setLayout(null);
fr2.setLayout(null);

b1=new JButton("Get Bill");
b2=new JButton("EXIT");
lb=new JLabel();

cb1=new JCheckBox("Mobile");
cb2=new JCheckBox("Laptop");
cb3=new JCheckBox("ipod");
cb4=new JCheckBox("All");

cb1.setBounds(30,50,100,30);
cb2.setBounds(30,80,100,30);
cb3.setBounds(30,110,100,30);
cb4.setBounds(30,140,100,30);
b1.setBounds(160,140,100,30);
b2.setBounds(100,100,100,30);
lb.setBounds(100,50,200,50);

fr1.add(cb1);fr1.add(cb2);fr1.add(cb3);fr1.add(cb4);fr1.add(b1);
fr2.add(lb);fr2.add(b2);

cb1.addActionListener(this);
cb2.addActionListener(this);
cb3.addActionListener(this);
cb4.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
fr1.setSize(300,300);
fr2.setSize(300,300);
fr1.setVisible(true);
fr2.setVisible(true);

}
			public void actionPerformed(ActionEvent e)
			{  if(e.getSource()==cb1)
			{s+=10000;    }
			if(e.getSource()==cb2)
			{s+=50000;    }
			if(e.getSource()==cb3)
			{s+=40000;    }
			if(e.getSource()==cb4)
			{cb1.setSelected(true);cb2.setSelected(true);cb3.setSelected(true);cb4.setSelected(true);
				s=100000;    }
			 if(e.getSource()==b1)
			{lb.setText("Amount Payable: "+s);
			cb1.setSelected(false);cb2.setSelected(false);cb3.setSelected(false);cb4.setSelected(false);
				s=0;}
			if(e.getSource()==b2)
			{System.exit(0);}}


 public static void main(String S[])
{new CheckBoxTest();}}