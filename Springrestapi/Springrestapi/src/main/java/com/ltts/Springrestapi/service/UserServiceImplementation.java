package com.ltts.Springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.Springrestapi.model.User;

import com.ltts.Springrestapi.repository.UserRepository;

@Service 
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository eRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		//return null;
		return eRepository.findAll();
	}

	@Override
	public User saveUsers(User user) {
		// TODO Auto-generated method stub
		return eRepository.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> user = eRepository.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		}
		else {
			throw new RuntimeException("Ëmployee not found with id "+id);
		}
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		eRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return eRepository.save(user);
	}

}
