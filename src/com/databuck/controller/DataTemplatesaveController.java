package com.databuck.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.ListDataDefinition;
import com.databuck.dao.IDataTemplatesaveDAO;
import com.databuck.dao.ITemplateViewDAO;

@Controller
public class DataTemplatesaveController {

	public JdbcTemplate jdbcTemplate;

	@Autowired	
	IDataTemplatesaveDAO DataTemplatesave;

	@Autowired
	ITemplateViewDAO templateviewdao;

	public void setTemplateviewdao(ITemplateViewDAO templateviewdao) {
		this.templateviewdao = templateviewdao;
	}



	public void setDataTemplatesave(IDataTemplatesaveDAO dataTemplatesave) {
		DataTemplatesave = dataTemplatesave;
	}
/*
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editTask(HttpServletRequest request) {

		System.out.println("iddata:"+request.getParameter("idColumn"));
		int idData = Integer.parseInt(request.getParameter("idColumn"));
		System.out.println("view listDataView  id " + idData);
		List<ListDataDefinition> listdatadefinition = templateviewdao.view(idData);
		System.out.println("listdatadefinition.size():"+listdatadefinition.size());
		System.out.println("lld"+listdatadefinition);

		//
		ModelAndView model = new ModelAndView("edit");
		model.addObject("listdatadefinition", listdatadefinition);
		//model.setViewName("edit");
		return model;
	}*/


	@ResponseBody
	@RequestMapping(value = "/table/save/data", method = RequestMethod.POST)
	public String dataTemplateedit(HttpServletRequest req,@RequestBody ListDataDefinition ldd) {
		System.out.println("in save1 controller calling");
		/*String name=req.getParameter("aData[4]");
		System.out.println("name:"+name);*/
		String displayName=req.getParameter("displayname");
		String columnName=req.getParameter("columnName");
		String format=req.getParameter("format");
		String KBE=req.getParameter("KBE");
		String dgroup=req.getParameter("dgroup");
		String dupkey=req.getParameter("measurement");
		System.out.println(dupkey);
		System.out.println(format);
		System.out.println("hello");
		ListDataDefinition ldd1=new ListDataDefinition();
		ldd1.setDisplayName(displayName);
		ldd1.setColumnName(columnName);
		ldd1.setFormat(format);
		ldd1.setKBE(KBE);
		ldd1.setDgroup(dgroup);
		ldd1.setDupkey(dupkey);
		DataTemplatesave.save(ldd1);	
		return "success";
	}
	
}
