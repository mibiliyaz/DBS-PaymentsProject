import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http"
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';

@Injectable({
  providedIn: 'root'
})
export class BackendConnService {

  constructor(private httpcli: HttpClient) { }

  private url:string = "http://localhost:8080/";

  validateLogin(un:string|any, up:string|any) : boolean {
    // let creden = { "una":this.httpcli.get(this.url+"getUN"), "upw":this.httpcli.get(this.url+"getPW") };
    // if(un==creden.una && up==creden.upw) return true;
    if(un=="mib" && up=="mib") return true; //sample
    else return false;
  }
  
  //Sample data
  name = ["MIB","Mirza","Iliyaz","Baig","Faisal"];//sample
  bal = [40000,26000,33000,172000,15000];//sample
  od = ["yes","no","yes","no","no"];
  //-----------
  getCustDetails(cId:number) {
    // return this.httpcli.get(this.url+"getCustData?id="+cId);
    return {"name":this.name[cId-1], "bal":this.bal[cId-1], "od":this.od[cId-1]};
  }

  //sample data
  Banks:{[key: number]: string} = {101:"aBank", 102:"bBank", 103:"cBank", 104:"dBank", 105:"eBank"};
  //-------
  getBankDetails(bic:number) {
    // return this.httpcli.get(this.url+"getBankData?bic="+bic);
    return this.Banks[bic];
  }

  getRecDetails(rAccNo:number) {
    let name:any;
    // return this.httpcli.get(this.url+"name?id"+rAccNo);
    return {"rname" : this.name[rAccNo-1]}
  }

  //sample data
  SncLis = "Ibrahim, Khan, Modi, Gunda"
  //------
  chkSanc(name:string) {
    // let SncLis= this.httpcli.get(this.url+"SncLis");
    if(name!="" && this.SncLis.includes(name)) return true;
    else return false;
  }

  getMsgCodes() {
    // return this.httpcli.get(this.url+"MsgCodes");
    return ["abc", "bcd","def","efg"]; //sample data
  }

  TransactionsList:String[]=[];
  updateBal(bal:number, od:number, TrnsStmt:string, transacType:string, msgCode:string) {
    //update details
    this.TransactionsList.push(TrnsStmt);
  }

}
