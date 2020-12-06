// BufferedReaderTest.java
import java.io.*;
class BufferedReaderTest
	{	 public static void main(String S[])
		{
		System.out.println("Reading process is just Started");

		try
			{FileReader fr=new FileReader("abc.txt");
			 BufferedReader bfr=new BufferedReader(fr);
			while(true)
				{ String Str=bfr.readLine();
				if(Str==null)
				break;
				System.out.print(Str);
				}
			}	

		catch(Exception e)
			{		
			}	
		}		
	}