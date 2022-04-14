package com.Cybin.java3;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 14:04
 */
public class Main {
    public static void main(String[] args) {
    CheckAccount checkAccount=new CheckAccount(1122,20000,4.5,8000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);

    }
}
