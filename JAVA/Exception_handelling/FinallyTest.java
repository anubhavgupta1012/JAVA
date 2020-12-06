class FinallyTest
{public static void main(String s[])
{
int x,y,z;
try
{ x=Integer.parseInt(s[0]);
  y=Integer.parseInt(s[1]);
z=x/y;
if (z<=5)
{return;}
System.out.println(z);
} 
catch(ArithmeticException e)
{e.printStackTrace();
}
finally
{System.out.println("this is finaaly block");
}
System.out.println("thank you");
}}