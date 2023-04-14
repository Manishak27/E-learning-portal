package com.courses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.courses.demo.entities.User;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

	//User findByUserName(String mail);

	User findByMail(String mail);
	
	//find by user name
	//public User findByUser_name(String user_name);
	
	
	//public User createUser(User user);

}
