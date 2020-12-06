class Test
{ 
static int x;
int y;

static void m1()
{System.out.println("x="+x);
}
void m2(int val)
{ y=val;
x=x+100;
}
}

class staticMain
{public static void main(String s[])
{ Test t1= new Test();
Test t2= new Test();
t1.m2(50);
t2.m2(60);
Test.m1();
}}
