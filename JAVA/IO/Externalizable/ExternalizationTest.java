import java.io.*;
class ExternalizationTest
{
	public static void main(String S[])
		{try
			{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fout=new FileOutputStream("Student.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			while(true)
				{ System.out.println("Enter the name,rollno,marks");
				String name=br.readLine();
				int rollno=Integer.parseInt(br.readLine());
				int marks=Integer.parseInt(br.readLine());
				
				Student st=new Student(name,rollno,marks);
				out.writeObject(st);
				out.flush();
				System.out.println("do you want to store more?(Y/N)");
				String option =br.readLine();
				if(option.equals("n"))
					break;
				}

				out.close();
			FileInputStream fin=new FileInputStream("Student.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			System.out.println("\n\nRecords are as follows");
			while(true)
				{ try
					{Student st=(Student)in.readObject();
					System.out.println(st);
					}
				catch(Exception e)
					{ break;
					}
				}
			in.close();
			}	
		
		catch(Exception e)
		{e.printStackTrace();
		}
	}
}		
			