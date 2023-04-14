package com.courses.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long user_id;
		private String first_name;
		private String last_name;
		private int age;
		private long phone;
		private String mail;
		private String password;
		private String con_password;
		//private boolean enabled= true;
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public User(long user_id, String first_name, String last_name, int age, long phone, String  mail, String password, String con_password) {
			super();
			this.user_id = user_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.age =age;
			this.phone= phone;
			this.mail= mail;
			this.password= password;
			this.password= con_password;
		}


		public long getUser_id() {
			return user_id;
		}

		public void setUser_id(long user_id) {
			this.user_id = user_id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		
		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password =password;
		}
		
		public String getCon_password() {
			return con_password;
		}

		public void setCon_password(String con_password) {
			this.con_password =con_password;
		}
		
		/* public String isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled =enabled;
		} */
		
		@Override
		public String toString() {
			return "User [user_id=" + user_id + ",first_name=" + first_name + ",mail" +mail +", password= "+ password +"]";
				
		}

	}


