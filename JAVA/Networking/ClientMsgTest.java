// CLientMsgTest.java
import java.io.*;
import java.util.*;
 

class ClientMsgTest {
public static void main(String s[])throws Exception
{ System.out.println("Client Started");
Socket sk = new Socket ("localHost",1500);
System.out.println("Connection Established");
Scanner sc= new Scanner (System.in);
 DataOutputStream dout =new DataOutputStream (sk.getOutputStream());
DataInputStream din =new DataInputStream(sk.getInputStream());

System.out.println("Enter the Msg and Enter the Stop to terminate");

while(true)
{
String str =sc.nextLine();
dout.writeUTF(str);
dout.flush();
str=din.readUTF();
System.out.println(str);
}
}



}

