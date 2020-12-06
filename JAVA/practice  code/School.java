class School
{ public static void main(String []s)
{ Student st1,st2,st3;
st1=new Student();
st2=new Student();
st3=st1;
st1.admission(101);
st2.admission(101);
st1.exam(95);
st2.exam(95);
Sytem.out.println(st1==st2);
System.out.priintln(st1==st3);

System.out.priintln(st1.compare(st2));

System.out.priintln(+st1);

System.out.priintln(+st2);
}}