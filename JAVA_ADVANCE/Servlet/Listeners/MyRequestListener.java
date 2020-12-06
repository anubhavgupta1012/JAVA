import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyRequestListener implements ServletRequestListener{

		public void requestInitialized(ServletRequestEvent e23){
		
			try{
					
			ServletRequest req=e23.getServletRequest();
			req.setAttribute("name","From Request Servlet Listener<br><br>");
			
			System.out.println("Request Created\n\n\n");
				}
			catch(Exception e){
						}
									}

		public void requestDestroyed(ServletRequestEvent e1){}
				
						
								}
