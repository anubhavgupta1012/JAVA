// DataIOTest1.java

import java.io.*;
class Student
{
	private int rollno,marks;
	private char grade;
	Student(int rollno,int marks,char grade)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.grade=grade;
	}
	public String toString()
	{
		return(rollno+" : "+marks+" : "+grade);
	}
	int getRollno()
	{
		return(rollno);
	}
	int getMarks()
	{
		return(marks);
	}	
	char getGrade()
	{
		return(grade);
	}
}
class IOTest
{
	DataOutputStream dout;
	DataInputStream din;
	String fname;
	IOTest(String fname)
	{
		this.fname=fname;
	}
	void writeStudent(Student st)throws IOException
	{
		dout=new DataOutputStream(new FileOutputStream(fname));
		dout.writeInt(st.getRollno());
		dout.writeInt(st.getMarks());
		dout.writeChar(st.getGrade());

		// explicitly move out the data into the file
		dout.flush();
		// closing the stream to close the associated file
		dout.close();
	}
	Student readStudent()throws IOException
	{
		din=new DataInputStream(new FileInputStream(fname));
		int rollno=din.readInt();
		int marks=din.readInt();
		char grade=din.readChar();
		
		Student st=new Student(rollno,marks,grade);
		return(st);	
	}					
}
class DataIOTest1
{
	public static void main(String s[])
	{
		try
		{
			IOTest io=new IOTest(s[0]);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("entre the rollno,marks and grade");
			int rollno=Integer.parseInt(br.readLine());
			int marks=Integer.parseInt(br.readLine());
			char grade=br.readLine().charAt(0);

			Student st=new Student(rollno,marks,grade);
			io.writeStudent(st);
			System.out.println("record stored into the file");
			
			System.out.println("Reading record back from file.....");
		
			Student st2=io.readStudent();
			System.out.println(st2);
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}		
}