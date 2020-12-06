import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class JSONReaderDemo
		{
		public static void main(String S[])
			{
			JSONParser jp=new JSONParser();
			try
				{
				
				Object obj=jp.parse(new FileReader("E:\\GAMES\\def.json"));
				JSONObject jo=(JSONObject)obj;
				System.out.println("Hi\n"+obj+"\n\n\n");
	

				String name=(String)jo.get("name");
				Long age=(Long)jo.get("age");

				System.out.println("name:"+name);
				System.out.println("age:"+age);
				System.out.println("Messege :");
				JSONArray ja=(JSONArray)jo.get("messege");
			
				Iterator i=ja.iterator();

				while(i.hasNext())
					System.out.print(i.next()+"\t"); 		
				
				}

			catch(Exception e)
				{
				e.printStackTrace();
				}
			
			
			}
		
		}
