import java.io.*;
import org.json.simple.*;

public class JSONWriterDemo
		{
	
	public static void main(String S[])
			{			
			JSONObject jo=new JSONObject();
			jo.put("name","heroku-app.com");
			jo.put("age",new Integer(22));		
			JSONArray list=new JSONArray();
			list.add("msg 1");
			list.add("msg 2");
			list.add("msg 3");
			
			jo.put("messege",list);
			
			try	
				{
				FileWriter fw=new FileWriter("E:\\GAMES\\def.json");
				fw.write(jo.toJSONString());
				fw.flush();
				fw.close();
				}

			catch(Exception e)
				{
					e.printStackTrace();
				}
		
			}




		}