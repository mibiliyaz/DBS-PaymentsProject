import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http"
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';

@Injectable({
  providedIn: 'root'
})
export class BackendConnService {

  constructor(private httpcli: HttpClient) { }

  private url:string = "http://localhost:8080/"

  validateLogin(un:string|any, up:string|any) : boolean {
    let creden = { "una":this.httpcli.get(this.url+"getUN"), "upw":this.httpcli.get(this.url+"getPW") };
    console.log("MMIIBB: "+creden.una+" , "+creden.upw);
    if(un==creden.una && up==creden.upw) return true;
    else return false;
  } 

}
