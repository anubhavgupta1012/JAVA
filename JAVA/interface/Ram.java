interface I1
{
void m1();
void m2();
}
class A
{ public void m1()
{System.out.println("m1 in A");
}
 }
class B extends A implements I1
{public void   m2()
{System.out.println("m2 in B");
}
}
 class Ram
{static void check(B tt)
{tt.m1();
tt.m2();
}
public static void main( String []s )
  {check(new B());
}}