class Exception
{public static void main(String []s)
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
 z=x/y;
System.out.println(+z);

System.out.println("dfghjdk");}
catch(ArithmeticException e)
{System.out.println("in Arithmectic catch");
System.out.println(e.getMessage());
System.out.println(e);
}
catch(NumberFormatException e)
{System.out.println("in NumberFormat catch");
System.out.println(e.getMessage());
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{System.out.println("in ArrayIndexOutOfBoundsException catch");
e.printStackTrace();}
System.out.println("thankyou");
}}