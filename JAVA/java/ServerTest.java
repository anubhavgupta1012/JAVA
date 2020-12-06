//ServerTest.java
import java.net.*;
import java.io.*;

class ServerTest
{
public static void main(String s[])throws Exception
{
System.out.println("Server Started");
ServerSocket ss=new ServerSocket(1500);


System.out.println("Waiting for the client");
Socket sk=ss.accept();
System.out.println("Client connected");


}
}
