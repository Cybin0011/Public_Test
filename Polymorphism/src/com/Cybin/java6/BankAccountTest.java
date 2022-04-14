package com.Cybin.java6;

/**
 * @author Chen Yuanbin
 * @create 2022-04-02 17:10
 */
public class BankAccountTest {
    public static void main(String[] args) {
        Account []accounts={new Account("pwd123",1000,3.5),
                            new Account("pwd234",2000,2.0),
                            new Account("pwd345",15000,2.5)};
        System.out.println(accounts[0].getAccount_id());
        System.out.println(accounts[1].getAccount_id());
    }
}
