import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BackendConnService } from '../backend-conn.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router, private bes: BackendConnService) { }

  ngOnInit(): void {
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
    // if(this.day=="Sunday" || this.day=="Saturday") {
    //   alert("Sorry today the bank is closed.");
    //   this.router.navigate(['']);
    // }
  }

  //Customer Details
  cId=0;
  cName="";
  cBal=0;
  overdraft="";
  //getting customer details
  custDetails:any;
  dispD() {
    this.custDetails = this.bes.getCustDetails(this.cId);
    this.cName=this.custDetails.name;
    this.cBal=this.custDetails.bal;
    this.overdraft=this.custDetails.od;
    this.sConfirm=false;
  }

  //Receiver details
  BICnum = 0;
  instName = "";
  rAccNo = 0;
  rName="";
  //getting Bank Details
  dispBICD() {
    this.instName = this.bes.getBankDetails(this.BICnum);
  }
  //getting Receiver Details
  recDetails:any; 
  dispRecName() {
    this.rName = this.bes.getRecDetails(this.rAccNo).rname;
    //checking sanction list
    if(this.bes.chkSanc(this.rName)) {
      alert("Name match sanction list.");
      this.router.navigate(['']);
    }
  }

  //Transaction Details
  transacType ="";
  TransactionsList:String[]=this.bes.TransactionsList;
  selTransacType(tt:string) {
    this.transacType = tt;
  }
  //getting message codes
  msgCodes = this.bes.getMsgCodes();
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
    this.bes.updateBal(bal, od, TrnsStmt, this.transacType, this.msgCode);
    this.sConfirm=false; 
    this.rConfirm=false
    this.transcmp = true;
  }
  clearr() {
    this.cId = 0;
    this.dispD();
    this.BICnum = 0;
    this.dispBICD();
    this.rAccNo = 0;
    this.dispRecName();
    this.amt = 0;
    this.transFee = 0;
    this.TcBal = 0;
  }

}
