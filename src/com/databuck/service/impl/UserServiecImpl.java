package com.databuck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databuck.bean.User;
import com.databuck.dao.IUserDAO;
import com.databuck.service.IUserService;
@Service
public class UserServiecImpl implements IUserService {

	@Autowired
	private IUserDAO userdao;
	
	
	public List<User> getData() {
	
		List<User> user=userdao.getData();
		
		return user;
	}
	
public long deleteUser(long idRole) {
		
		long count=userdao.deleteUser(idRole);
		return count;
	}

@Override
public User get(long idUser) {
	User user=userdao.get(idUser);
	return user;
}

}
