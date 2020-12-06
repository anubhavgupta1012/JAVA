// MyListener.java
import java.awt.event.*;
class MyListener implements ActionListener
{ public void actionPerformed(ActionEvent e)
{if(e.getActionCommand().equals("First"))
System.out.println("hello & Welcome");


else if(e.getActionCommand().equals("Second"))
System.out.println("good Bye");

}}
