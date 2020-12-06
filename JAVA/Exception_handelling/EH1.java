class EH1
{public static void main(String []s)
{int x,y,z;
try
{x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
 z=x/y;
System.out.println(+z);}
catch(ArithmeticException e)
{System.out.println("in Arithmectic catch");
}
System.out.println("thankyou");
}}