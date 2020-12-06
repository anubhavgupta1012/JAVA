
import org.springframework.context.*;
import org.springframework.context.support.*;

public class RunSpring
{
	public static void main(String S[])
		{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Customer c1=(Customer)ac.getBean("customerBean");
		System.out.println(c1);
		}


}