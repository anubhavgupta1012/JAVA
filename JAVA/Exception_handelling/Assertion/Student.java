class Student
{String name, grade;
int marks;
Student(String s)
{name =s;
}
void exam(int  m)
{gradeCalc(m);
}
private void gradeCalc( int m)
{assert(m>=0):("marks be  >=0");
marks =m;
if(m>=80)
grade="A";
else if(m>=60&&m<80)
grade="B";
else
grade="C";
}
void show()
{System.out.println(name+" "+marks+" "+grade);
}}

