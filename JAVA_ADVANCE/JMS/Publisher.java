import javax.jms.*;
import javax.naming.*;
import java.util.*;

public class Publisher{

	public static void main(String S[])throws Exception
		{
			Properties parm= new Properties();
			parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
			parm.setProperty("java.naming.provider.url","t3://localhost:7001");
			parm.setProperty("java.naming.security.principal","System");
			parm.setProperty("java.naming.security.credentials","10121996");

			InitialContext ctx=new InitialContext(parm);
			TopicConnectionFactory tcf=(TopicConnectionFactory)ctx.lookup("TopicConnectionFactory3");
			TopicConnection con=tcf.createTopicConnection();
			con.start();
			
			TopicSession s=con.createTopicSession(false,TopicSession.AUTO_ACKNOWLEDGE);
			Topic t=(Topic)ctx.lookup("MyTopic3");
			

			TopicPublisher p=s.createPublisher(t);
			TextMessage tm=s.createTextMessage();
			tm.setText("Hi Anubhav");
			
			p.publish(tm);

			System.out.println("Messege Delivered");
			s.close();
			con.close();
			
				
		
			

		}

			}