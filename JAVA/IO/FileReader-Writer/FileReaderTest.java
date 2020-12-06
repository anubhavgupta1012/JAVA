// FileReader.java
import java.io.*;
class FileReaderTest
	{ public static void main(String []s)
		{
		 try
			{
			 System.out.println("Reading Process is Just Started");

			FileReader fr=new FileReader("abc.txt");
			while(true)
				{	
				int x=fr.read();
				if(x==-1)
				break;
				System.out.println((char)x);
				}
			}
		catch(Exception e)

			{		}
		
		}				
	}