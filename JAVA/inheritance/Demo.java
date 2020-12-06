class A
{int x,y;
void m1(int val)
{x= val;
y= val+ 100;
}
void fun()
{System.out.println("i was there in the middle");
}
}


class B extends A
{ int i,j,x;
void m2(int val)
{i =val;
x=200;
j= val+100;
}
void show()
{System.out.println("x of  A="+super.x);
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("i="+i);
System.out.println("j="+j);
super.fun();}
}

class Demo
{public static void main(String S[])
{B ref=new B();
ref.m1(55);
ref.fun();
ref.m2(66);
ref.show();
}}