package com.info;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.service.*;

@Controller
@RequestMapping(value="/")
public class FirstMVCController {
	
	@Autowired
	private ServiceABC s;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView ABC(HttpServletRequest req, HttpServletResponse res){
		return new ModelAndView("welcomepage","welcomemsg",s.getMessege()+"\t"+res);
	}
//	public String ABC(){
//		return "welcomepage"; 
//	}
	@RequestMapping(value="again", method=RequestMethod.GET)
	public ModelAndView ABC1(){
		return new ModelAndView("welcomepage","welcomemsg",s.getMessegeAgain());
	}
	
	
}
