class Test
{public static void main(String []s)
{ Student s1= new Student();
 Student s2= new Student();
s1.admission(101);
s2.admission(102);






System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println();
System.out.println(s1.toString());
System.out.println(s2.toString());
}}