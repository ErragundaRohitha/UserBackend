package com.cts.dao;

import java.util.List;

import com.cts.entity.User;

public interface UserDAO {

	
	public User create(User user);
	
	public boolean read(String emailId,String password);
	
	
	public String getPassword(String emailId);
	
	
	public  String registerUser(String  emailId);
	
	public User saveUser(User user);
}
