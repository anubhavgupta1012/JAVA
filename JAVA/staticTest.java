class Test
{static int x;
int y;
void set(int val)
{x=x+val;
y=val;
System.out.println("set invoked");}
void show()
{System.out.println("Y="+y);
}}
class staticTest
{public static void main(String []s)
{Test t1,t2;
t1=new Test();
t2=new Test();
t1.set(50);
t2.set(60);
t1.show();
t2.show();
System.out.println("X= " +Test.x );



}
}