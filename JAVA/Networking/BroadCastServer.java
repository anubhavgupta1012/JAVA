// BroadCastServer.java
import java.net.*;
import java.io.*;
import java.util.*;
class BroadCastServer
{ public static void main(String S[])
      {try
         {System.out.println("Server Started");
	ServerSocket ss= new ServerSocket(1500);
	ArrayList al= new ArrayList();
// Collection created
  while(true)
	{
	System.out.println("waiting for Client");
	Socket sk= ss.accept();
	al.add(sk);
//adding the socket object  into coolection
new clientThread(sk,al);
}
catch(Exception e)
	{
e.printStackTrace();
	}


}}


class clientThread extends Thread
{ ArrayList al;
Socket sk;
ClientThread(Socket sk,ArrayList al)
{this.sk=sk;
this.al=al;
start();
}
public void run()
{
try
	{DataInputStream din=new DataInputStream(sk.getInputStream());
	while (true)
	{String msg= din.readUTF();
	String str[]=msg.split('#');
	if(str[0].equals("login"))
	{
	msg=str[1]+"connected";
	System.out.println(msg);

}


else if(str[0].equals("logout"))
{msg=str[1]+"logged out";
System.out.println(msg);}

else
 { msg=str[1];}
broadcast(msg);


}

 if(str[0].equals("logout"))
{al.remove(str[1]);
break;}
}
}





catch(Exception e)
{e.printStackTrace();
}}





void broadcast(String msg)

{try
   {//broadcasting the msg
     for(Object ob:al)
     {Socket sk= (Socket)ob;
DataOutputStream dout=new DataOutputStream(sk.getOutputStream());


dout.writeUTF(msg);
dout.flush();
}}
catch(Exception e)
{e.printStackTrace();
}}}







