class Test2
{public static void main(String []z)
{String a,b,c;
char m;

String s =new String("ABC");

System.out.println( s );
a=s.toLowerCase();
System.out.println( a );
String e="abc";
System.out.println( a==e );

b=a.toUpperCase();
System.out.println( b );
c=s.concat(" tatti kha le");            // in heap unref. id has been created
String f= new String(" tatti kha le");       //heap
String g= "tatti kha le";          //pool

System.out.println(f==g  );

System.out.println( c );
System.out.println( s );
int j=0;
for(int i=0;i<c.length();i++)
{m= c.charAt(i);
System.out.println(m);
if(m=='A'&&m=='E'&&m=='I'&&m=='O'&&m=='U'&&m=='a'&&m=='e'&&m=='i'&&m=='o'&&m=='u')
{j++;

}}

System.out.println(+j );}}