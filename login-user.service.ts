import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginUserService {

  constructor(private http:HttpClient ) { }

//Login user Service
public loginUser(userLogin:any){
  //console.log('http://localhost:8081/user',user);
  return this.http.post('http://localhost:8081/user',userLogin);
}

}
