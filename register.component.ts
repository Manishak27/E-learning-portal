import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { FormBuilder , FormGroup, Validators } from '@angular/forms';  

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  constructor(private userService:UserService){}

public user={
  first_name:'',
  last_name:'', 
  age:'',
  phone:'', 
  mail:'',
  password:'',
  con_password:'', 
};

ngOnInit(): void{
}

formSubmit() 
{
  console.log(this.user);
  alert('Submit details !');

//addUser:from user service
 this.userService.addUser(this.user).subscribe(
  (data) => {
    //success
    console.log(data);
    alert('Successsfully Registered! Please login!');
     },
  (error) => {
    //error
    console.log(error);
    alert('Something went wrong');
  });

}

//this.user

}



