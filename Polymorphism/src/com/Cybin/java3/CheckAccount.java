package com.Cybin.java3;


/**
 * @author Chen Yuanbin
 * @create 2022-03-31 14:30
 */
public class CheckAccount extends Account{
    private double overdraft;
//    public CheckAccount(){
//    }
    public CheckAccount(int id,double balance,double annualInterestRate ,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft=overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public void withdraw(double amount){
        if(amount<=this.getBalance())
        {
            setBalance(getBalance()-amount);
        }
        else if(amount>this.getBalance())
        {
            if(amount<=(getBalance()+overdraft))
            {
                setOverdraft(overdraft-(amount-getBalance()));
                setBalance(0);
            }else
            {
                System.out.println("超过可透支金额");
                return;
            }
        }
        System.out.println("取款成功："+amount
                +",当前余额："+getBalance()
                +",可透支额："+this.overdraft);
    }
}
