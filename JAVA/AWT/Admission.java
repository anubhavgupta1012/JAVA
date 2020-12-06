// AdmissionForm.java
import java.awt.*;
class Admission
{ Frame fr;
Label lb1,lb2,lb3,lb4,lb5,lb6;
TextField tf1,tf2,tf3,tf4;
Button b1,b2,b3;
Admission()
{ fr=new Frame();
fr.setLayout(null);
lb1=new Label(" Admission Form " );
lb2=new Label(".....................................................");
lb3=new Label("Name");
lb4=new Label("Address");
lb5=new Label("mobile no");
lb6=new Label("E-mail");
tf1= new TextField();
tf2= new TextField();
tf3= new TextField();
tf4= new TextField();
b1=new Button("Submitt");
b2=new Button("cancle");
b3=new Button("Reset");



lb1.setBounds(150,50,1500,50);
lb2.setBounds(110,70,350,30);
lb3.setBounds(30,150,100,50);
lb4.setBounds(30,200,100,50);
lb5.setBounds(30,250,100,50);
lb6.setBounds(30,300,100,50);

tf1.setBounds(200,150,200,50);
tf2.setBounds(200,200,200,50);
tf3.setBounds(200,250,200,50);
tf4.setBounds(200,300,200,50);

b1.setBounds(50,450,100,50);
b2.setBounds(150,450,100,50);
b3.setBounds(250,450,100,50);

fr.add(lb1);
fr.add(lb2);
fr.add(lb3);
fr.add(lb4);
fr.add(lb5);
fr.add(lb6);
fr.add(tf1);
fr.add(tf2);
fr.add(tf3);
fr.add(tf4);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.setSize(600,600);
fr.setVisible(true);}


public static void main(String S[])
{new Admission();
}}