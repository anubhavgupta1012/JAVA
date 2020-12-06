
import org.springframework.context.*;
import org.springframework.context.support.*;

public class RunSpring
{
	public static void main(String S[])
		{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Emp e1=(Emp)ac.getBean("emp");
		e1.showSalary();
		}


}