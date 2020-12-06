class Sort
{static int i,j,m=0,temp;
public static void main(String []A)
{Demo a[] =new Demo[5] ;
for( i=0;i<5;i++)
{ a[i]= new Demo();
a[i].value();}

for(i=0;i<5;i++)
{System.out.println(a[i].value);}

for(int p=0;p<4;p++)
{for(int s=0;s<4-p;s++)
{if(a[s].value>a[s+1].value)
{temp=a[s].value;
a[s].value=a[s+1].value;
a[s+1].value=temp;}}}


System.out.println("the sorted array is");
for(i=0;i<5;i++)
{System.out.println(+a[i].value);}





}}

class Demo
{
int value;
void value()
{value=(int)(Math.random()*100);
} 
}
