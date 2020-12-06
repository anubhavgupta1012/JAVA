import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MySessionListener implements HttpSessionListener{

		public void sessionCreated(HttpSessionEvent e45){
		
			try{
					
			HttpSession s=e45.getSession();
			s.setAttribute("name","From Session Servlet Listener<br><br>");
			
			System.out.println("Session Created\n\n\n");
				}
			catch(Exception e){
						}
									}

		public void sessionDestroyed(HttpSessionEvent e){}
				
						
								}
