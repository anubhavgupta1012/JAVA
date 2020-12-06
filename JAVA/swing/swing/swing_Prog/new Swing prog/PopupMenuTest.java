import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class PopupMenuTest extends MouseAdapter implements ActionListener
{
	JFrame fr;
	JPopupMenu menu;
	JMenuItem m1,m2,m3;
	PopupMenuTest()
	{
		fr=new JFrame();
		
		m1=new JMenuItem("Red");
		m2=new JMenuItem("Green");
		m3=new JMenuItem("Blue");

		menu=new JPopupMenu();
		menu.add(m1);menu.add(m2);menu.add(m3);

		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		
		fr.addMouseListener(this);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		if(e.getButton()==3)
		{
		Point p=e.getPoint();
		int x=(int)p.getX();
		int y=(int)p.getY();
		menu.show(fr , x, y); 
			// to show the popup menu
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		Container c=fr.getContentPane();
		if(e.getSource()==m1)
			c.setBackground(Color.red);
		if(e.getSource()==m2)
			c.setBackground(Color.green);
		if(e.getSource()==m3)
			c.setBackground(Color.blue);
	}
	public static void main(String s[])
	{
		new PopupMenuTest();
	}
}

		
		

