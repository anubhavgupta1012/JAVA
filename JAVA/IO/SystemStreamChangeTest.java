// SystemStreamChangeTest.java
import java.io.*;
class SystemStreamChangeTest
{	public static void main(String S[])
		{ try
			{ FileInputStream fin=new FileInputStream("file1.txt");
			  PrintStream out=new PrintStream("flie2.txt");
	       		  PrintStream err=new PrintStream("file3.txt");
			System.out.println("Changing the Stream");
			System.setIn(fin);
			System.setOut(out);
			System.setErr(err);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String Str;
			while((Str=br.readLine())!=null)
				{	if(Str.length()<10)
						System.err.println(Str);
					else
						System.out.println(Str);
	
				}
			}
		catch(Exception e)
			{
			}
		}
}
	
// Error Showing 