package com.databuck.service;

import com.databuck.bean.UserLogin;

public interface LoginService {

	boolean userAuthentication(String email, String password);

	

}
