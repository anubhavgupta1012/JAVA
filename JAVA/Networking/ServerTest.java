//ServerTest.java
 import java.net.*;

class ServerTest
{ 
	public static void main(String s[])throws Exception
	{
		System.out.println("Server staeted");
		ServerSocket ss= new ServerSocket(1500);
		while (true)
		{
			System.out.println("Waiting For Client");
			Socket sk=ss.accept();
			System.out.println("Client Connected");
		}
	}
}


