// BroadcastServer.java

import java.net.*;
import java.io.*;
import java.util.*;

class BroadcastServer
{	public static void main(String s[])
	{	try
		{
			System.out.println("Server started");
			ServerSocket ss=new ServerSocket(1500);

			ArrayList al = new ArrayList();
			// Collection created

			while(true)
			{
			System.out.println("waiting for the client");
			Socket	sk = ss.accept();
			 
				al.add(sk); 
			// adding the Socket object into collection

				new ClientThread(sk,al);
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
class ClientThread extends Thread
{
	ArrayList al;
	Socket sk;
	ClientThread(Socket sk,ArrayList al)
	{
		this.sk = sk;
		this.al = al;
		start();
	}
	public void run()
	{	try
		{
      DataInputStream din = new DataInputStream(sk.getInputStream());
				
			while(true)
			{
				String msg=din.readUTF();
				String str[]=msg.split("#");
							
				if(str[0].equals("login"))
				{
					msg = str[1]+" connected";
					System.out.println(msg);
				}
				else if(str[0].equals("logout"))
				{
					msg = str[1]+" loggedout";
					System.out.println(msg);
				}
				else
				{
					msg = str[1];
				}		
				broadcast(msg);
	
				if(str[0].equals("logout"))
				{
					al.remove(str[1]);
					break;
				}		
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
	
	void broadcast(String msg)
	{
		try
		{	// Broadcasting the msgs

			for(Object ob:al)
			{	
				Socket sk=(Socket)ob;
		DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
				dout.writeUTF(msg);
				dout.flush();	
						
			}			
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}	
}



