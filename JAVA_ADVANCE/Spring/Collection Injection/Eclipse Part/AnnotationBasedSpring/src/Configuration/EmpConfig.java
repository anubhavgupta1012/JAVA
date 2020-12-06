package Configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	
	public Emp emp() {
		return new Emp();
	}

}
