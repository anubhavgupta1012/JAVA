class staticbolcks
{static int x;
static
{  x=(int)(Math.random()*1000);
System.out.println("x is intialised::" +x);
}
void m1(int val)
{int result=val*x/100;
System.out.println(+result);}



public static void main(String S[])
{ staticbolcks f=new staticbolcks();
f.m1(100);
System.out.println(f);
}
}

