
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CustomDialogTest implements ActionListener
{
	JFrame fr;
	JDialog d;
	JButton b;
	JTextField tf;
	CustomDialogTest()
	{
		fr=new JFrame();  
		fr.setLayout(new FlowLayout());
		
		d=new JDialog(fr,"My Dialogbox",true);
		d.setLayout(new FlowLayout());
		
	tf=new JTextField("This is the Custom dialog box");
		b=new JButton("Show");
		b.addActionListener(this);

		fr.add(b);
		d.add(tf);
		
		d.setSize(200,200);
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		d.setVisible(true);
	}
	public static void main(String s[])
	{
		new CustomDialogTest();
	}
}
	