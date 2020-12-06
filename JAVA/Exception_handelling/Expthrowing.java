class Expthrowing
{public static void main(String []s)
{int x=0,y=0, z=0;

try
{System.out.println("Welcome");
        	try
		{x=Integer.parseInt(s[0]);}
		catch(NumberFormatException e)
		{x=5;}

		try
		{y=Integer.parseInt(s[1]);}
		catch(NumberFormatException e)
		{y=2;}
		
z=x/y;}
catch(ArrayIndexOutOfBoundsException e)
{y=(int)(Math.random()*3);}
catch(ArithmeticException e)
{z=20;
}
try
{if (y==0)
{throw new ArithmeticException();
}}
catch(ArithmeticException e)
{z=7;
}
System.out.println(+z);
}}