// BufferedWriterTest.java
 
import java.io.*;
 class BufferedWriterTest
	{	 public static void main(String S[])
		{	try
			{ FileWriter fin=new FileWriter("ac.txt");
			BufferedWriter bfr=new BufferedWriter(fin);
			String Str[]={"this is the first line\n","this is the Second line\n","this is the third line"};
			for(int i=0;i<Str.length;i++)
				{bfr.write("gkvmk");
				}
			
			}
			
			catch(Exception E)
			{	
			}
			
		}	
			
	}