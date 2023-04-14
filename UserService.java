package com.courses.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.courses.demo.entities.User;

@Service
public interface UserService {
	//get all users
	public List<User> getUsers();
	
	//get user by user id
	public User getUser(long user_id);
	//public User findByUser_name(String user_name);
	
	//creating user
	public User createUser(User user);

	//update user
	public User updateUser(User user);
	
	//delete user
	public void deleteUser(long user_id);
		
}
