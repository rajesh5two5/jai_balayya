package com.databuck.dao;

public interface ILoginDAO {

	boolean userAuthentication(String email, String password);

}
