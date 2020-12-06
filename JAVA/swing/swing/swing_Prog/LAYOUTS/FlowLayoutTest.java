import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FlowLayoutTest implements ActionListener
{
	JFrame fr;
	JButton b[]=new JButton[10];
	JTextField tf;

	FlowLayoutTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());
	
		for(int i=0 ; i<10; i++)
		{
			b[i]=new JButton(""+(i+1));
			fr.add(b[i]);
			b[i].addActionListener(this);
		}
		tf=new JTextField("Hello");
	b[0].setPreferredSize(new Dimension(100,50));

		b[1].setText("2 button");
		fr.add(tf);
	
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public static void main(String s[])
	{
		new FlowLayoutTest();
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("button clicked");
	}
}

		