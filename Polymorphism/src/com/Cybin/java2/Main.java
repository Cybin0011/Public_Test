package com.Cybin.java2;


/**
 * @author Chen Yuanbin
 * @create 2022-03-30 16:09
 */
public class Main {
    public static void main(String[] args) {
        Customer [] customers = {new Customer("A","tom"),new Customer("B","jerry")};
        customers[0].setAccount(new Account(1000));
        customers[1].setAccount(new Account(2000));
        customers[0].getAccount().deposit(100);
        customers[0].getAccount().deposit(100);
        new Main().getCustomerInfo(customers[1]);
        Bank bank=new Bank(customers);

    }
    public void getCustomerInfo(Customer customer){
        System.out.println(
               "[ "+ customer.getFirsname()+customer.getLastname()+" ]"
                +"your balance :"+customer.getAccount().getBalance()
        );
    }
}
