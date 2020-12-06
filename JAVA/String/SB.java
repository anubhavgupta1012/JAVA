class SB
{public static void main(String []a)

{StringBuffer sb1,sb,sb3,sb4;

sb=new StringBuffer("ABC");
sb1=sb.append(" ma da ladla bigad gya, ma da ladla bigad gya");
sb3=new StringBuffer("ABCD");
sb4=sb3.append(33);
sb5=sb3.insert(1,'z');
System.out.println(sb1);
System.out.println(sb4);}}