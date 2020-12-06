class Student
{int rollno,marks;
void admission(int r)
{roll no=r;
System.out.println("roll no get enrolled:" +rollno);
}
void exam(int m)
{marks =m;
System.out.println(rollno+"  has  got marks" +marks);}
void report()
{System.out.println("roll no" +rollno);
System.out.println("marks" +marks);
}
boolean compare(Student st)
{boolean b;
b=(rollno==st.rollno) && (marks==st.marks);
return (b);
}}