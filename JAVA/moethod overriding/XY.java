class A
{ void m1(float b)
{System.out.println("m1 in A");
}
static void check(A ref)
{
ref.m1(5.5f);
}}

class B 
{void m1(int a)
{System.out.println("m1 in B");
}
  
class XY
{public static void main(String s[])
{A.check(new A());
}}