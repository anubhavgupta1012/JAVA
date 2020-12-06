class GenericTest2
{ public static void main(String S[])
{ Store <Number>st=new Store<Number>();
st.set(new Integer(57));
st.set(55456);
Number n=st.get();
Integer it=(Integer)st.get();
System.out.println(n);
System.out.println(it);
System.out.println("Object Retrieved");
}}

