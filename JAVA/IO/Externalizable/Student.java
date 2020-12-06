//ExternalizationTest.java


import java.io.*;

class Student implements Externalizable
{	 String name;
	int rollno,marks;
	
	public Student()
	{
	}
	
	Student(String name,int rollno,int marks)
	{
	 this.name=name;
	this.rollno=rollno;
	this.marks=marks;
	}
	
	public void readExternal(ObjectInput in)
		{ try
			{
			name=(String)in.readObject();
			rollno=in.readInt();
			marks=in.readInt();			
			name=name.toUpperCase();
			}
		catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	public void writeExternal(ObjectOutput out)throws IOException

		{ out.writeObject(name);
		out.writeInt(rollno);
		if(marks>=35&&marks<40)
		marks+=5;
		out.writeInt(marks);
		}
	public String toString()
		{return(rollno+":"+name+":"+marks);
		}



}
	