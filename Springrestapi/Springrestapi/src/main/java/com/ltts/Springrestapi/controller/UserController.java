package com.ltts.Springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Springrestapi.model.User;
import com.ltts.Springrestapi.service.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService eService;
	
	
	@GetMapping(value="/users")
	public List<User> getUsers () {
		return eService.getUsers();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return eService.getUserById(id);
	}
	
	@PostMapping("/user")
	public User save(@RequestBody User e) {
		return eService.saveUsers(e);
	}
	
	@PutMapping("/users/{id}")
	public User update(@RequestBody User e, @PathVariable Integer id) {
		e.setId(id);
		return eService.updateUser(e);
	}
		
	/*@DeleteMapping("/employees")
	public void deleteEmployee(@RequestParam("id") Long id) {
		eService.deleteEmployee(id);
	}*/
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		eService.deleteUser(id);
	}
}
