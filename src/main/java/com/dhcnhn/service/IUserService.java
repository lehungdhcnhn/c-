package com.dhcnhn.service;

import com.dhcnhn.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String username, String password, Integer status);
}
