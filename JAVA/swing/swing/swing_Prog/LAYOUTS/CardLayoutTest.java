	
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class CardLayoutTest implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3,b4;
	JLabel lb1,lb2,lb3,lb4;
	JPanel p1,p2;
	CardLayout cd;
	CardLayoutTest()
	{
		cd=new CardLayout();
		fr=new JFrame();
		fr.setLayout(new FlowLayout());
	
		p1=new JPanel();
		p2=new JPanel();
		p2.setLayout(cd);

		b1=new JButton("First");		
		b2=new JButton("Prev");
		b3=new JButton("Next");
		b4=new JButton("Last");
		lb1=new JLabel(new ImageIcon("1.jpg"));
		lb2=new JLabel(new ImageIcon("2.jpg"));
		lb3=new JLabel(new ImageIcon("3.jpg"));
		lb4=new JLabel(new ImageIcon("4.jpg"));

	p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		p2.add(lb1,"first");
		p2.add(lb2,"second");
		p2.add(lb3,"third");
		p2.add(lb4,"fourth");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		fr.add(p1);	
		fr.add(p2);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{	cd.first(p2);
		}
		if(e.getSource()==b2)
			cd.previous(p2);
		if(e.getSource()==b3)
			cd.next(p2);
		if(e.getSource()==b4)
			cd.last(p2);
	}
	public static void main(String s[])
	{
		new CardLayoutTest();
	}
}
