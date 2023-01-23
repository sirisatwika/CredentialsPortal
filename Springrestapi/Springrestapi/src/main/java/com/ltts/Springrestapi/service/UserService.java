package com.ltts.Springrestapi.service;

import java.util.List;

import com.ltts.Springrestapi.model.User;

public interface UserService {
	
	List<User> getUsers();
	
	User saveUsers(User user);
	
	User getUserById(Integer Id);
	
	void deleteUser(Integer id);
	
	User updateUser(User user);
}
