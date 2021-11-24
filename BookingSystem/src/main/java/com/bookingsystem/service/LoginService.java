package com.bookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.dao.LoginDAO;
import com.bookingsystem.entity.User;

@Service("LoginService")
public class LoginService {
	
	@Autowired
	private LoginDAO dao;
	@Autowired
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginDAO getDao() {
		return dao;
	}

	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}
	
	public User validate(Long id,String password) {
		user.setUserId(id);
		user.setPassword(password);
		user = dao.validate(user);
		
		return user;
	}

}
