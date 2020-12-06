import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaTest implements ActionListener
{
	JFrame fr;
	JTextArea ta;
	JButton b;
	JScrollPane pane;
	TextAreaTest()
	{
		fr=new JFrame();
		fr.setLayout(null);

		ta=new JTextArea();  //step 1
		pane=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  //step 2

		pane.setBounds(30,50,200,200);
		b=new JButton("Click");
		b.setBounds(30,270,100,50);
		
		fr.add(pane);
		fr.add(b);
		b.addActionListener(this);
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		//ta.requestFocusInWindow();
		ta.select(3,5);
	}
	public static void main(String s[])
	{
		new TextAreaTest();
	}
}
