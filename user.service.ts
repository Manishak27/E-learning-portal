
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserLogin } from '../pages/login/user-login';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient ) {}

//post: add user
public addUser(user:any){
  //console.log('http://localhost:8081/user',user);
  return this.http.post('http://localhost:8081/user',user);
}

 
}
