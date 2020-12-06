// DeserializableTest.java

import java.io.*;

class DeserializableTest
{	public static void main(String S[])
	{	try
		{ FileInputStream fin=new FileInputStream("Student.txt");
		  ObjectInputStream in=new ObjectInputStream(fin);
		  
		  while(true)
				{ try
					{ Student st=(Student)in.readObject();
					 System.out.println(st);
					}
				catch(Exception e)
					{	break;
					}
				}
			
			in.close();
		}

	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
	
		
		