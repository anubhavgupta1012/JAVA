package my;
import java.sql.*;

public class MyBean
{
	private int first;
	private int second ;

	public void setFirst(int first){
		this.first=first;
			}

	public void setSecond(int second){
		this.second=second;
			}

	public int getFirst(){
		return first;
		}

	public int getSecond(){
		return second;
		}

	
	public int add(){
	return first+second;
		}
	
	


}