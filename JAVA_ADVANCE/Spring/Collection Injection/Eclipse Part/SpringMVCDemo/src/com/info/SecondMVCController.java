
package com.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.service.*;

@Controller
@RequestMapping(value="/second")
public class SecondMVCController {
	
	@Autowired
	private ServiceABC s;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView ABC(){
		System.out.println("first in second jsp");
		return new ModelAndView("welcomepage2","welcomemsg2",s.getMessege());
	}
	@RequestMapping(value="/again", method=RequestMethod.GET)
	public ModelAndView ABC1(){
		System.out.println("second in second jsp");
		return new ModelAndView("welcomepage2","welcomemsg2",s.getMessegeAgain());
	}
	
	
}
