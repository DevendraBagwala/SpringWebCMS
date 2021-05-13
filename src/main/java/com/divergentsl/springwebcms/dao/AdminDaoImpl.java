package com.divergentsl.springwebcms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.divergentsl.springwebcms.entity.Admin;

@Repository
public class AdminDaoImpl  implements AdminDao {
	
	@PersistenceContext
	EntityManager entityManager;
	

	public Admin login(String username) {
		
		
		Admin admin = entityManager.find(Admin.class, username);
		
		entityManager.close();
		return admin;
	}

}
