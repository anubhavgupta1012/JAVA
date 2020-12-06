
import java.io.*;
import org.json.simple.JSONObject;
public class JSONDemoEx
	{
	public static void main(String S[])throws Exception{
		
		JSONObject jo=new JSONObject();
		jo.put("name","Anubhav");
		jo.put("num",new Integer(22));
		jo.put("balance",new Double(100.1));
		jo.put("is_vip",new Boolean(false));

		StringWriter out=new StringWriter();
		jo.writeJSONString(out);
		String jsonText=out.toString();
		System.out.println(jsonText);
						}

	}