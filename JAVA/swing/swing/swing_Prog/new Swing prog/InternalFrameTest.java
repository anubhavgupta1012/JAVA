
import javax.swing.*;
class InternalFrameTest 
{
	JFrame fr;
	JInternalFrame ifr;	
	InternalFrameTest()
	{
		fr=new JFrame();  
		fr.setLayout(null);
		
		//step 1
		ifr=new JInternalFrame("Test" ,true , true ,true ,true);
		ifr.setBounds(50,50,200,200);	
		ifr.setVisible(true);

		// step 2
		JDesktopPane pane=new JDesktopPane();  
		
		//step 3
		fr.setContentPane(pane);		
		
		//step 4
		pane.add(ifr);    			
	
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public static void main(String s[])
	{
		new InternalFrameTest();
	}
}
		

