//  EventTest4.java
 import java.awt.*;
import java.awt.event.*;
class EventTest4
{Frame fr;
TextField tf;
Button b1,b2;
EventTest4()
{fr= new Frame("Event Test");
fr.setLayout(null);
tf=new TextField();
b1=new Button("First");
b2=new Button("Second");
tf.setBounds(50,100,100,50);

b1.setBounds(50,180,100,50);
b2.setBounds(180,180,100,50);

fr.add(tf);
fr.add(b1);
fr.add(b2);
fr.setSize(400,400);
fr.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);}

public void actionPerformed(ActionEvent e)
{if(e.getActionCommand().equals("First"))
{this.et.tf.setText("Hellow & welcome");}
else if(e.getActionCommand().equals("Second"))
{this.et.tf.setText("good bye");}
}
public static void main(String []s)
{new EventTest4();
}}
 