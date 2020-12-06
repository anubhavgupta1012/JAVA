import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;

import org.omg.CORBA.portable.InputStream;

class URLTest {
	public static void main(String S[])
	{try
	{ System.out.println("Sending the Request for the web Page");
	URL url= new URL("http://www.facebook.com");
	URLConnection con=url.openConnection();
	System.out.println(WebPage Loaded);
	InputStream in=con.getInputStream();
	BufferReader br=new BufferedReader(new InputStreamReader(in);
	File f=new File("abc.html");
	FileOutputStream fout=new FileOUtputStream(f);
	String str;
	while((str=br.readLine())!=null)
	{System.out.println(str);
	byte b[]
	}
	
	)}
	}
	

}
