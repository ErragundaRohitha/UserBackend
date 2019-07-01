package com.cts.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.User;

@Repository("loginDAO")

public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User create(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	
		public boolean read(String userName, String password) {
			boolean userFound=false;
			System.out.println("in dao");
			
			@SuppressWarnings("unchecked")
			Query<User> query = sessionFactory.getCurrentSession().createQuery("from User where email=:email and Password=:password");
			System.out.println(query);
	    	query.setParameter("userName",userName);
	    	query.setParameter("password",password);
	    	System.out.println("check");
	    	
			
			List<User> list = query.list();
	    	if(list != null && list.size()>0)
	    	{
	    		System.out.println(list);
	    		userFound=true;
	    		//userFound = true;
	    		System.out.println("check2");
	    	}
	    	else
	    	{
	    	  System.out.println("check3");
			  return userFound=false;
	    	}
	    	return userFound;
	    }

	@SuppressWarnings("rawtypes")
	@Override
	public String getPassword(String emailId) {
		// TODO Auto-generated method stub
		
					Query query =sessionFactory.getCurrentSession().createQuery("select password from User where Email_Id=:emailId");
					System.out.println(query);
					query.setParameter("emailId",emailId);
					System.out.println("check1");
					
					String user =  (String) query.uniqueResult();
					System.out.println(user);	    
//			    	
					return emailId;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String registerUser(String emailId) {
		Query query = sessionFactory.getCurrentSession().createQuery("select userName and password from User where  Email_Id:emailId");
		
		query.setParameter("emailId",emailId);
		
		return emailId;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		   sessionFactory.getCurrentSession().save(user);
		   System.out.println(user);
			return user;
	}

	
	
//	 String hql = "select id from login where user_name= :username and password= :password";



}
