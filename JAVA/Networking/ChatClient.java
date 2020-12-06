//ChatClient.ajava
 import java.net.*;
import java.util.*;
import java.io.*;
class chatClient
{ public static void main(String s[])
{try{
 System.out.println("Client Stated");
Socket sk=new Socket("192.168.43.198",1500);
 System.out.println("Connection Estblishd to server");


DataOutputStream dout=new DataOutputStream(sk.getOutputStream());
DataInputStream din=new DataInputStream(sk.getInputStream());
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter the user name");
 String user = br.readLine();
dout.writeUTF("login#"+user);
dout.flush();
new ReaderThread(din);
 System.out.println("Enter the msg,enetr 'stop' to Terminate");

while(true)
{String str= br.readLine();
String msg;
if(str.equalsIgnoreCase("stop"))
{msg="logout#"+user;
}
else
{msg="messgage#"+user+":"+str;
}
dout.flush();
if(str.equalsIgnoreCase("stop"))
break;
}}
catch(Exception e)

{e.printStackTrace();
}
}}



class ReadThread extends Thread
{ DataInputStream din;
ReadThread(DataInputStream din)
{this.din=din;
set.Daemon(true);
start();
}
 public void run()
{try {while(true)
{String str= din.readUTF();
System.out.println(str);
}}
catch(Exception E)
{e.printStackTrace();
}}}