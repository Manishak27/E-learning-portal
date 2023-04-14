package com.courses.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courses.demo.dao.UserDao;
import com.courses.demo.entities.User;

@RestController
//@RequestMapping("/user")
//@CrossOrigin("*") //for all hosts
@CrossOrigin(origins="http://localhost:4200") //for 4200
public class UserLoginController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User userData){
		
		User user=userDao.findByMail(userData.getMail());
		
		if(user.getPassword().equals(userData.getPassword())) {
			return ResponseEntity.ok(user);
		}
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
}
