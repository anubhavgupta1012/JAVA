//ClientTest.java

import java.net.*;
 class ClientTest
{
	public static void main(String S[])throws Exception
	{
	System.out.println("Client Started");
	System.out.println("Sending Connection Request");
	Socket sk=new Socket("localHost",1500);
	System.out.println("Request Submitted");
	}
}