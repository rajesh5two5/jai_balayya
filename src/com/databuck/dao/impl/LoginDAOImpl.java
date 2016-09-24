package com.databuck.dao.impl;
import org.apache.log4j.Logger;

import org.mindrot.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.databuck.controller.LoginController;
import com.databuck.dao.ILoginDAO;

@Repository
public class LoginDAOImpl implements ILoginDAO {
	 static Logger logger= Logger.getLogger(LoginDAOImpl.class.getName());

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean userAuthentication(String email, String password) {

		String encrypted = null;
		 
		String sql = "select password from User where email='" + email + "'";
		System.out.println("sql:" + sql);
	      logger.debug("Hello this is a debug message in daoimpl");
		SqlRowSet queryForRowSet = jdbcTemplate.queryForRowSet(sql);
		System.out.println("encrypted:" + encrypted);
		if (queryForRowSet.next()) {
			encrypted = queryForRowSet.getString(1);
			System.out.println("encrypted:" + encrypted);
		}
		System.out.println("encrypted:" + encrypted);
System.out.println("pwd"+password);
		if (encrypted != null) {
			boolean checkpw = BCrypt.checkpw(password, encrypted);
			return checkpw;
		} else {
			return false;
		}
	}

}
