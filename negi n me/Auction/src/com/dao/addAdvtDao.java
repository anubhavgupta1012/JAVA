package com.dao;

import java.sql.*;
public class addAdvtDao {
	String sql= "insert into items(seller,name, image, minbid, buynow, descript, enddate) values(?,?,?,?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/website";
	String username="root";
	String pass = "f00tb@ller";		
	Connection con = null;
	
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,pass);
	}
	
	public void addAdvt(String name, String image, String minBid, String buyNow, String desc, String seller, java.sql.Date sqlDate) {
		
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			//pst.setInt(1, id);
			pst.setString(1, seller);
			pst.setString(2, name);
			pst.setString(3, image);
			pst.setString(4, minBid);
			pst.setString(5, buyNow);
			pst.setString(6, desc);
			pst.setDate(7, sqlDate);
			
			pst.executeUpdate();
			System.out.println("Done");
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
	
}
