
import org.springframework.context.*;
import org.springframework.context.support.*;

public class RunSpring
{
	public static void main(String S[])
		{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		/*Emp e1=(Emp)ac.getBean("hellow");
		Emp e2=(Emp)ac.getBean("hellow");
		
		if(e1==e2)
			System.out.println("SAME");

		e1.getName();*/

		}


}