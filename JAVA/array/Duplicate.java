class Duplicate
{static int i,j,m=0;
public static void main(String []s)
{Demo a[] =new Demo[5] ;
for( i=0;i<5;i++)
{ a[i]= new Demo();
a[i].value();}
for(int i=0;i<5;i++)
{System.out.println(a[i].value);}
for(int i=0;i<5;i++)
{for(j=i+1;j<5;j++)
{if (a[i].value==a[j].value)
{System.out.println("Duplicate elemrnt is present");
}
else
{System.out.println("not present");
}
}}



}}

class Demo
{
int value;
void value()
{value=(int)(Math.random()*100);
} 
}
