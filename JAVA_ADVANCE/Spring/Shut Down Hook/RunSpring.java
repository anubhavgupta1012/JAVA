
import org.springframework.context.*;
import org.springframework.context.support.*;

public class RunSpring
{
	public static void main(String S[])
		{
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Emp e1=(Emp)ac.getBean("hello");
		Emp1 e2=(Emp1)ac.getBean("hello1");

		e1.getName();
		e2.getName1();
	
		ac.registerShutdownHook();

		}


}