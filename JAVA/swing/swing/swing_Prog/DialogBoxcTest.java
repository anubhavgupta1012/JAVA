import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class DialogBoxTest implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3;
	JTextField tf;

	DialogBoxTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());

		b1=new JButton("Message");
		b2=new JButton("Confirm");
		b3=new JButton("Input");

		tf=new JTextField(15);
		fr.add(tf);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
	
		b1.addActionListener(this);
		b2.addActionListener(this);					b3.addActionListener(this);

		fr.setSize(200,250);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
	String name=tf.getText();

	JOptionPane.showMessageDialog(fr,"Hello & welcome "+name ,"Sample Dialog Box", JOptionPane.QUESTION_MESSAGE);		
		}
		if(e.getSource()==b2)
		{
			int x=JOptionPane.showConfirmDialog(fr,"Java Question","Swing is better than AWT" , JOptionPane.YES_NO_CANCEL_OPTION);		
		if(x==JOptionPane.YES_OPTION)
			tf.setText("Correct answer");
		if(x==JOptionPane.NO_OPTION)
			tf.setText("Incorrect answer");
		if(x==JOptionPane.CANCEL_OPTION)
			tf.setText("you should know it");
		}
		if(e.getSource()==b3)
		{
String name = JOptionPane.showInputDialog(fr,"Enter Name","Enter your name");
			if(name!=null)
		tf.setText("Welcome "+name);
			else
		tf.setText("Welcome unknown");
		}
	}
	public static void main(String s[])
	{
		new DialogBoxTest();
	}	
}
    