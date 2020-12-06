
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FileInputOutputTest implements ActionListener
{
	JFrame fr;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	FileInputOutputTest()
	{
		fr=new JFrame();
		fr.setLayout(new FlowLayout());

		ta=new JTextArea(20,30);
		pane=new JScrollPane(ta);
		b1=new JButton("Open");
		b2=new JButton("Save");
		b1.addActionListener(this);	
		b2.addActionListener(this);
		
		fr.add(pane);
		fr.add(b1);
		fr.add(b2);
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
		JFileChooser fch=new JFileChooser();
			int x=fch.showOpenDialog(fr);
			if(x==JFileChooser.APPROVE_OPTION)
			{
			File f=fch.getSelectedFile();
BufferedReader br=new BufferedReader(new FileReader(f));					while(true)
				{
				String str=br.readLine();
					if(str==null)
						break;	
				ta.append(str+"\n");
				}
			}
			}		
			catch(Exception ee)
			{	ee.printStackTrace();
			}			
		}
		if(e.getSource()==b2)
		{
			try	
			{
		JFileChooser fch=new JFileChooser();		
		int x=fch.showSaveDialog(fr);
			if(x==JFileChooser.APPROVE_OPTION)
			{
			File f=fch.getSelectedFile();	
				String str=ta.getText();
			PrintWriter pw=new PrintWriter(f);
				pw.println(str);
				pw.flush();
			}
			}
			catch(Exception ee)
			{	ee.printStackTrace();
			}		
		}
	}
	public static void main(String s[])
	{
		new FileInputOutputTest();		
	}	
}
		
		
