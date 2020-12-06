import java.io.IOException;
class CheckedException
{public static void main(String []s)
{int x,y,z;
x=Integer.parseInt(s[0]);
y=Integer.parseInt(s[1]);
try{
if (y<=0)
{throw new IOException();
}}

catch(IOException e)
{
System.out.println("123");}

z=x/y;
System.out.println(z);
System.out.println("thank you");
}}
