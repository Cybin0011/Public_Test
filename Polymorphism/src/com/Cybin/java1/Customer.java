package com.Cybin.java1;

/**
 * @author Chen Yuanbin
 * @create 2022-03-30 14:50
 */
public class Customer {
    private  String firsname;
    private  String lastname;
    private  Account account;
    public Customer(){}
    public Customer(String f,String l){
        firsname=f;
        lastname=l;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public  void  get_customer_info(){
        System.out.println( "Customer ["
                +getFirsname()+","+getLastname()
                +"] has a account: id is "
                +this.account.getId()
                +" annualInterestRate is "
                +this.account.getAnnualInterestRate()
                +"%,balance is "+this.account.getBalance()
            );
    }
}
