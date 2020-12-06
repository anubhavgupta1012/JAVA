import java.rmi.*;
import javax.xml.*;
import my.*;

public class Test
{
	public static void main(String S[])
		{
		HelloWorldImplService hm=new HelloWorldImplService();
		try
			{
			HelloWorldImpl ht=hm.getHelloWorldImplPort();
			ht.setValue(10,20);
			System.out.println(ht.sum());
			}
		catch(Exception e)
			{
			
			}
		
		}
}