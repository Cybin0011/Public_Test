package com.Cybin.java1;

/**
 * @author Chen Yuanbin
 * @create 2022-03-30 14:49
 */
public class Main {
    public static void main(String[] args) {
        Customer customer_js= new Customer("Jane ","Smith");
        customer_js.setAccount(new Account(1000,2000,1.23));
        Account account_js=customer_js.getAccount();
        account_js.deposit(100);
        account_js.withdraw(960);
        account_js.withdraw(2000);
        customer_js.get_customer_info();
    }
}
