import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MenuTest implements ActionListener
{
	JFrame fr;
	JMenuBar bar;
	JMenu m;
	JMenuItem mi1,mi2,mi3;
	JLabel lb;
	MenuTest()
	{
		fr=new JFrame();
		fr.setLayout(null);

		bar=new JMenuBar();
		m=new JMenu("Color");
		mi1=new JMenuItem("Red");
		mi2=new JMenuItem("Green");
		mi3=new JMenuItem("Blue");

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);

		m.add(mi1);
		m.add(mi2);
		m.addSeparator();
		m.add(mi3);

		bar.add(m);
		fr.setJMenuBar(bar);
	
		lb=new JLabel("Select the color to change the color of the frame");	

		lb.setBounds(10,50,300,50);
		fr.add(lb);
		
		m.setMnemonic(KeyEvent.VK_C);

	mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,KeyEvent.SHIFT_MASK));
		
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	
		Container cr = fr.getContentPane();
		if(e.getSource()==mi1)
			cr.setBackground(Color.red);
		if(e.getSource()==mi2)
			cr.setBackground(Color.green);
		if(e.getSource()==mi3)
			cr.setBackground(Color.blue);
	}
	public static void main(String s[])
	{
		new MenuTest();
	}
}		
		