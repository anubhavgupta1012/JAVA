abstract class A
{ abstract  void m1();
void m2()
{System.out.println("m1 in A");
}}
class B extends A
{  void m1()
{System.out.println("m1 in B");
}}
class C extends A
{  void m1()
{System.out.println("m1 in C");
System.out.println(this);
System.out.println(ref);

}}

class sample
{static void check(A ref)
{ ref.m1();


}}
class Demo
{
public static void main(String []a)
{sample.check(new B());
 sample.check(new C());

}}