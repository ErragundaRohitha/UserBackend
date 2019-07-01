package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.UserDAO;
import com.cts.entity.User;

@Service("User Service")
@Transactional
public class UserServiceImpl implements UserService {
   
	@Autowired //To create object
	private UserDAO userDAO;
	
	
	@Transactional
	@Override
	public User create(User user) {
		
		userDAO.create(user);
		return user;
	}

	@Transactional
	@Override
	public String read(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String RegisterUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUser(User user) {
		
		userDAO.saveUser(user);
		return user;
	}

	}
	
	
	

