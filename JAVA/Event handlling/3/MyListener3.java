// MyListener3.java
import java.awt.event.*;
class MyListener3 implements ActionListener
{EventTest3 et;
MyListener3(EventTest3  et)
{this.et=et;}

 public void actionPerformed(ActionEvent e)
{if(e.getActionCommand().equals("First"))
{this.et.tf.setText("Hellow & welcome");}


else if(e.getActionCommand().equals("Second"))
{this.et.tf.setText("good bye");}


}}
