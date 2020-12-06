package com.dao;

import java.sql.*;

public class signupDao {		
		
		String sql= "insert into user values(?,?,?,?,?)";
		String check = "select * from user where uname = ?";
		String url = "jdbc:mysql://localhost:3306/website";
		String username="root";
		String pass = "f00tb@ller";
		Connection con = null;
		public void connect() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,pass);
		}
		public boolean check(String uname) throws Exception {
			
			PreparedStatement st = con.prepareStatement(check);
			st.setString(1, uname);
			ResultSet rs = st.executeQuery();
			if(rs.next())
				return true;
			else
				return false;
		}
		
		public void addUser(String uname, String password, int age, String email, String address) {
		
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, uname);
				pst.setString(2, password);
				pst.setInt(3, age);
				pst.setString(4, email);
				pst.setString(5, address);
				//pst.setInt(3, age);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		}

}
