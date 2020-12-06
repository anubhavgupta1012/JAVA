// JLabelTest.java
import javax.swing.*;
import java.awt.event.*;
public class JLabelTest implements ActionListener
{  JFrame fr;
 JLabel lb1;
JButton b1,b2,b3;
JLabelTest()
{fr=new JFrame();
fr.setLayout(null);
lb1=new JLabel();
b1=new JButton("First");
b2=new JButton("Second");
b3=new JButton("Third");
lb1.setBounds(20,20,300,300);
b1.setBounds(20,330,100,30);
b2.setBounds(130,330,100,30);
b3.setBounds(240,330,100,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
fr.add(lb1);fr.add(b1);fr.add(b2);fr.add(b3);
fr.setSize(400,450);
fr.setVisible(true);}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{lb1.setIcon(new ImageIcon("1.jpg"));
}
if(e.getSource()==b2)
{lb1.setIcon(new ImageIcon("2.jpg"));
}
if(e.getSource()==b3)
{lb1.setIcon(new ImageIcon("3.jpg"));
}}
public static void main(String []s)
{new JLabelTest();}

}
