package com.Cybin.java0;

/**
 * @author Chen Yuanbin
 * @create 2022-04-08 14:25
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee [] employees=new Employee[10];
        employees[0]=new HourlyEmployee("tom",1000,new MyDate(1999,2,6),20,210);
        employees[1]=new SalariedEmployee("jerry",1001,new MyDate(1999,4,6),2200);
        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());
    }
}
