import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;


public class RunSpring
{
	public static void main(String S[])
		{
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("Spring.xml"));
 		Emp e1=(Emp)b.getBean("hellow");
		Emp e2=(Emp)b.getBean("hellow");
		
		if(e1==e2)
			System.out.println("SAME");

		e1.getName();

		}


}