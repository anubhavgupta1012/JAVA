// Alphabet.java
import java.awt.*;
import java.awt.event.*;
class Alphabet
{ Frame fr;
Button b;
TextField tf1,tf2,tf3,tf4,tf5;
Label lb1,lb2,lb3,lb4,lb5;

Alphabet()
{fr=new Frame();
fr.setLayout(null);
lb1=new Label("Enter text");
lb2=new Label("No. of spaces");
lb3=new Label("No of Vowels");
lb4=new Label("No. of Consonents");
lb5=new Label("No of Digits");
b=new Button("Calculate");
tf1=new TextField();
tf2=new TextField();
tf3=new TextField();
tf4=new TextField();
tf5=new TextField();



lb1.setBounds(20,35,100,50);
lb2.setBounds(20,270,100,50);
lb3.setBounds(20,350,100,50);
lb4.setBounds(20,430,100,50);
lb5.setBounds(20,510,100,50);
tf1.setBounds(15,100,450,40);
b.setBounds(35,180,100,50);
tf2.setBounds(150,270,150,50);
tf3.setBounds(150,350,150,50);
tf4.setBounds(150,430,150,50);
tf5.setBounds(150,510,150,50);


fr.add(lb1);
fr.add(lb2);
fr.add(lb3);
fr.add(lb4);
fr.add(lb5);
fr.add(tf1);
fr.add(tf2);fr.add(tf3);fr.add(tf4);fr.add(tf5);
fr.add(b);

 AlphabetListener A= new  AlphabetListener(this);
b.addActionListener(A);

fr.setSize(500,600);
fr.setVisible(true);
}
public static void main(String S[])
{ new Alphabet();
}}

