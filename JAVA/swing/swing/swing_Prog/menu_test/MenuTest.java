import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MenuTest implements ActionListener
{
	JFrame fr;
	JMenuBar bar;
	JMenu m;
	JMenuItem mi1,mi2,mi3;

	CardLayout c=new CardLayout();
	JPanel p;
	MenuTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());

		p=new JPanel();
		p.setLayout(c);

	p.add(new ListTest().fr1 , "first");	
	p.add(new GridLayoutTest().fr ,"second");
	p.add(new TableTest().fr1 ,"third");

		bar=new JMenuBar();
		m=new JMenu("Option");
		mi1=new JMenuItem("List");
		mi2=new JMenuItem("GridLayout");
		mi3=new JMenuItem("Table");

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);

		m.add(mi1);m.add(mi2);m.add(mi3);
		bar.add(m);
		fr.setJMenuBar(bar);	
		
		
	m.setMnemonic(KeyEvent.VK_C);
	mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,KeyEvent.SHIFT_MASK));
		p.setPreferredSize(new Dimension(300,300));	
		fr.add(p);	

		fr.setSize(500,500);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==mi1)
			c.show(p,"first");
		if(e.getSource()==mi2)
			c.show(p,"second");
		if(e.getSource()==mi3)
			c.show(p,"third");
	}
	public static void main(String s[])
	{
		new MenuTest();
	}
}		
		