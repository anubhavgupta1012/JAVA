// WindowEventTest.java
import java.awt.*;
import java.awt.event.*;
class WindowEventTest2 extends WindowAdapter
{ Frame fr;
TextField tf;

WindowEventTest2()
{fr=new Frame("Window Event Test");
fr.setLayout(null);
tf=new TextField();
tf.setBounds(50,60,100,50);
fr.add(tf);
fr.addWindowListener(this);
fr.setSize(400,400);
fr.setVisible(true);}


public void windowClosing(WindowEvent e)
{System.out.println("Window is closing");
fr.dispose();}






public static void main(String []A)
{  new WindowEventTest2();
}}