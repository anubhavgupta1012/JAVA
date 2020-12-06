//ServermsgTest.java
 import java.io.*;
import java.net.*;
 class ServerMsgTest
{ public static void main(String S[])throws Exception
{System.out.println("Server Started");
ServerSocket ss=new ServerSocket(1500);
System.out.println("Wiating for client");
Socket sk =ss.accept();
 DataOutputStream dout =new DataOutputStream (sk.getOutputStream());
DataInputStream din =new DataInputStream(sk.getInputStream());

while(true)
{String msg= din.readUTF();
System.out.println("Client Msg:"+msg);
msg = msg.toUpperCase();
dout.writeUTF(msg);
dout.flush();}
}}