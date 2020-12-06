// Image.java
import javax.swing.*;
import java.awt.event.*;
public class Image implements ActionListener
{int g=1;  
JFrame fr;
 JLabel lb;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,prev,next;
Image()
{fr=new JFrame();
fr.setLayout(null);
lb=new JLabel();
b1=new JButton("First");
b2=new JButton("Second");
b3=new JButton("third");
b4=new JButton("fourth");
b5=new JButton("fifth");
b6=new JButton("Sixth");
b7=new JButton("seventh");
b8=new JButton("Eight");
b9=new JButton("nine");
prev=new JButton("Prev");
next=new JButton("next");
lb.setBounds(20,20,300,300);
b1.setBounds(20,330,100,30);
b2.setBounds(130,330,100,30);
b3.setBounds(240,330,100,30);
b4.setBounds(20,330,100,30);
b5.setBounds(130,330,100,30);
b6.setBounds(240,330,100,30);
b7.setBounds(20,330,100,30);
b8.setBounds(130,330,100,30);
b9.setBounds(240,330,100,30);
prev.setBounds(50,380,100,30);
next.setBounds(180,380,100,30);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
prev.addActionListener(this);
next.addActionListener(this);

fr.add(lb);fr.add(b1);fr.add(b2);fr.add(b3);
fr.add(b4);fr.add(b5);fr.add(b6);fr.add(b7);fr.add(b8);fr.add(b9);fr.add(prev);fr.add(next);
fr.setSize(400,450);
fr.setVisible(true);
prev.setVisible(false);
}



public void actionPerformed(ActionEvent e)
{	b1.setVisible(true);
	b2.setVisible(true);
	b3.setVisible(true);
	b4.setVisible(false);
	b5.setVisible(false);	
	b6.setVisible(false);
	b7.setVisible(false);
	b8.setVisible(false);
	b9.setVisible(false);
	next.setVisible(true);
	
	if(e.getSource()==b1)
	{lb.setIcon(new ImageIcon("1.jpg"));
	}
	if(e.getSource()==b2)
	{lb.setIcon(new ImageIcon("2.jpg"));
	}
	if(e.getSource()==b3)
	{lb.setIcon(new ImageIcon("3.jpg"));
	}
	if(e.getSource()==next)
	{   g++;
	this.run(e,g);  }
	if(e.getSource()==prev)
	{g--;
	this.run(e,g);
	}
	if(e.getSource()==b4)
	{this.run(e,g);  
	}
	if(e.getSource()==b5)
	{this.run(e,g);  
	}if(e.getSource()==b6)
	{this.run(e,g);  
	}if(e.getSource()==b7)
	{this.run(e,g);  
	}if(e.getSource()==b8)
	{this.run(e,g);  
	}if(e.getSource()==b9)
	{this.run(e,g);  
	}}

public void run(ActionEvent e,int g)
	{if ((g%3)==1)
	{b1.setVisible(true);
	b2.setVisible(true);
	b3.setVisible(true);
	b4.setVisible(false);
	b5.setVisible(false);	
	b6.setVisible(false);
	b7.setVisible(false);
	b8.setVisible(false);
	b9.setVisible(false);
	next.setVisible(true);
	prev.setVisible(false);
	if(e.getSource()==b1)
	{lb.setIcon(new ImageIcon("1.jpg"));
	}
	if(e.getSource()==b2)
	{lb.setIcon(new ImageIcon("2.jpg"));
	}
	if(e.getSource()==b3)
	{lb.setIcon(new ImageIcon("3.jpg"));
	}
}

if ((g%3)==2)
{	b1.setVisible(false);
	b2.setVisible(false);
	b3.setVisible(false);
	b4.setVisible(true);
	b5.setVisible(true);	
	b6.setVisible(true);
	b7.setVisible(false);
	b8.setVisible(false);
	b9.setVisible(false);
	prev.setVisible(true);
	next.setVisible(true);

	if(e.getSource()==b4)
	{lb.setIcon(new ImageIcon("4.jpg"));
	}
	if(e.getSource()==b5)
	{lb.setIcon(new ImageIcon("5.jpg"));
	}
	if(e.getSource()==b6)
	{lb.setIcon(new ImageIcon("6.jpg"));
	}

}




if ((g%3)==0)
{		
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		next.setVisible(false);
		b7.setVisible(true);
		b8.setVisible(true);
		b9.setVisible(true);
		prev.setVisible(true);
		if(e.getSource()==b7)
		{lb.setIcon(new ImageIcon("7.jpg"));
		}
		if(e.getSource()==b8)
		{lb.setIcon(new ImageIcon("8.jpg"));
		}
		if(e.getSource()==b9)
		{lb.setIcon(new ImageIcon("9.jpg"));
		}
}}


public static void main(String []s)
{new Image();}}