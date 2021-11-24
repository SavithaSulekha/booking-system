package com.bookingsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import com.bookingsystem.entity.User;

@Repository("LoginDAO")
public class LoginDAO {
	
	public User validate(User u) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction txn = manager.getTransaction();
		boolean isAuthorizedUser = false;
		txn.begin();
		User user = manager.find(User.class, u.getUserId());
		try {
		
		if(u.getPassword().equals(user.getPassword())) {
		    isAuthorizedUser = true;
			}
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}finally {
		txn.commit();
		manager.close();
		factory.close();
		}
		if(isAuthorizedUser) {			
		return user;
		}else {
			return null;
		}
	}

}
