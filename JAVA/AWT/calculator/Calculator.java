// Calc.java
import java.awt.*;
class Calculator
{ 
int i;
Frame fr;
TextField tf;
Label lb;
Calculator()
{fr=new Frame();
fr.setLayout(null);
lb=new Label("Calculator");
tf=new TextField();

 
String st[]={"1","2","3","+","4","5","6","-","7","8","9","*",".","0","=","/"};
Button b[]=new Button[16];
for(i=0;i<16;i++)
{b[i]=new Button(st[i]);
}


lb.setBounds(50,15,100,50);
tf.setBounds(60,70,270,40);
b[0].setBounds(60,150,50,50);
b[1].setBounds(130,150,50,50);
b[2].setBounds(200,150,50,50);
b[3].setBounds(270,150,50,50);
b[4].setBounds(60,220,50,50);
b[5].setBounds(130,220,50,50);
b[6].setBounds(200,220,50,50);
b[7].setBounds(270,220,50,50);
b[8].setBounds(60,290,50,50);
b[9].setBounds(130,290,50,50);
b[10].setBounds(200,290,50,50);
b[11].setBounds(270,290,50,50);
b[12].setBounds(60,360,50,50);
b[13].setBounds(130,360,50,50);
b[14].setBounds(200,360,50,50);
b[15].setBounds(270, 360,50,50);
         


fr.add(lb);
fr.add(tf);
for(i=0;i<16;i++)
{fr.add(b[i]);
}
fr.setSize(500,500)    ;
fr.setVisible(true);
}
public static void main(String s[])
{new Calculator();
}}
                                                                                                                                                                                                                            