package my;
import java.sql.*;

public class MyBean
{
	private String name;
	private String pass;

	public void setName(String name){
		this.name=name;
			}

	public void setPass(String pass){
		this.pass=pass;
			}

	public String getName(){
		return name;
		}

	public String getPass(){
		return pass;
		}


	public String validate(){

	try{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");  
  		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp101 where name='"+name+"' and password='"+pass+"'");  
		if(rs.next())
			return "wel.jsp";

		else 
			return "err.jsp";
		
	}

	catch(Exception e)
	{
	return "invalid";
	}

	}


}