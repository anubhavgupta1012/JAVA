import java.awt.*;
import java.awt.event.*;

class WordCalc implements ActionListener
{ Frame fr;
  TextField tf,tf1,tf2,tf3,tf4;
  Button b;
  Label l1;
  WordCalc()
 { fr=new Frame("WordCalc");
   fr.setLayout(null);
	l1=new Label("Enter Text");
	tf=new TextField();
	tf1=new TextField();
	tf2=new TextField();
	tf3=new TextField();
	tf4=new TextField();
	
	b=new Button("Calc");
	
	l1.setBounds(30,50,100,50);
        tf.setBounds(30,150,300,50);
        b.setBounds(80,220,50,50);

	tf1.setBounds(30,280,200,50);
	tf2.setBounds(30,340,200,50);
	tf3.setBounds(30,390,200,50);
	tf4.setBounds(30,440,200,50);
   	
	fr.add(l1);fr.add(tf);fr.add(b);fr.add(tf1);fr.add(tf2);fr.add(tf3);fr.add(tf4);
        
        b.addActionListener(this);
	fr.setSize(500,500);
	fr.setVisible(true);
  
  }
 public static void main(String st[])
    { new WordCalc();
     }
	public void actionPerformed(ActionEvent e)
       {  String  s0= tf.getText();
	System.out.println(s0);
          int spaces=0,c=0,d=0,v=0;

                for(int i=0;i<s0.length();i++)
                 {char ch= s0.charAt(i);


		if( ch==' ')
		{spaces++;}
	                     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    		{v++;}
		else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
   			{d++;}
		else
		  {c++;}
                  }



	String s00=Integer.toString(spaces);
	String s01=Integer.toString(v);
	String s02=Integer.toString(c);
	String s03=Integer.toString(d);


	tf1.setText(s00);
	tf2.setText(s01);
	tf3.setText(s02);
	tf4.setText(s03);

        	//tf1.setText(Integer.toString(spaces));
	//tf2.setText(Integer.toString(v));
	//tf3.setText(Integer.toString(c));
	//tf4.setText(Integer.toString(d));

                    
                   }
        }
