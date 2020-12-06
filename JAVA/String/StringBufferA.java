class StringBufferA
{public static void main(String []a)
{StringBuffer sb1,sb2,sb3;
sb1=new StringBuffer();
sb2=new StringBuffer("ABC");
sb3=new StringBuffer(30);
System.out.println(sb1.capacity());

System.out.println(sb2.capacity());
System.out.println(sb3.capacity());
}}