class Test
{int x,y;

 Test(int val)
{System.out .println("obj created");
x=val;

}
Test show()
{
return this;
}

public static void main(String []s)
{ Test t1=new Test(5);
System.out.println( t1.show());
t1.getClass();
t1.getSuperclass();
t1.getName();

 }
}