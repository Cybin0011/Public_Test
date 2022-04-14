package com.Cybin.java6;

/**
 * @author Chen Yuanbin
 * @create 2022-04-02 17:10
 */
public class Account {
    private static  long innit=101100;
    private  long account_id;
    private  String account_pwd;
    private  long balance;
    private  double InterestRate;
    private  static long balance_min=100;
    public Account(){}
    public Account(String pwd,long bala,double Rate){
        account_id=innit;
        account_pwd=pwd;
        balance=bala;
        InterestRate=Rate;
        this.innit++;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public void setAccount_pwd(String account_pwd) {
        this.account_pwd = account_pwd;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }


    public static void setBalance_min(long balance_min) {
        Account.balance_min = balance_min;
    }

    public long getAccount_id() {
        return this.account_id;
    }
}

