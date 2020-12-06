package com.service;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.bidDao;

/**
 * Servlet implementation class bid
 */
@WebServlet("/bid")
public class bid extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int Mybid =Integer.parseInt(request.getParameter("PresBid"));
		int id = Integer.parseInt(request.getParameter("id"));
		String buyer = (String) session.getAttribute("username");
		bidDao dao = new bidDao();
		try {
			dao.connect();
			dao.updateBid(Mybid, id, buyer);
			response.sendRedirect("item.jsp?id="+id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
