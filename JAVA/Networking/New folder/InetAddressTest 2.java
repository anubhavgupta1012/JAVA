// InetAddressTest.java
import java.net.*;


class InetAddressTest2
	{
	public static void main(String S[])
		{	try
			{
			// InetAddress addr=InetAddress.getLocalHost();
			InetAddress addr=InetAddress.getByName("LAPTOP-4SHAHLDU");
			System.out.println("Address: "+addr.getHostAddress());
			System.out.println("Name : "+ addr.getHostName());
			}

			catch(Exception e)
			{
			e.printStackTrace();
			}
		}
	}