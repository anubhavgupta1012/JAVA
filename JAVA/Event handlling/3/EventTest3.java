//  EventTest3.java
 import java.awt.*;
import java.awt.event.*;
class EventTest3
{Frame fr;
TextField tf;
Button b1,b2;
EventTest3()
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

ActionListener listener= new MyListener3(this);
b1.addActionListener(listener);
b2.addActionListener(listener);
}
public static void main(String []s)
{new EventTest3();
}}
 