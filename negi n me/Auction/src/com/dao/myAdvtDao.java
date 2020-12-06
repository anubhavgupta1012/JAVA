package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.item;

public class myAdvtDao {
	String sql = "select * from items where seller=?";
	//String check = "select * from user where uname = ?";
	String url = "jdbc:mysql://localhost:3306/website";
	String username="root";
	String pass = "f00tb@ller";
	Connection con = null;
	item i;
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,pass);
	}
	
	public ResultSet getItems(String seller) throws SQLException {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, seller);
		System.out.println(pst.toString());	
		ResultSet rs = pst.executeQuery();
		//System.out.println(rs);
		return rs;
		
	}
}
