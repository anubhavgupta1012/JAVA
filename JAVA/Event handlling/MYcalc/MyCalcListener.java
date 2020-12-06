//MyCalcListener.java
import java.awt.*;
import java.awt.event.*;
class MyCalcListener implements ActionListener
{int a,b,c;
MyCalc M;
MyCalcListener(MyCalc M)
{this.M=M;
}
public void actionPerformed(ActionEvent e){
if(e.getActionCommand().equals("Add"))
{String s1=this.M.tf1.getText();
 a=Integer.parseInt(s1);
String s2=this.M.tf2.getText();
 b=Integer.parseInt(s2);
  c=a+b;
String s3=Integer.toString(c);
this.M.tf3.setText(s3);}

if(e.getActionCommand().equals("Sub"))
{String s1=this.M.tf1.getText();
 a=Integer.parseInt(s1);
String s2=this.M.tf2.getText();
 b=Integer.parseInt(s2);
  c=a-b;
String s3=Integer.toString(c);
this.M.tf3.setText(s3);}


if(e.getActionCommand().equals("Mul."))
{String s1=this.M.tf1.getText();
 a=Integer.parseInt(s1);
String s2=this.M.tf2.getText();
 b=Integer.parseInt(s2);
  c=a*b;
String s3=Integer.toString(c);
this.M.tf3.setText(s3);}

if(e.getActionCommand().equals("Div."))
{String s1=this.M.tf1.getText();
 a=Integer.parseInt(s1);
String s2=this.M.tf2.getText();
 b=Integer.parseInt(s2);
  c=a/b;
String s3=Integer.toString(c);
this.M.tf3.setText(s3);}


}}