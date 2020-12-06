

import java.io.*;
class FileWriterTest
	{ 
	public static void main(String S[])
	{ System.out.println("Wiritting Process has just Started");
	try
	{ 	FileWriter fw=new FileWriter("abc.txt");

		String str[]={"this is the First Line.\n","This is the Second Line.\n","This is the Third Line."};

		for(int i=0;i<str.length;i++)
			{
			fw.write(str[i]);
			}
 		fw.close();
	}
	
	catch(Exception e)

	{e.printStackTrace();
	}

	}}