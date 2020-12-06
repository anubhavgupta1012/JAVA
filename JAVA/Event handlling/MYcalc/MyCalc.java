// MyCalc.java;
import java.awt.*;
import java.awt.event.*;
class MyCalc
{ Frame fr;
Button b1,b2,b3,b4;
TextField tf1,tf2,tf3;
Label lb1,lb2,lb3;

MyCalc()
{
fr=new Frame();
fr.setLayout(null);

b1=new Button("Add");
b2=new Button("Sub");
b3=new Button("Mul.");
b4=new Button("Div.");
lb1=new Label("No.1");
lb2=new Label("No.2");
lb3=new Label("Result");
tf1=new TextField();
tf2=new TextField();
tf3=new TextField();
 
lb1.setBounds(50,50,50,50);
lb2.setBounds(50,120,50,50);
lb3.setBounds(50,190,50,50);
tf1.setBounds(200,50,150,50);
tf2.setBounds(200,120,150,50);
tf3.setBounds(200,190,150,50);
b1.setBounds(70,270,50,50);
b2.setBounds(140,270,50,50);
b3.setBounds(210,270,50,50);
b4.setBounds(280,270,50,50);

fr.add(lb1);
fr.add(lb2);
fr.add(lb3);
fr.add(tf1);
fr.add(tf2);
fr.add(tf3);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.add(b4);
MyCalcListener A =new MyCalcListener(this);
b1.addActionListener(A);
b3.addActionListener(A);
b2.addActionListener(A);
b4.addActionListener(A);
 fr.setSize(450,450);
fr.setVisible(true);


}
public static void main(String s[])
{new MyCalc();

}}