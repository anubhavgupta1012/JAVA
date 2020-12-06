interface I
{void m1();
}
class A implements I
{ public void m1()
{System.out.println(" m1 inn class");
}}
class Test
{public static void main(String []a)
{ I ref = new A();
System.out.println(ref.toString());
ref.m1();
Object ob=ref;
}}