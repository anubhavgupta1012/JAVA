// MyApplet.java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MyApplet extends Applet implements ActionListener
{Button b1,b2;
int x;
public void init()
{b1=new Button("Rect");b2=new Button("Circle");
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void paint(Graphics g)
{if(x==1)
{g.setColor(Color.RED);
g.drawRect(30,70,150,150);}
if(x==2)
{g.setColor(Color.GREEN);
g.drawOval(30,70,150,150);}
}
	public void actionPerformed(ActionEvent e)
	{if (e.getSource()==b1)
	{x=1;
	}
	if (e.getSource()==b2)
	{x=2;
	}
	repaint();
	}
}