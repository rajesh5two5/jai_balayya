package com.databuck.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.User;
import com.databuck.bean.ValidationView;
import com.databuck.service.IValidationService;

@Controller
public class ValidationController {

	@Autowired
	private IValidationService validationService;

	/**
	 * 
	 * 
	 * this method is used for retriving the ValidationCotroller
	 *  data from listDataSource
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/validationView")
	public ModelAndView listValidation(ModelAndView model) throws IOException {

		System.out.println("Validation View  Details");

		List<ValidationView> validation = validationService.getData();
		System.out.println(validation);

		model.addObject("validation",validation);
		model.setViewName("validationView");

		return model;
	}
	
	
}
