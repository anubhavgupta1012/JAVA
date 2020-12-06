//FileInputTest.jav
import java.io.*;
class FileInputTest
	{ public static void main(String S[])
		{ 
		     try
			{ System.out.println("File Content is about to retrieved");

			FileInputStream fin=new FileInputStream("abc.txt");

			while (true)
				{  int x=fin.read();
				 if(x==-1)
  				  break;
				
				  System.out.println((char)x);
				}
			fin.close();
			}

		catch(Exception e)
			{	e.printStackTrace();
			}

		}
	}