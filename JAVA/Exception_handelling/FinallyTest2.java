class FinallyTest2
{public static void main(String s[])
{
int x,y,z;
x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
try
{ 
z=x/y;
System.out.println(z);
} 
catch(ArithmeticException e)
{e.printStackTrace();
}
finally
{System.out.println("this is finaaly block");
return;}

}}