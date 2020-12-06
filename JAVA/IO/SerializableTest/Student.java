// StudentSerial.java
import java.io.*;
class Student implements Serializable
{ 
	int rollno,marks;
	String name;

	Student(String name,int rollno, int marks)
	{ this.name=name;
	  this.rollno=rollno;
	  this.marks=marks;
	
	}
	

	public String toString()
	{ return(name+ "  "+rollno+"  "+marks);
	}
}