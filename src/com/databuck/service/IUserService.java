package com.databuck.service;

import java.util.List;

import com.databuck.bean.User;

public interface IUserService {
	
	//retrive the user Details
	public List<User> getData();
	
	// Delete Az User
	public long deleteUser(long idUser);

	public User get(long idUser);
	

}
