class Student
{int rollno,marks;
void admission(int r)
{rollno=r;
System.out.println(rollno+"gets enrolled");
}
void exam(int m)
{marks = m;

System.out.println(rollno+"got marks"+marks);
}
public int hashCode()
{return rollno;
}
public String toString()
{return(" overridden toString");
}}
