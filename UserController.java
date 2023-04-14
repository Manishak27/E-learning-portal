package com.courses.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.demo.entities.User;
import com.courses.demo.services.UserService;

@RestController
//@RequestMapping("/user")
//@CrossOrigin("*") //for all hosts
@CrossOrigin(origins="http://localhost:4200") //for 4200
public class UserController {

	@Autowired
	private UserService userService;	
	

	//get:view all students
	@GetMapping("/user")
	public List<User> getUsers(){
		
		return this.userService.getUsers();
	}
	
	//get by user_id:
	@GetMapping("/user/{user_id}")
	public User getUser(@PathVariable("user_id") long user_id) 
	{
		return this.userService.getUser(user_id);
		
	} 
	
	//post:create user: add user: registration form
	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		
		return this.userService.createUser(user);
	}
	
	//update user
	@PutMapping("/user/{user_id}")
	public User updateUser(@RequestBody User user) 
	{
		return this.userService.updateUser(user);
	}
	
	//delete user
	@DeleteMapping("/user/{user_id}")
	  public ResponseEntity<HttpStatus> deleteUser(@PathVariable String user_id)
	    {
		  try {
			  this.userService.deleteUser(Long.parseLong(user_id));
			  return new ResponseEntity<>(HttpStatus.OK);
		  }catch(Exception e) {
			  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	        
	   	    }  	
/*	@DeleteMapping("/user/{user_id}")
	public void deleteUser(@RequestBody User user) {
		
		this.userService.deleteUser(user);
	} */
	
}
