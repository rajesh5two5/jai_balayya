package com.databuck.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.DeleteTempView;
import com.databuck.bean.ListDataDefinition;
import com.databuck.bean.ListDataSource;
import com.databuck.bean.Task;
import com.databuck.bean.TemplateView;
import com.databuck.dao.ITemplateViewDAO;

@Controller
public class TemplateViewController {
	@Autowired
	ITemplateViewDAO templateviewdao;

	public void setTemplateviewdao(ITemplateViewDAO templateviewdao) {
		this.templateviewdao = templateviewdao;
	}

	/**
	 * 
	 * To display the temp view
	 * 
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/tempview")
	public ModelAndView getListDataSource(ModelAndView model) throws IOException {
		List<TemplateView> templateview = templateviewdao.getTemplateView();

		model.addObject("templateview", templateview);
		// here set view name whicj page
		model.setViewName("tempview");

		return model;
	}

	@RequestMapping(value = "/listdataview", method = RequestMethod.GET)
	public ModelAndView editTask(HttpServletRequest request) {

		int idData = Integer.parseInt(request.getParameter("idData"));
		System.out.println("view listDataView  id " + idData);

		List<ListDataDefinition> listdatadefinition = templateviewdao.view(idData);

		System.out.println(listdatadefinition.size());

		ModelAndView model = new ModelAndView("listDataView");
		model.addObject("listdatadefinition", listdatadefinition);

		return model;
	}

	/**
	 * 
	 * 
	 * Delete the Extend Template
	 * 
	 * 
	 */

	@RequestMapping(value = "/deleteTemp", method = RequestMethod.GET)
	public ModelAndView editTemp(HttpServletRequest request) {

		int idDataBlend = Integer.parseInt(request.getParameter("idDataBlend"));
		System.out.println("delete extend view id " + idDataBlend);

		DeleteTempView deletetempview = templateviewdao.delete(idDataBlend);

		ModelAndView model = new ModelAndView("deleteExtendTemplate");

		model.addObject("deletetempview", deletetempview);
		return model;
	}

	/**
	 * Delete Extend Template completely
	 * 
	 * 
	 */
	@RequestMapping(value = "/deleteTempId", method = RequestMethod.GET)
	public ModelAndView DeleteTempView(HttpServletRequest request) {
		int count = 0;
		String msg = " NOT Delete Extended Template ";
		System.out.println(
				"request.getParameter Delete role:((delecteTemp ...BYID....)" + request.getParameter("idDataBlend"));

		int idDataBlend = Integer.parseInt(request.getParameter("idDataBlend"));

		count = templateviewdao.DeleteTempViewFully(idDataBlend);

		System.out.println(count);

		if (count > 0)
			return new ModelAndView("deletecbgh", "msg", "Delete Extended Template Success fully");
		else
			return new ModelAndView("deleteTvhhvj", "msg", msg);

	}

	/**
	 * Delete Extend Template list DataBaseColDEfination
	 * 
	 * 
	 * 
	 */
	@RequestMapping(value = "/deletelistdata", method = RequestMethod.GET)
	public ModelAndView DeleteTempViewListBeanCol(HttpServletRequest request) {
		int count = 0;

		System.out.println("requesDeleteTempViewListBeanCol  id= " + request.getParameter("idDataBlend"));

		int idDataBlend = Integer.parseInt(request.getParameter("idDataBlend"));

		count = templateviewdao.DeleteListDataBeanColDef(idDataBlend);

		System.out.println(" DeleteListDataBeanColDef  count print  " + count);

		if (count > 0)
			return new ModelAndView("deleteViewListColDef");
		else
			return new ModelAndView("deleteTemplate");

	}

	/**
	 * 
	 * 
	 * this is for add/drived 
	 * coulumn filter
	 * 
	 * @return
	 */

	@RequestMapping(value = "/createcolumn", method = RequestMethod.GET)
	public ModelAndView getCreateTemplateView(HttpServletRequest request)
	{
		int idDataBlend = Integer.parseInt(request.getParameter("idDataBlend").trim());
		int idData = Integer.parseInt(request.getParameter("idData").trim());
		
		System.out.println(idDataBlend);
		System.out.println(idData);
		
		return new ModelAndView("createColumn");
	}
	
	
	
	

}
