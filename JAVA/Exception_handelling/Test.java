class Test
{public static void main(String s[])
{int x,y,z;
try
{
x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
if(y<=0)
{throw new ArithmeticException("this is exception creation");
}
z=x/y;
System.out.println(+z);
} 

catch(ArithmeticException e)
{System.out.println("in the catch");}

System.out.println("thank you");
}}