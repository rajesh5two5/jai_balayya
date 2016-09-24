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

import com.databuck.service.IRoleServie;


@Controller
public class GroupViewRoleController {
	
	@Autowired
	private IRoleServie roleService;
	
	
	
	
	/**
	 * 
	 * 
	 * this is used for view the Grouprole
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/roleview")
	public ModelAndView listrole(ModelAndView model) throws IOException {

		System.out.println("heloo role view");
		
		List<Role> role = roleService.getData();
		System.out.println(role);

		model.addObject("role", role);
		model.setViewName("roleview");

		return model;
	}
	
	
	
	/*
	*//**
	 * 
	 * 
	 * this method is used for delete the 
	 * Role based in idRole
	 * @param request
	 * @return
	 */
	
	
	
	
	
	@RequestMapping(value = "/deleteRole", method = RequestMethod.GET)
	 public  ModelAndView getDeleteRole(HttpServletRequest request) {
		
		 System.out.println("request.getParameter Delete role:(/delete)"
		 + request.getParameter("idRole"));
		 
		 long idRole = (long) Integer.parseInt(request.getParameter("idRole"));
		
		 Role role= new Role();
		 
		 role.setIdRole(idRole);
			 
		  ModelAndView model = new ModelAndView("deleteRole");
		  model.addObject("role",role);
		  
	    return model;
	 
	 }
	
	
	

	/**
	 * 
	 * Delete operation
	 * 
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/deleteRoleById", method = RequestMethod.GET)
	public ModelAndView deleteRole(HttpServletRequest request) {
		long count = 0;

		System.out.println("request.getParameter Delete role:((delecteRole)" 
		+ request.getParameter("idTask"));

		long idRole = (long) Integer.parseInt(request.getParameter("idRole"));

		count = roleService.deleteRole(idRole);

		if (count > 0)
			return new ModelAndView("delete_role");
		else
			return new ModelAndView("deleteTask");

	}
	 

}
