class GenericTest
{ public static void main(String S[])
{ Store <Integer>st1=new Store<Integer>();
  Store <String>st2=new Store<String>();
st1.set(55);
st2.set("ABC");

Number n=st1.get();
String Str=st2.get();

System.out.println(n);
System.out.println(Str);
System.out.println("Object Retrieved");
}}

