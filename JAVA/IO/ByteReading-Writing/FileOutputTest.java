
// FileOutputTest.java

import java.io.*;
class FileOutputTest
	{ 
	public static void main(String S[])
	{ 
	try
	{ 	FileOutputStream fout=new FileOutputStream("abc.txt");

		String str[]={"this is the First Line.\n","This is the Second Line.\n","This is the Third Line."};

		for(int i=0;i<str.length;i++)
			{ byte b[]=str[i].getBytes();
			fout.write(b);
			}
 		fout.close();
	}
	
	catch(Exception e)

	{e.printStackTrace();
	}

	}}