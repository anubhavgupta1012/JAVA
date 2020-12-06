import org.springframework.beans.factory.config.*;
import org.springframework.beans.*;

public class BeanPostProcessorEx implements BeanPostProcessor
{
	public Object postProcessBeforeInitialization(Object Bean, String beanName)throws BeansException
		{
		System.out.println("Before Initialisation "+ beanName);
		return beanName;
		}

		public Object postProcessAfterInitialization(Object Bean, String beanName)throws BeansException
		{
		System.out.println("Affter Initialisation "+ beanName);
		return beanName;
		}

}