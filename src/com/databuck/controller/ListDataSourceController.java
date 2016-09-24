package com.databuck.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.ListDataSource;
import com.databuck.bean.Task;
import com.databuck.dao.IListDataSourceDAO;

/**
 * 
 * 
 * 
 * @author vivek jaiswal (appzop)
 * 
 *
 */
@Controller
public class ListDataSourceController

{
	@Autowired
	private IListDataSourceDAO listdatasourcedao;

	/**
	 * 
	 * Handler method for listing all ListDataSource at the (also served as
	 *
	 * loginsuccess):
	 */

	@RequestMapping(value = "/cheak")
	public ModelAndView getListDataSource(ModelAndView model) throws IOException {
		List<ListDataSource> listdatasource = listdatasourcedao.getListDataSource();

		model.addObject("listdatasource", listdatasource);
		// here set view name whicj page
		model.setViewName("cheak");

		return model;
	}

/**
 * 
 * Delete 
 * the DataTemplate 
 * by id
 * 
 * 
 * 
 * 
 * @param request
 * @return
 */
	@RequestMapping(value = "/deletedatasource", method = RequestMethod.GET)
	public ModelAndView editTask(HttpServletRequest request) {
		
	    int idData= Integer.parseInt(request.getParameter("idData"));
	  System.out.println("delete datasource id "+idData);
	    
	 ListDataSource listdatasource=listdatasourcedao.delete(idData);
	   
	   
	    ModelAndView model = new ModelAndView("deleteTemplate");
	    model.addObject("listdatasource",listdatasource);
	    
	    return model;
	}
	
	
	
	
	@RequestMapping(value = "/delete_Template", method = RequestMethod.GET)
	public ModelAndView DeleteDataDource(HttpServletRequest request) {
				  
		  try
			 {
			 
			   int idData = Integer.parseInt(request.getParameter("idData"));
			    
			   System.out.println("/delete_Template idData"+idData); 
			   listdatasourcedao.deleteDataSource(idData);
			   return new ModelAndView("deleteDataSourceSuccess");
		  
	
		    }
			 catch(Exception e)
			 {
				 return new ModelAndView("cheak");
				 
			 }
	
	}
	
	
	
	
	
}
