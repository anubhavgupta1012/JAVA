class staticbolcks
{static int x;
static
{  x=(int)(Math.random()*10);
System.out.println("x is intialised::" +x);
}
staticblocks(int val)
{int result=val*x/100;
System.out.println(+result);}}

class  staticbolcks1
{
public static void main(String S[])
{ staticbolcks f ;
f=new staticbolcks(100);
}
}

