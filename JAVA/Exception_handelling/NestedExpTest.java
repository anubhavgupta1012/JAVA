class NestedExpTest
{public static void main(String []s)
{int x,y,z;
x=y=z=0;
try
{System.out.println("Welcome");
        	try
		{x=Integer.parseInt(s[0]);
               }
		
		catch(NumberFormatException e)
		{x=100;}

		try
		{
		y=Integer.parseInt(s[1]);}
		catch(NumberFormatException e)
		{y=2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{y=1;
		x=35;}

z=x/y;
}

catch(ArrayIndexOutOfBoundsException e)
{z= -1;}
catch(ArithmeticException e)
{z=10;}
System.out.println(+z);
}}