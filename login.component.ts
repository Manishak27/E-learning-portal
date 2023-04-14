import { Component, OnInit } from '@angular/core';
import { UserLogin } from './user-login';
import { LoginUserService } from 'src/app/services/login-user.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements  OnInit{
 
  userLogin:UserLogin=new UserLogin();
 
  

   constructor(private loginUserService:LoginUserService ){
 
 
   }
 
  ngOnInit(): void{}
 
  GetLogin(){
   console.log(this.userLogin)
 
 //login: from login service
 this.loginUserService.loginUser(this.userLogin).subscribe(
   (data) => {
     //success
     console.log(data);
     
     alert('Successfully logged in');
      },
      (error) => {
       //error
       console.log(error);
       alert('Please Enter valid credentials !');
     });
 
 }
 
 }
 
 
 
 