class Student
{static int i,j;
public static void main(String []s)
{Demo a[] =new Demo[5] ;
for( i=0,j=101;i<5;i++,j++)
{ a[i]= new Demo();
a[i].admission(j);
a[i].marks();
a[i].grades();

{System.out.print("Roll no."+a[i].rollno+" having marks "+a[i].marks+" got the grade ="+ a[i].grade);
System.out.print("\n");
}

}}}

class Demo
{
int rollno,marks,i;
char grade;
void admission( int rollno)
{ this.rollno=rollno;
}
void marks()
{marks=(int)(Math.random()*100);
} 
void grades()
{if(marks<40)
grade='D';
else if(marks>=40 && marks<60)
grade='C';
else if(marks>=60 && marks<80)
grade='B';
else if(marks>=80)
grade ='A';
}}
