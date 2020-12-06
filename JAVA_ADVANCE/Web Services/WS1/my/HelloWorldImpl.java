package my;

import javax.jws.*;
import javax.servlet.annotation.*;

@WebService

public class HelloWorldImpl
{
int x,y;
	public void setValue(int x,int y)
		{
		this.x=x;
		this.y=y;	
		}

	public int sum()
		{
		return x+y;
		}

}