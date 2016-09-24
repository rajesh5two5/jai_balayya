package com.databuck.dao;

import java.util.List;

import com.databuck.bean.Role;
import com.databuck.bean.User;

public interface IUserDAO {

	
	// get User DATA
public List<User> getData();


public long deleteUser(long idUser);


public User get(long idUser);
}
