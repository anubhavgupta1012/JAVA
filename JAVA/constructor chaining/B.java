class A
{ A()
{this(5);
System.out.println("1ct contructor of A");
}
A(int x)
{System.out.println("2nd contructor of A");
}
}
class B extends A
{ B()
{super (5);//super();
System.out.println("1st contructor of B");}
B(int x)
{this();
System.out.println("2nd contructor of B");
}
public static void main(String s[])
{System.out.println("in the main");
new B(5);
}}