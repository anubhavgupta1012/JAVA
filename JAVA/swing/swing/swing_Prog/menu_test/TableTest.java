
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class TableTest  implements ActionListener
{
	JTable table;
	JScrollPane pane;
	JTextField tf1,tf2,tf3,tf4;
	JButton b1,b2;
	DefaultTableModel model;	
	JPanel fr1;
	JFrame fr2;
	TableTest()
	{
		fr1=new JPanel();
		fr2=new JFrame();
		fr1.setLayout(new FlowLayout());	
		fr2.setLayout(new FlowLayout());

		tf1=new JTextField(10);	
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		b1=new JButton("Add");
		b2=new JButton("Show");
	
		fr1.add(tf1);fr1.add(tf2);fr1.add(tf3);
		fr1.add(tf4);
		fr1.add(b1);	fr1.add(b2);
			
		model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Rollno");
		model.addColumn("Marks");	
		model.addColumn("Grade");	
		table=new JTable(model);
		pane=new JScrollPane(table);
		
		pane.setPreferredSize(new Dimension(200,250));
		
		fr2.add(pane);

		fr1.setSize(300,300);
		fr2.setSize(300,300);
		fr1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str[]=new String[4];
			str[0]=tf1.getText();
			str[1]=tf2.getText();
			str[2]=tf3.getText();
			str[3]=tf4.getText();
			model.addRow(str);
			tf1.setText("");tf2.setText("");
			tf3.setText("");tf4.setText("");	
		}
		if(e.getSource()==b2)
			fr2.setVisible(true);
	}
	public static void main(String s[])
	{
		new TableTest();
	}
}
	