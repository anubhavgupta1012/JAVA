//  EventTest.java
 import java.awt.*;
import java.awt.event.*;
class EventTest
{Frame fr;
TextField tf;
Button b;
EventTest()
{fr= new Frame("Event Test");
fr.setLayout(null);
tf=new TextField();
b=new Button("Submit");
tf.setBounds(50,100,100,50);

b.setBounds(50,180,100,50);
fr.add(tf);
fr.add(b);

MyListener listener= new MyListener();
b.addActionListener(listener);
fr.setSize(400,400);
fr.setVisible(true);
}
public static void main(String []s)
{new EventTest();
}}
 