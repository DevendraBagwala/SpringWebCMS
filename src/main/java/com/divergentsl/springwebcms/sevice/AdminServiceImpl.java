package com.divergentsl.springwebcms.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.springwebcms.dao.AdminDao;
import com.divergentsl.springwebcms.entity.Admin;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;

	
	public boolean login(String username, String password) {
		
		Admin admin = adminDao.login(username);
		if (admin == null) return false;
			return username.equals( admin.getUsername( )) && password.equals(admin.getPassword());

	}

}
