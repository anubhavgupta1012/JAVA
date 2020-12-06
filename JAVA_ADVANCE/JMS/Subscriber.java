import javax.jms.*;
import javax.naming.*;
import java.util.*;

public class Subscriber{

	public static void main(String S[])throws Exception
		{
			Properties parm= new Properties();
			parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
			parm.setProperty("java.naming.provider.url","t3://localhost:7001");
			parm.setProperty("java.naming.security.principal","weblogic");
			parm.setProperty("java.naming.security.credentials","weblogic15");

			InitialContext ctx=new InitialContext(parm);
			TopicConnectionFactory tcf=(TopicConnectionFactory)ctx.lookup("TopicConnectionFactory3");
			TopicConnection con=tcf.createTopicConnection();
			con.start();
			
			TopicSession s=con.createTopicSession(false,TopicSession.AUTO_ACKNOWLEDGE);
			Topic t=(Topic)ctx.lookup("MyTopic3");
			
			TopicSubscriber sub=s.createSubscriber(t);
			
			sub.setMessageListener(new MyMessageListener());
			

			while(true)
				{
				Thread.sleep(1000);
				}
		}

			}


	class MyMessageListener implements MessageListener
			{
			public void onMessage(Message msg)
				{
					try{
					if(msg instanceof TextMessage)		
						{
						TextMessage txtmsg=(TextMessage)msg;
						System.out.println(txtmsg.getText());
						}


					else
						{
						System.out.println("Messege in Unknown Format");
						}
						
					
					}
					catch(Exception e)
					{
					e.printStackTrace();
					}				


				}



			}

	