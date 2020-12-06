class Test
{public static void main(String S[])
{Outer ref1=new Outer();
Outer.MyInner ref2=ref1.new MyInner();
ref2.m1();
}}