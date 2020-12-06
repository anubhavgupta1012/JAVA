import my.*;
import java.rmi.*;
import java.rmi.server.*;

public class Client{
	
	public static void main(String S[])
		{ 
		try
			{
			my.MyRemote m=(my.MyRemote)Naming.lookup("rmi://localhost:1099/ANUBHAV");
			System.out.println(m.add(13,56));
			}

		catch(Exception e)
			{
			System.out.println(e);		
			}

		
		}

		}