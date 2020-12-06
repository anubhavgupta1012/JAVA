// DataIOTest.java

import java.io.*;
class DataIOTest 
{	public static void main(String s[])
	{	try
		{
	FileOutputStream fout=new FileOutputStream("student.txt");
			
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			DataOutputStream dout=new DataOutputStream(fout);
			while(true)
			{
System.out.println("entre the name,rollno,marks and grade");

		String name = br.readLine();
		int rollno = Integer.parseInt(br.readLine());					float marks = Float.parseFloat(br.readLine());
		char grade = br.readLine().charAt(0);
												dout.writeUTF(name);
		dout.writeInt(rollno);
		dout.writeFloat(marks);	
		dout.writeChar(grade);
		dout.flush();

System.out.println("do u want to store more records(y/n)");
		String option=br.readLine();
		if(option.equals("n"))
			break;
		}
		dout.close();

		FileInputStream fin=new FileInputStream("student.txt");
		DataInputStream din=new DataInputStream(fin);
		
System.out.println("\n\n entered records as follows:");
		while(true)
		{
			try	
			{
		String name=din.readUTF();							int rollno=din.readInt();
		float marks=din.readFloat();
		char grade=din.readChar();
		System.out.println(name+"\t"+rollno+"\t"+marks+"\t"+grade);
			}
			catch(Exception e)
			{	break;
			}
		}
		din.close();
	}
	catch(Exception e)
	{	e.printStackTrace();
	}
	}// main method close
}