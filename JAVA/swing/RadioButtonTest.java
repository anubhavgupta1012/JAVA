// RadioButtonTest.java
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class RadioButtonTest implements ActionListener
{int i=1,j=0; 
JFrame fr1,fr2,fr3;
JLabel lb,lb1;
JRadioButton rb1,rb2,rb3,rb4;
JCheckBox cb;
JButton b1,b2,b3,b4;

RadioButtonTest()
{fr1 =new JFrame();
 fr2 =new JFrame();
 fr3 =new JFrame();
 fr1.setLayout(null);
 fr2.setLayout(null);
 fr3.setLayout(null);
lb=new JLabel("Ques: "+i+"------------------------------------------------------------------------?"); 
lb1=new JLabel();

rb1=new JRadioButton("A");
rb2=new JRadioButton("B");
rb3=new JRadioButton("C");
rb4=new JRadioButton("D");

ButtonGroup bg=new ButtonGroup();
bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);

cb=new JCheckBox("BOOKMARK");
b1=new JButton("GO TO BOOKMARK");
b2=new JButton("PREV.");
b3=new JButton("NEXT");
b4=new JButton("SUBMIT");

lb.setBounds(10,30,350,30);
rb1.setBounds(20,60,80,30);
rb2.setBounds(20,90,80,30);
rb3.setBounds(20,120,80,30);
rb4.setBounds(20,150,80,30);
cb.setBounds(30,180,150,30);
b1.setBounds(30,210,160,20);
b2.setBounds(250,210,100,25);
b3.setBounds(355,210,100,25);
b4.setBounds(300,240,100,25);
lb1.setBounds(10,20,100,25);
fr1.add(lb);fr1.add(rb1);fr1.add(rb2);fr1.add(rb3);fr1.add(rb4);fr1.add(cb);fr1.add(b1);fr1.add(b2);fr1.add(b3);
fr1.add(b4);fr3.add(lb1);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
cb.addActionListener(this);


fr1.setSize(500,300);
fr1.setVisible(true);

fr2.setSize(300,300);
fr3.setSize(300,300);
}
		public void actionPerformed(ActionEvent e)
		{
		if (e.getSource()==b4)
		{ fr3.setVisible(true);
			j+=25;
			if(rb1.isSelected());
			{lb1.setText(i+"): A");}
			if(rb2.isSelected());
			{lb1.setText(i+"): B");}
			if(rb3.isSelected());
			{lb1.setText(i+"): C");}
			if(rb4.isSelected());
			{lb1.setText(i+"): D");}	
		}
		if (e.getSource()==b3)
		{i++;
		rb1.setSelected(false);
		rb2.setSelected(false);
		rb3.setSelected(false);
		rb4.setSelected(false);
		this.run(i);}
	
		if (e.getSource()==b2)
		{i--;  
		rb1.setSelected(false);
		rb2.setSelected(false);
		rb3.setSelected(false);
		rb4.setSelected(false);
		this.run(i);}
	}
	

		

		public void run(int i)
		{lb.setText("Ques: "+i+"------------------------------------------------------------------------?");
			}

 public static void main(String S[])
{new RadioButtonTest();}}
