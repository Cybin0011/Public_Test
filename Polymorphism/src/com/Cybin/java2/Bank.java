package com.Cybin.java2;



/**
 * @author Chen Yuanbin
 * @create 2022-03-30 16:31
 */
public class Bank {
    private int  numberOfCustomer;
    private Customer [] customers=new Customer[100];
    public Bank(Customer[] customers){
        numberOfCustomer = customers.length;
        this.customers=customers;
    }
    public void addCustomer (String f,String l)
    {
        customers[this.customers.length]=new Customer(f,l);
        this.numberOfCustomer++;
    }
    public int  getNumOfCustomer(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index) {
        return this.customers[index];
    }

}
