package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.entity.User;
import com.cts.service.UserService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, allowedHeaders="*",exposedHeaders={"token"})
@RequestMapping( "/user")

public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping("/")
	public String sayHi() {
		return "Hi spring boot";
	}

	  @PostMapping("/createuser")
	  public ResponseEntity<?> create(@RequestBody User user)
		{
		
			userService.create(user);
			System.out.println(user);

			System.out.println("saved successfully");
			return new ResponseEntity<User>(user,HttpStatus.OK);
}
	  
		@RequestMapping(value="/register",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> RegisterUser(@RequestBody User user)
		{
		  
		    String emailId = null;
			userService.RegisterUser(emailId);
			

			System.out.println("register succesfully");
			return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
		
		@RequestMapping(value="/save",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> saveUser(@RequestBody User user)
		{
		
			userService.saveUser(user);
			System.out.println(user);

			System.out.println("registeruser  successfully");
			return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
}
