package com.databuck.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.Role;
import com.databuck.bean.Task;
import com.databuck.bean.User;
import com.databuck.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userservice;

	/**
	 * 
	 * 
	 * this method is used for retriving the user data from user table
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/userdetails")
	public ModelAndView listUser(ModelAndView model) throws IOException {

		System.out.println("View User Details");

		List<User> user = userservice.getData();
		System.out.println(user);

		model.addObject("user", user);
		model.setViewName("userdetails");

		return model;
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView getDeleteUser(HttpServletRequest request) {

		System.out.println("request.getParameter Delete role:(/delete user )" + request.getParameter("idUser"));

		long idUser = (long) Integer.parseInt(request.getParameter("idUser"));

		User user = new User();
		user.setIdUser(idUser);

		ModelAndView model = new ModelAndView("deleteUser");
		model.addObject("user", user);

		return model;

	}

	/**
	 * 
	 * Delete User operation
	 * 
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		long count = 0;

		System.out.println("request.getParameter Delete user:((delecteUser)" + request.getParameter("idUser"));

		long idUser = (long) Integer.parseInt(request.getParameter("idUser"));

		count = userservice.deleteUser(idUser);
		if (count > 0)
			return new ModelAndView("delete_role");
		
			return new ModelAndView("deleteUser");

	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public ModelAndView getUpdateUser(HttpServletRequest request) {

		System.out.println("request.getParameter UpDateUser:(/delete user )" + request.getParameter("idUser"));

		long idUser = (long) Integer.parseInt(request.getParameter("idUser"));

		User user = userservice.get(idUser);

		ModelAndView model = new ModelAndView("updateUser");
		model.addObject("user", user);

		return model;

	}

}
