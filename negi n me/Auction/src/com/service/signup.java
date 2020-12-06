package com.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dao.signupDao;

@WebServlet("/signup")
public class signup extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("uname");
		String pass = request.getParameter("pass1");
		String email = request.getParameter("email");
		String address = request.getParameter("add1")+" "+request.getParameter("add2")+" "+request.getParameter("city")+" "+request.getParameter("state")+" Pincode: "+request.getParameter("pin");
		int age =Integer.parseInt(request.getParameter("age"));
		
		signupDao dao = new signupDao();
		
		
		try {
			dao.connect();
			if(dao.check(uname)) {	
				response.sendRedirect("signup.jsp");
			}
			else {
				
				dao.addUser(uname, pass, age, email, address);
				HttpSession session = request.getSession();
				session.setAttribute("username",uname);
				response.sendRedirect("welcome.jsp");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		

	}
}
