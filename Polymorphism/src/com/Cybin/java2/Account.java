package com.Cybin.java2;

/**
 * @author Chen Yuanbin
 * @create 2022-03-30 16:10
 */
public class Account {
    private double balance;
    public Account (){}
    public Account (double init_balance){
        balance=init_balance;
    }

    public double getBalance() {
        return balance;
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
            this.balance-=amount;
            System.out.println("成功取出："+amount);
        }
    }

    public  void deposit(double amount)
    {
        if (amount<0) {
            System.out.println("存款金额输入非法！");
            return;
        }
        this.balance+=amount;
        System.out.println("成功存入："+amount);
    }
}
