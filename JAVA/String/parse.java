class parse
{public static void main(String S[])
{String str ="123456";
for (int i=0;i<str.length();i++)
{char ch = str.charAt(i);
int x=Integer.parseInt(ch); // parseInt is only for Strint not for char

System.out.println(x);}
}}