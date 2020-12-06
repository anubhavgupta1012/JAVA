class A
{  final void m1()
{System.out.println("m1 in A");
}}
class B extends A
{ void m1()
{System.out.println("m2 in B");
}}


class Y
{ public  static void main(String []s)
{ B t = new B();
t.m1();
}}
