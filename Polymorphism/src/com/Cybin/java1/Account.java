package com.Cybin.java1;

/**
 * @author Chen Yuanbin
 * @create 2022-03-30 14:50
 */
public class Account {
    private  int id;
    private  double balance;
    private double annualInterestRate;
    public Account(){

    }
    public Account(int id,double balance,double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
        this.balance=balance;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public  void withdraw(double amount)
    {
        if (amount<0) {
            System.out.println("取款金额输入非法！");
            return;
        }
        if (amount >this.balance) {
            System.out.println("余额不足，取款失败");
        }
        else {
            setBalance(this.balance-amount);
            System.out.println("成功取出："+amount);
        }
    }

    public  void deposit(double amount)
        {
            if (amount<0) {
                System.out.println("存款金额输入非法！");
                return;
            }
            setBalance(this.balance+amount);
            System.out.println("成功存入："+amount);
        }
}
