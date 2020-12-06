//SequenceInputTest.java

import java.io.*;

class SequenceInputTest
	{ 	public static void main(String S[])
			{ try
				{ FileInputStream fin1=new FileInputStream("file1.txt");
				  FileInputStream fin2=new FileInputStream("file2.txt");
				SequenceInputStream seq =new SequenceInputStream(fin1,fin2);
				BufferedReader br=new BufferedReader(new InputStreamReader(seq));
				String Str;

				while((Str=br.readLine())!=null)
					{System.out.println(Str);
					
					}
				br.close();
				}
			catch(Exception e)
				{
				}
			}
	}