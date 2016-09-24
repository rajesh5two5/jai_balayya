package com.databuck.exception;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.controller.LoginController;

@Component
public class ExceptionHandler implements HandlerExceptionResolver
{
	
	

	static Logger logger= Logger.getLogger(ExceptionHandler.class.getName());

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
	
		
		System.out.println("Request   : "+request.getRequestURI()+ "  rised " +exception);
		 
		ModelAndView model= new ModelAndView();
		model.addObject("exception",exception);
		model.addObject("url",request.getRequestURI());
		
		model.setViewName("errorPage");
		return model;
		
	}
	

}



