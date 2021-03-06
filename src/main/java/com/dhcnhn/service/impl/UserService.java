package com.dhcnhn.service.impl;

import javax.inject.Inject;

import com.dhcnhn.dao.IUserDAO;
import com.dhcnhn.model.UserModel;
import com.dhcnhn.service.IUserService;

public class UserService implements IUserService {
	@Inject
	
	private IUserDAO userDAO;

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String username, String password, Integer status ) {
		return userDAO.findByUserNameAndPasswordAndStatus(username, password, status);
	}

}
