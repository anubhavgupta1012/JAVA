// TestAreaSearch.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaSearch implements ActionListener
{ JFrame fr;
JTextArea ta1;
JTextField tf1,tf2;
JButton b1,b2,b3;
JScrollPane pane;
JLabel lb1,lb2;


TextAreaSearch()
{
 fr=new JFrame();
fr.setLayout(null);
ta1=new JTextArea();
tf1=new JTextField();
tf2=new JTextField();
lb1=new JLabel("FIND :");
lb2=new JLabel("REPLACE WITH :");
b1=new JButton("SEARCH");
b2=new JButton("REPLACE");
b3=new JButton("REPLACE ALL");
pane= new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
ta1.setBounds(30,30,350,150);
lb1.setBounds(30,280,120,20);
tf1.setBounds(150,280,120,20);
lb2.setBounds(30,350,120,20);
tf2.setBounds(150,350,120,20);
b1.setBounds(350,260,120,35);
b2.setBounds(350,310,120,35);
b3.setBounds(350,360,120,35);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

fr.add(ta1);
fr.add(tf1);
fr.add(tf2);
fr.add(lb1);
fr.add(lb2);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.setSize(500,500);
fr.setVisible(true);}
		
		public void actionPerformed(ActionEvent e)
		{ String s0= tf1.getText();
		 String s1=ta1.getText();

		if(e.getSource()==b1)
		{
		int x=s1.indexOf(s0);
		ta1.requestFocusInWindow();
		ta1.select(x,(x+s0.length()));
		}
		
		if(e.getSource()==b2)
		{}





}

public static void main(String S[])
{new TextAreaSearch();
}}




							//INCOMPLETE//
