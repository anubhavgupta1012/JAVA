
// ChatClient.java

import java.net.*;
import java.io.*;

class ChatClient
{
	public static void main(String s[])
	{	try
		{
			System.out.println("Client started");
			
			Socket sk = new Socket("192.168.43.198",1500);
	System.out.println("Connection established to the server");	
		
DataOutputStream dout = new DataOutputStream(sk.getOutputStream());	
DataInputStream din = new DataInputStream(sk.getInputStream());
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("enter the user name");
			String user = br.readLine();
			dout.writeUTF("login#"+user);
			dout.flush();		
		
			new ReaderThread(din);
System.out.println("Enter the msgs, enter 'stop' to terminate");
			while(true)
			{
				String str = br.readLine();
				String msg;
				if(str.equalsIgnoreCase("stop"))
				{
					msg = "logout#"+user;	
				}
				else
				{      msg = "message#"+user+": "+str;	
				}
				
				dout.writeUTF(msg);
				dout.flush();
			
				if(str.equalsIgnoreCase("stop"))
					break;
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}

class ReaderThread extends Thread
{
	DataInputStream din;
	ReaderThread(DataInputStream din)
	{
		this.din = din;	
		setDaemon(true);
		start();
	}		
	public void run()
	{	try
		{	while(true)
			{
				String str = din.readUTF();	
				
				System.out.println(str);
			}			
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}

