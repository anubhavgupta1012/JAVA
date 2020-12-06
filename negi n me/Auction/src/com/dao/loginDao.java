package com.dao;


import java.sql.*;

public class loginDao {
	
	
		String sql= "select * from user where uname=? and password=?";
		String url = "jdbc:mysql://localhost:3306/website";
		String username="root";
		String pass = "f00tb@ller";
		public boolean check(String uname, String password) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				return true;
			}
		
		
		
		return false;
	}

}
