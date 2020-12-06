// SystemInTest.java


import java.io.*;


class SystemInTest

{	public static void main(String S[])
	
		{	try
		
			{	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			FileWriter fout=new FileWriter("Student.txt");

			
			while(true)

						{	 System.err.println("Enter the Name, RollNo., Marks and Grade of Student");
			
				 String name= br.readLine();
			
				 String rollno= br.readLine();
			
				  String marks= br.readLine();

							 String grade= br.readLine();
	
		
				String Str=name+":"+rollno+":"+marks+":"+grade+":"+"\n";
			
				fout.write(Str);
			
				System.err.println("Do you want to store more (Y/N)");
			
				String option= br.readLine();
			

				if(option.equalsIgnoreCase("n"))
		
					fout.close();
		
					break;

						}

			}
	
		catch(Exception e)

			{			
		}
	
	}

}

