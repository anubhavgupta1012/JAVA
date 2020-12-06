package my;
import java.rmi.*;
import java.rmi.server.*;

public class Register {

	public static void main(String S[])
		{
		try
			{
		my.MyServer m=new my.MyServer();
		Naming.rebind("rmi://localhost:1099/ANUBHAV",m);
		System.out.println("Server Started");
			}



		catch(Exception  e)
			{
			e.printStackTrace();
			}
		}

	}