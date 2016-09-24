package com.databuck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databuck.dao.ILoginDAO;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
private ILoginDAO loginDAO;

	@Override
	public boolean userAuthentication(String email, String password) {
		
		boolean flag=loginDAO.userAuthentication( email,password);
		
		if(flag==true)
         return true;
		else
		return false;
	}

	
	

}
