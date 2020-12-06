class StringBufferTest
{public static void main(String []a)

{StringBuffer sb1,sb2,sb3;
sb1=new StringBuffer(5);
sb2=new StringBuffer("ABC");
sb3=new StringBuffer();
System.out.println("old capacities");
System.out.println(sb1.capacity());
System.out.println(sb2.capacity());
System.out.println(sb3.capacity());
sb1.ensureCapacity(6);
sb2.ensureCapacity(20);
sb3.ensureCapacity(17);
System.out.println("NEW capacities");
System.out.println(sb1.capacity());
System.out.println(sb2.capacity());
System.out.println(sb3.capacity());
}}