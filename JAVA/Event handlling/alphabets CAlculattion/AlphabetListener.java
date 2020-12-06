// AlphabetListener.java
import java.awt.*;
import java.awt.event.*;

class  AlphabetListener implements ActionListener
{int v,d,c,sp,i;

Alphabet A;
 AlphabetListener(Alphabet A)
{this.A=A;}

 public void actionPerformed(ActionEvent e)
{String s0= this.A.tf1.getText();
for(i=0;i<s0.length();i++)
	{
	char m =s0.charAt(i);
	if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U'||m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
	{v++; //  vowel
	}
	if (m==' ')   // spaces
	{sp++;
	}
	if(m!=' ' && m!='A'&&m!='E'&&m!='I'&&m!='O'&&m!='U'&&m!='a'&&m!='e'&&m!='i'&&m!='o'&&m!='u')  // consonents
	{c++;}
	if(m!=' ')
	{d++;}}

String s1=Integer.toString(sp);
String s2=Integer.toString(v);
String s3=Integer.toString(c);
String s4=Integer.toString(d);
this.A.tf2.setText(s1);
this.A.tf3.setText(s2);
this.A.tf4.setText(s3);
this.A.tf5.setText(s4);
v=d=c=sp=0;
}}


