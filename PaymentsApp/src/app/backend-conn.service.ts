import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http"
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { Customers } from './Models/customers';
import { map, Observable } from 'rxjs';
import { Banks } from './Models/banks';
import { Message } from './Models/message';
import { Transactions } from './Models/transactions';
import { Login } from './Models/login';

@Injectable({
  providedIn: 'root'
})
export class BackendConnService {

  constructor(private httpcli: HttpClient) { }

  private url:string = "http://localhost:3087/";

  validateLogin(uname:string, pswd:string):Observable<Login> {
    return this.httpcli.get<Login>(this.url+"loginapi/login/"+uname).pipe(map(response => response));
  }

  //Sample data
  name = ["MIB","Mirza","Iliyaz","Baig","Faisal"];//sample
  bal = [40000,26000,33000,172000,15000];//sample
  od = ["yes","no","yes","no","no"];
  //-----------
  getCustDetails(cId:string):Observable<Customers> {
    return this.httpcli.get<Customers>(this.url+"customersapi/customers/"+cId).pipe(map(response => response));
    // return {"name":this.name[cId-1], "bal":this.bal[cId-1], "od":this.od[cId-1]};
  }

  //sample data
  Banks:{[key: number]: string} = {101:"aBank", 102:"bBank", 103:"cBank", 104:"dBank", 105:"eBank"};
  //-------
  getBankDetails(bic:string):Observable<Banks> {
    return this.httpcli.get<Banks>(this.url+"banksapi/banks/"+bic).pipe(map(response => response));
    // return this.Banks[bic];
  }

  //sample data
  SncLis = "Ibrahim, Khan, Modi, Gunda"
  //------
  chkSanc(name:string) {
    // let SncLis= this.httpcli.get(this.url+"SncLis");
    if(name!="" && this.SncLis.includes(name)) return true;
    else return false;
  }

  getMsgCodes():Observable<Message[]> {
    return this.httpcli.get<Message[]>(this.url+"messageapi/message").pipe(map(response => response));
    // return ["abc", "bcd","def","efg"]; //sample data
  }

  TransactionsList:String[]=[];
  getTransacs(cid:string):Observable<Transactions[]> {
    return this.httpcli.get<Transactions[]>(this.url+"transactionsapi/transactions/"+cid).pipe(map(response => response));
  }
  submitTransaction(transaction:Transactions, TrnsStmt:string):Observable<Transactions> {
    this.TransactionsList.push(TrnsStmt);
    return this.httpcli.post<Transactions>(this.url+"transactionsapi/transactioned",transaction);
  }

  // updateBal(transaction:Transactions, TrnsStmt:string):Observable<Transactions> {
  //   let customer:Customers = new Customers()
  //   let cus = this.httpcli.get<Customers>(this.url+"customersapi/customers/"+transaction.customer_id).pipe(map(response => response));
  //   cus.subscribe(data => {
  //     customer=data;
  //   });
  //   customer.cust_id=customer.cust_id;
  //   customer.cust_name=customer.cust_name;
  //   customer.overdraft=customer.overdraft;
  //   customer.clear_balance=customer.clear_balance-transaction.amount;
  //   this.httpcli.put<Customers>(this.url+"customersapi/customersupdate",customer);
  //   console.log("Customer updated: "+customer);//------------
  //   cus = this.httpcli.get<Customers>(this.url+"customersapi/customers/"+transaction.receiver_id).pipe(map(response => response));
  //   cus.subscribe(data => {
  //     customer=data;
  //   });
  //   customer.cust_id=customer.cust_id;
  //   customer.cust_name=customer.cust_name;
  //   customer.overdraft=customer.overdraft;
  //   customer.clear_balance=customer.clear_balance+transaction.amount;
  //   this.httpcli.put<Customers>(this.url+"customersapi/customersupdate",customer);
  //   console.log("Receiver updated: "+customer);//-------------
  //   this.getCustDetails(transaction.customer_id).subscribe(data => console.log(data))
  // } 

}
