package com.cts.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="User")
@DynamicUpdate //Default -  include unmodified properties
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int  id;
	
	@Column(name="role",length=35)
	String role;
	
	
	@Column(name="email",length=50)
	String email;
	
	@Column(name="password")
	String password;
	
	@Column(name="language")
	String language;
	
	@Column(name="blacklist")
	boolean blacklist;
	
	public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String email, String password) {
		
	    this.role=role;
	    this.email = email;
		this.password = password;
		this.language=language;
		this.blacklist=blacklist;
	}


public boolean isBlacklist() {
	return blacklist;
}
public void setBlacklist(boolean blacklist) {
	this.blacklist = blacklist;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", role=" + role + ", email=" + email + ", password=" + password +", language=" +language+",blacklist="+ blacklist+" ]";
}


}
