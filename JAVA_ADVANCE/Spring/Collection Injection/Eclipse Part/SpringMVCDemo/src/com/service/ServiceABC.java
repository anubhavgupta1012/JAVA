package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class ServiceABC {


		@RequestMapping(method=RequestMethod.GET)
		public String getMessege(){
			return new String(" First Day in Spring MVC!! ");
		}
		
		@RequestMapping(value="again",method=RequestMethod.GET)
		public String getMessegeAgain(){
			return new String("welcome Again");
		}
	}
