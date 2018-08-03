package com.aspiresys;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@Autowired
	AdditionService as ;
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req ,HttpServletResponse res) throws Exception 
	{
		int i=Integer.parseInt( req.getParameter("t1"));
		int j=Integer.parseInt(req.getParameter("t2"));
	  
		int k = 0;
	
			k = as.add(i, j);
	

		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		return mv;
	
	}
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e)
	{
		System.out.println("exception occured" +e);
		
		return "Exception.jsp";
	}


}
