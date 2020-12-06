package com.dao;

import java.sql.*;

public class bidDao {

	
	String sql= "update items set presentbid = ?,buyer=? where id=?;";
	String url = "jdbc:mysql://localhost:3306/website";
	String username="root";
	String pass = "f00tb@ller";
	
	Connection con = null;
	
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,pass);
	}
	
	public void updateBid(int MyBid, int id, String buyer) {
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, MyBid);
			pst.setString(2, buyer);
			pst.setInt(3, id);
			pst.executeUpdate();
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
