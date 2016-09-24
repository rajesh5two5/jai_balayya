package com.databuck.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.Demo;
import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

@Controller
public class DemoController {


	/**
	 * 
	 * 
	 * this is for create view
	 * 
	 * @return
	 */

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView getCreateTemplateView()
	{
		return new ModelAndView("createDataTemplate");
	}
	
	
	
	@RequestMapping(value = "/createForm", method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("hello create form");

		/*
		 * <input type="text" class="form-control catch-error" id="datasetid"
		 * name="dataset" placeholder=" Enter the Data Template Name "> <label
		 */

		String dataset = request.getParameter("dataset");
		

		/*
		 * <input type="text" class="form-control" id="descriptionid"
		 * name="description" placeholder="Enter your description"> <label
		 * for="form_control">Description</label>
		 */
		String description = request.getParameter("description");

		
		/*
		 * <select class="form-control" id="locationid" name="location"
		 * placeholder="Choose Location"> <option value="">Select...</option>
		 * <option value="File System">File System</option> <option
		 * value="HDFS">HDFS</option> <option value="S3">S3</option> <label
		 * for="form_control_1"> Data Location *</label>
		 */
		String location = request.getParameter("location");
         System.out.println(location);
		
		
		/*
		 * <select class="form-control" id="sourceid" name="source" placeholder=
		 * "Choose Location"> <option value="xls">XLS</option> <option
		 * value="csv">CSV</option> <option value="tab">TAB</option> </select>
		 * <label for="form_control_1">Data Format</label>
		 */

		String source = request.getParameter("source");

		System.out.println(source);
		
		/*
		 * <input type="file" class="form-control" name="upload" id="upload_id"
		 * /> <label for="form_control">Metadata File</label> </div><br/>
		 */
		String uploadmetafile = request.getParameter("upload");
         System.out.println(uploadmetafile);
		  
		/*
		 * <input type="file" class="form-control" name="dataupload"
		 * id="dataupload_id" /> <label for="form_control">Data Source
		 * File</label>
		 */

		String uploadsourcefile = request.getParameter("dataupload");

		System.out.println(uploadmetafile);
		
		/*
		 * <input type="text" class="form-control catch-error" id="hostName"
		 * name="hostName"> <label for="form_control_1" id="host-id">Host
		 * URI*</label>
		 */

		String hostUri = request.getParameter("hostName");

		System.out.println(hostUri);
		
		/*
		 * <input type="text" class="form-control catch-error" id="schemaName"
		 * name="schemaName"> <label for="form_control_1" id="folder-id">Folder
		 * *</label>
		 */

		String folder = request.getParameter("schemaName");
         System.out.println(folder);
		
		/*
		 * <input type="text" class="form-control" id="userName"
		 * name="userName"> <label for="form_control" id="user-id">User
		 * login*</label>
		 */
		String userlogin = request.getParameter("userName");

		 System.out.println(userlogin);
		
		/*
		 * <input type="password" class="form-control catch-error" id="pwd"
		 * name="pwd"> <label for="form_control_1" id="user-pwd">Password
		 * *</label>
		 */

		String password = request.getParameter("pwd");

		System.out.println(password);
		
		/*
		 * <input type="text" class="form-control" id="folderName"
		 * name="folderName"> <label for="form_control" id="table-name">Table
		 * Name *</label>
		 */
		String tableName = request.getParameter("folderName");
System.out.println(tableName);
		
		
		
		/*
		 * <input type="text" class="form-control" id="portName"
		 * name="portName"> <label for="form_control">Port *</label>
		 */
		String portName = request.getParameter("portName");

		System.out.println(portName);
		
		/*
		 * <input type="text" class="form-control catch-error" id="hostid"
		 * name="host"> <label for="form_control_1">Host Name *</label>
		 */

		String hostName = request.getParameter("host");

		System.out.println(hostName);
		/*
		 * <input type="text" class="form-control" id="portid" name="port">
		 * <label for="form_control">Port *</label>
		 */

		String port = request.getParameter("port");
       System.out.println(port);
		/*
		 * <input type="text" class="form-control" id="userid" name="username">
		 * <label for="form_control">Username *</label>
		 */

		String username = request.getParameter("username");
             System.out.println(username);
		/*
		 * <input type="password" class="form-control" id="pwdid"
		 * name="password"> <label for="form_control">Password *</label>
		 */

		String pwd = request.getParameter("password");
System.out.println(pwd);
		
		/*
		 * <input type="text" class="form-control" id="dbid" name="dbname">
		 * <label for="form_control">Database Name *</label>
		 */

		String dbname = request.getParameter("dbname");

		 System.out.println(dbname);
		/*
		 * <input type="text" class="form-control" id="tableid"
		 * name="tablename"> <label for="form_control">Table Name*</label>
		 */

		String tablename = request.getParameter("tablename");
               System.out.println(tableName);
		/*
               
               Demo d= new Demo();
               d.setDataformet(dataformet);
               d.setDescription(description);
               d.setLocation(location);
               d.setTempName(tempName);
               */
               
               
               
		return new ModelAndView("demo");

	}
}