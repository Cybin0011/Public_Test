package com.Cybin.java0;


import java.util.Date;

/**
 * @author Chen Yuanbin
 * @create 2022-04-08 11:04
 */
public class SalariedEmployee extends Employee{
    private double  monthlySalary;
    public SalariedEmployee (String name,long number,MyDate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary=monthlySalary;
    }   double earnings(){
        Date date=new Date();
        if(date.getMonth()+1==this.getBirthday().getMonth())
            return monthlySalary+100;
        return monthlySalary;
    }
    public String toString(){
        return  " employee type:"+getClass().getName()
                +",name:"+getName()+",number:"+getNumber()+",birthday:"
                +getBirthday().toDateString()+",gotten salary:"+earnings();
    }
}
