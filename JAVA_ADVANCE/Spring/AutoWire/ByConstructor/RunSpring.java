
import org.springframework.context.*;
import org.springframework.context.support.*;

public class RunSpring
{
	public static void main(String S[])
		{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Emp e1=(Emp)ac.getBean("emp");
		e1.getName();
		e1.showSalary();

		Emp1 e=(Emp1)ac.getBean("emp1");
		e.getName();
		e.showSalary();
		}


}