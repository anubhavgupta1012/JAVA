// InetAddressTest.java
import java.net.InetAddress;


class InetAddressTest
{public static void main(String S[])
{try
{ InetAddress a=InetAddress.getLocalHost();
 //  InetAddress addr=InetAddress.getByName("LAPTOP-FN57OMOJ");
System.out.println("Address: "+a.getHostAddress());
System.out.println("Name : "+ a.getHostName());
}
catch(Exception e)

{e.printStackTrace();
}
}}