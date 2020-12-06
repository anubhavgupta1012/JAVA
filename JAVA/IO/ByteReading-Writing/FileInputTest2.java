//FileInputTest2.jav
import java.io.*;
class FileInputTest2
	{ public static void main(String S[])
		{ 
		     try
			{ System.out.println("File Content is about to retrieved");

			FileInputStream fin=new FileInputStream("abc.txt");

			int x=fin.available();
			 

			byte b[]=new byte[x];
			fin.read(b);
				String str=new String(b);
			  System.out.print(str);
				
			fin.close();
			}

		catch(Exception e)
			{	e.printStackTrace();
			}

		}
	}