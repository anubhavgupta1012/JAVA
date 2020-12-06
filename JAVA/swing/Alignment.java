// Alignment.java
import javax.swing.*;
import java.awt.event.*;
public class Alignment implements ActionListener
{
JFrame fr;
 JLabel lb1,lb2,lb3,lb4;
JButton b1,b2;
int g;
Alignment()
{fr=new JFrame();
fr.setLayout(null);
lb1=new JLabel("First");
lb2=new JLabel("Second");
lb3=new JLabel("Third");
lb4=new JLabel("Fourth");
b1=new JButton("Change");
b2=new JButton("Change All");

lb1.setBounds(50,100,100,50);
lb2.setBounds(100,250,100,50);
lb3.setBounds(50,400,100,50);
lb4.setBounds(100,550,100,50);


b1.setBounds(400,200,100,50);
b2.setBounds(400,300,100,50);

b1.addActionListener(this);
b2.addActionListener(this);

fr.add(lb1);fr.add(lb2);fr.add(lb3);fr.add(lb4);
fr.add(b1);fr.add(b2);
fr.setSize(600,1000);
fr.setVisible(true);

}



public void actionPerformed(ActionEvent e)
{if (e.getSource()==b1)
{g++;
this.Get(g);}	
}
void Get(int g)
{
	if((g%4==1)&&(lb1.getX()==50))
	{lb1.setBounds(100,100,100,50);}

	if((g%4==2)&&(lb2.getX()==100))
	{lb2.setBounds(50,250,100,50);}

	if((g%4==3)&&(lb3.getX()==50))
	{lb3.setBounds(100,400,100,50);}

	if((g%4==0)&&(lb4.getX()==100))
	{lb4.setBounds(50,550,100,50);}

	if((g%4==1)&&(lb1.getX()==100))
	{lb1.setBounds(50,100,100,50);}

	if((g%4==2)&&(lb2.getX()==50))
	{lb2.setBounds(100,250,100,50);}

	if((g%4==3)&&(lb3.getX()==100))
	{lb3.setBounds(50,400,100,50);}

	if((g%4==0)&&(lb4.getX()==50))
	{lb4.setBounds(100,550,100,50);}


}
public static void main(String []s)
{new Alignment();}}