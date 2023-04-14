package com.courses.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


	@SpringBootApplication
	@ComponentScan //new
	public class SpringBootDemoCoursesApplication implements CommandLineRunner  {   

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDemoCoursesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Application...");
		
		/* User user= new User();
		
		user.setFirst_name("Manisha");
		user.setLast_name("Kalushe");
		user.setUser_name("manisha@gmail.com");
		user.setPassword("gfg678");
		user.setPhone(945323424);
		
		User user1= this.userService.createUser(user);
		System.out.println(user1); */
	}

 }
 