package Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring {

	public static void main(String[] args) {

			ApplicationContext ac=new AnnotationConfigApplicationContext("EmpConfig.class");
			Emp e1=ac.getBean(Emp.class);	
			e1.setName("Anubhav_Bushra");
			System.out.println(e1.getName());
	}

}
