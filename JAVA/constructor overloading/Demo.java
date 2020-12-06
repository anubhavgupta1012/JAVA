class Test
{int x,y;
Test(int val)
{
x=val;
}
// Test(char val1,int val2)
//{
//x=val1;
//y=val2;
//} otherwise ambiguity error
Test(int val1,char val2)
{
x=val1;
y=val2;
}

void show()
{System.out .println("x is =" +x);
System.out .println("y is =" +y);
}
}

class Demo
{public static void main(String []s)
{Test t1=new Test(5);
Test t2=new Test('A','A');

t1.show();
t2.show(); 
}
}