class ArrayTest
{
int a[];
int count;
ArrayTest(int size)
{a =new int[size];
}

void add(int value)
{if(count=a.length)
int []temp =new int[new size];
for(int i=0;i<count;i++)
{temp[i]=a[i];
a=temp;}
a[count]=value;
count++;
}
void display()
{for(int i=0;i<count;i++)
{Sysytem.out.println(a[i]);
}}

public static void main(String s[])
{ArrayTest at=new ArrayTest[5];
System.out.println("Storing the first 5 values");
for(int i=0;i<=5;i++)
{int x=(int)(math.random()*100);
at.add(x);}
System.out.println("Id of Array Object:"at.a);
System.out.println("\n\nStoring another 4 values");
for(int i=0;i<=3;i++)
{int x=(int)math.random()*100;}
System.out.println("Id of Array Object:"at.a);
System.out.println("Sizeof new array"+at.a.length);
System.out.println("\n\nlist of values:");
at.display();
}}




