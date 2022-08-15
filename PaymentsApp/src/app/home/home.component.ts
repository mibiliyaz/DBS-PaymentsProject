import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'; 
import { BackendConnService } from '../backend-conn.service';
import { Banks } from '../Models/banks';
import { Customers } from '../Models/customers';
import { Message } from '../Models/message';
import { Transactions } from '../Models/transactions';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router, private bes: BackendConnService) { }

  ngOnInit(): void {
    this.bes.getMsgCodes().subscribe(data => this.msgCodes=data);
  }

  //sections handiling
  sConfirm=false; //sender section
  rConfirm=false; //receiver section
  tConfirm=false; //transaction section
  transcmp = false; //transaction complete section

  //getting Date
  d = new Date();
  days:string[] = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
  day = this.days[this.d.getDay()];
  fullDate = this.d.getDate()+" "+this.d.toLocaleString('en-us', { month: 'long' })+" "+this.d.getFullYear()+" "+this.day;

  //function to check if bank is open or not
  isOpen() {
    if(this.day=="Sunday" || this.day=="Saturday") {
      alert("Sorry today the bank is closed.");
      this.router.navigate(['']);
    }
  }

  //Customer Details
  cId:string="";
  cName:string="";
  cBal:number=0;
  overdraft:string="";
  //getting customer details
  visibleS:boolean=false;
  custDetails:Customers = new Customers();
  dispD() {
    this.visibleS=false;
    this.bes.getCustDetails(this.cId).subscribe(data => this.custDetails=data);
    if(this.custDetails != null) {
      this.visibleS = true;
      this.cName=this.custDetails.cust_name;
      this.cBal=this.custDetails.clear_balance;
      this.overdraft=this.custDetails.overdraft;
      this.sConfirm=false;
    }
  }

  //getting Bank Details
  BICnum = "";
  instName = "";
  bnk:Banks = new Banks();
  dispBICD() {
    this.bes.getBankDetails(this.BICnum).subscribe(data => this.bnk=data);
    if(this.bnk != null) this.instName=this.bnk.bname;
    // this.instName = this.bes.getBankDetails(this.BICnum);
  }
  //getting Receiver Details
  rAccNo = "";
  rName="";
  recDetails:Customers = new Customers(); 
  dispRecName() {
    this.bes.getCustDetails(this.rAccNo).subscribe(data => this.recDetails=data);
    if(this.recDetails!=null) this.rName=this.recDetails.cust_name;
  }
  //checking sanction list
  ckhSnc() {
    if(this.bes.chkSanc(this.rName)) {
      alert("Name match sanction list."); 
      this.router.navigate(['']);
    }
  }

  //Transaction Details
  transacType:number;
  trty:{[key:string]:number} = {"1. Bank Transfer":1, "2. Customer Transfer":2, "3. Self Transfer":3};
  selTransacType(tt:string) {
    if(this.trty[tt]==0) alert("Please select the transfer type");
    else this.transacType = this.trty[tt];
  }
  //getting message codes
  msgCodes:Message[] = [];
  msgCode="";
  msgCsel(mc:string) {
    this.msgCode = mc;
  }//-----
  odLimit=25000;
  amt=0;
  transFee=0;
  trnsfeechrg = 0.25;
  TcBal = this.cBal;
  oda = false;
  odStmt="";

  amtS() {
    this.odStmt='';
    this.transFee = (this.amt/100)*this.trnsfeechrg;
    if(this.amt<=this.cBal-this.trnsfeechrg) {
      this.TcBal=this.cBal - this.amt - this.transFee;
    }
    else if (this.overdraft == "yes" && this.amt<=this.cBal+this.odLimit) {
      this.TcBal=this.cBal - this.amt - this.transFee;
      this.oda=true;
      this.odStmt=" Overdraft facility availed.";
    }
    else {
      alert("Transfer amount must be less then current balance.");
      this.odStmt = (this.overdraft=="yes")?" Overdraft facility available.":"";
      this.transFee = (this.cBal/100)*this.trnsfeechrg;
      this.amt = this.cBal - this.transFee;
      this.TcBal = this.cBal-this.amt-this.transFee;
    }
  }
  
  Transed() {
    let bal = this.cBal = this.TcBal;
    let od = (this.oda)?this.amt-this.cBal : this.odLimit;
    let TrnsStmt = this.cId+" "+this.cName+" Transfered Rs. "+this.amt+" to "+this.rAccNo+" "+this.rName+" ("+this.BICnum+" - "+this.instName+") on "+this.fullDate;
    let transactioned:Transactions = new Transactions()
    transactioned.transaction_id=this.bes.TransactionsList.length+1+"";
    transactioned.amount=this.amt;
    transactioned.customer_id=this.cId;
    transactioned.customer_name=this.cName;
    transactioned.receiver_id=this.rAccNo;
    transactioned.receiver_name=this.rName;
    transactioned.receiver_bic=this.BICnum;
    transactioned.receiver_bname=this.instName;
    transactioned.message_code=this.msgCode;
    transactioned.transfer_type=this.transacType;
    transactioned.timestamp = this.retdate(new Date);
    this.bes.submitTransaction(transactioned, TrnsStmt).subscribe(transac => console.log(transac));
    this.sConfirm=false; 
    this.rConfirm=false
    this.transcmp = true;
  }
  retdate(date:Date) {
    return date.getFullYear()+"-"+(( (date.getMonth()+1) < 10 ) ? ("0"+(date.getMonth()+1)):(date.getMonth()+1))+"-"+date.getDate();
  }
  TransactionsList:String[]=this.bes.TransactionsList;
  clearr() {
    this.cId = "";
    this.dispD();
    this.BICnum = "";
    this.dispBICD();
    this.rAccNo = "";
    this.dispRecName();
    this.amt = 0;
    this.transFee = 0;
    this.TcBal = 0;
  }

}
