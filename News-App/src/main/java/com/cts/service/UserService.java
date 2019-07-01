package com.cts.service;

import java.util.List;

import com.cts.entity.User;

public interface UserService {
	
	  public User create(User user);
	  
	   public String read(User user);
	   
	   public String  RegisterUser(String emailId);
	   
	   public User saveUser(User user);
	
}
