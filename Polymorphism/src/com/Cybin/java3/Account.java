package com.Cybin.java3;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 14:13
 */
public class Account extends com.Cybin.java1.Account {
//    public Account(){}
    public Account (int id,double balance,double annualIterestRate){
        super(id,balance,annualIterestRate);
    }
    public   void  getMonthlyInterest(){
        System.out.println("月利率:"+(this.getAnnualInterestRate()-1)+"%");
    }
}
