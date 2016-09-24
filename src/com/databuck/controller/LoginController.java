package com.databuck.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.databuck.bean.UserLogin;
import com.databuck.service.LoginService;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

@Controller
public class LoginController {

	static Logger logger= Logger.getLogger(LoginController.class.getName());
	  
    

	@Autowired
	private LoginService loginService;

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		logger .info("This is login page");
		System.out.println("this is login page req");
		return new ModelAndView("loginPage");
	}

	@RequestMapping(value = "/login_process", method = RequestMethod.GET)
	public ModelAndView getlogin_process() {
		logger .info("This is login succes");
		System.out.println("this is login process req");
		return new ModelAndView("loginPage");
	}

	/**
	 * this page will verify weather username and password is valid or not if
	 * valid go to login Success or failure
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login_process", method = RequestMethod.POST)
	public ModelAndView loginPage(@RequestParam("email") String email, @RequestParam("password") String password) {

		String msg = "UserName ,Password Not Match";
		System.out.println("login process post method");
		  
		 logger .info("This is an info log entry");
		
		if (email != null && email.trim().length() > 0 && password != null && password.trim().length() > 0) {
			boolean b = loginService.userAuthentication(email, password);
               System.out.println(b);
               logger.info("login process method in controller ");
			if (b == true) // loginpass
				return new ModelAndView("loginSuccess");
			else
				return new ModelAndView("loginPage", "msg", msg);
		}
		return new ModelAndView("loginPage","msg", msg);
	}

	/**
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {

		session.invalidate();

		return new ModelAndView("logout");
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleNullPointerException(HttpServletRequest req, Exception exception)
	{
		
		System.out.println("Request   : "+req.getRequestURI()+ "  rised " +exception);
	 
		ModelAndView model= new ModelAndView();
		model.addObject("exception",exception);
		model.addObject("url",req.getRequestURI());
		
		model.setViewName("errorPage");
		return model;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
