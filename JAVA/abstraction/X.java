class A
{final static void m1()
{System.out.println("m1 in class A");
}}
class B extends A
{static void m2()
{System.out.println("m2 in class B");
}}
class sample
{static void check(A ref)
{ref.m1();
}}
class X
{public static void main(String []s)
{sample.check(new B());

}}
