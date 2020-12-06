// WindowEventTest.java
import java.awt.*;
import java.awt.event.*;
class WindowEventTest implements WindowListener
{ Frame fr;
TextField tf;



WindowEventTest()
{fr=new Frame("Window Event Test");
fr.setLayout(null);
tf=new TextField();
tf.setBounds(50,60,100,50);
fr.add(tf);
fr.addWindowListener(this);
fr.setSize(400,400);
fr.setVisible(true);}

public void windowOpened(WindowEvent e)
{System.out.println("Window is opened");}


public void windowClosing(WindowEvent e)
{System.out.println("Window is closing");
fr.dispose();}


public void windowClosed(WindowEvent e)
{System.out.println("Window is closed");}


public void windowActivated(WindowEvent e)
{System.out.println("Window is Activated");}

public void windowDeactivated(WindowEvent e)
{System.out.println("Window is deactivated");}

public void windowIconified(WindowEvent e)
{System.out.println("Window is minimised ");
}

public void windowDeiconified(WindowEvent e)
{System.out.println("Window is maximised");}


public static void main(String []A)
{  new WindowEventTest();
}}