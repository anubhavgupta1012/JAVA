//TextArea.java
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaTest implements ActionListener
{JFrame fr;
 JTextArea ta;
 JButton b;
 JScrollPane pane;

	TextAreaTest()
	{fr=new JFrame();
	fr.setLayout(null);
	ta=new JTextArea();
	pane=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	pane.setBounds(30,30,200,200);
	b=new JButton("click");
	b.setBounds(30,270,100,50);
	fr.add(pane);
	fr.add(b);
	b.addActionListener(this);
	fr.setSize(400,400);
	fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{ta.requestFocusInWindow();
	ta.select(3,18);
	}
public static void main (String S[])
{ new TextAreaTest();
}}
