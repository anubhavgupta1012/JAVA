import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TimerTest implements ActionListener
{
	JFrame fr;
	JButton b1,b2;
	JLabel lb1,lb2;
	Timer t;

	TimerTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());
		
		b1=new JButton("Start timer");
		b2=new JButton("Stop timer");
		
		lb1=new JLabel("Hello");
		lb2=new JLabel("Welcome");
		
		t=new Timer(500 , this);
		
		fr.add(b1);   fr.add(b2);  
		fr.add(lb1);  fr.add(lb2); 

		fr.setSize(300,300);
		fr.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==t)
		{
			String temp=lb1.getText();
			lb1.setText(lb2.getText());
			lb2.setText(temp);
		}
		if(e.getSource()==b1)
			t.start();
		if(e.getSource()==b2)
			t.stop();
	}
		public static void main(String s[])
		{
			new TimerTest();
		}
}