
import java.io.*;
class SerializableTest
{ 	public static void main(String S[])
	{ try
		{ FileOutputStream fout=new FileOutputStream("Student.txt");
		  ObjectOutputStream out=new ObjectOutputStream(fout);
		
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  
		  while(true)
			{ System.out.println("Enter the Name, RollNo, Marks");
			  String name =br.readLine();
			int rollno=Integer.parseInt(br.readLine());
			int marks =Integer.parseInt(br.readLine());
			
			Student st=new Student(name,rollno,marks);
			out.writeObject(st);
			//out.flush();
			System.out.println("Do you want to store more??(Y/N)");
			String option=br.readLine();
			if(option.equals("n"))
				break;
			}

		fout.close();
		}
	catch(Exception e)
		{e.printStackTrace();
		}

	}
}