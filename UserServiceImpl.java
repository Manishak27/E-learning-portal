package com.courses.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.demo.dao.UserDao;
import com.courses.demo.entities.Course;
import com.courses.demo.entities.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl() {
		
	}
	
	//get all: all users
	public List<User> getUsers(){
		return userDao.findAll();
	}
	
	//get user by user id:user login
	@Override
		public User getUser(long user_id) {
		
		Optional<User> user=null;
		
	//	try {
			
		user= this.userDao.findById(user_id);
		
		// }catch(Exception e) {
			// e.printStackTrace();
		 //}
		return user.get();  
		
	} 
	
	//Post:create user:registration
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		
		/*User local= this.userDao.findByUser_name(user.getUser_name());
		if(local!=null)
		{
			System.out.println("User already exists...");
		}
		else
		{
			//create user
			
		}*/
		User newUser=userDao.save(user);
		return newUser;
	}                                                                                                                                                                                                                                                                                                                                                                       

     //put: update user
	@Override
	public User updateUser(User user) {
		
		userDao.save(user);
		return user;
	}
	
	//delete user
	@Override
	public void deleteUser(long parseLong) {
		User entity= userDao.getReferenceById(parseLong);
		userDao.delete(entity);
	}

}
