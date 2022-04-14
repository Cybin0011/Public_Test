package com.Cybin.java0;

import java.util.Date;

/**
 * @author Chen Yuanbin
 * @create 2022-04-08 11:51
 */
public class HourlyEmployee extends Employee {
    private  double  wage;
    private  double  hour;

    public HourlyEmployee (String name,long number,MyDate birthday,double wage,double hour){
        super(name,number,birthday);
        this.wage=wage;
        this.hour=hour;
    }
    double earnings(){
        Date date=new Date();
        if(date.getMonth()+1==this.getBirthday().getMonth())
        return (wage*hour)+100;
        return wage*hour;
    }
    public String toString(){
        return   " employee type:"+getClass().getName()
                +",name:"+getName()+",number:"+getNumber()+",birthday:"
                +getBirthday().toDateString()+",gotten salary:"+earnings();
    }

}
