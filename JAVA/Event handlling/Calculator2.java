// Calc.java
import java.awt.*;
class Calculator2

{ 
int i,j,k;
Frame fr;
TextField tf;
Label lb;
	Calculator2()
	{  fr=new Frame();
	fr.setLayout(null);
	lb=new Label("Calculator");
	tf=new TextField();
	String st[]={"1","2","3","+","4","5","6","-","7","8","9","*",".","0","=","/"};
	Button b[]=new Button[16];
	for(i=0;i<16;i++)
	{ b[i]=new Button(st[i]);
	}

	lb.setBounds(50,15,100,50);
	tf.setBounds(60,70,270,40);


	for(j=150; j<430 ;j=j+70)
	{for(i=60,k=0 ; i<300  ; i=i+70,k++)
	{b[k].setBounds(i,150,50,50);
	}}




fr.add(lb);
fr.add(tf);
for(i=0;i<16;i++)
{fr.add(b[i]);
}
fr.setSize(500,500)  ;
fr.setVisible(true);
}
public static void main(String s[])
{new Calculator2();
}}
                                                                                                                                                                                                                            