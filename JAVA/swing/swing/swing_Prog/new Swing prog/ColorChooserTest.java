import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.ColorSelectionModel;
import java.awt.*;

class ColorTest implements ChangeListener
{
	JFrame fr;
	JColorChooser ch;
	ColorSelectionModel model;
	ColorTest()
	{
		fr=new JFrame();
		fr.setLayout(null);
		
		ch=new JColorChooser();       // step 1
		model = ch.getSelectionModel(); // step 2
		model.addChangeListener(this);// step 3

		ch.setBounds(50,50,400,400);
		fr.add(ch);
		fr.setSize(500,500);
		fr.setVisible(true);
	}
	public void stateChanged(ChangeEvent e)
	{
		Color c=model.getSelectedColor();
		fr.getContentPane().setBackground(c);
	}
	public static void main(String s[])
	{
		new ColorTest();	
	}
}
		