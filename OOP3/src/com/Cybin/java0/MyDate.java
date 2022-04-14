package com.Cybin.java0;

import java.time.Year;

/**
 * @author Chen Yuanbin
 * @create 2022-04-08 11:04
 */
public class MyDate {
    private  int year;
    private  int month;
    private  int day;
    public  MyDate (){}
    public  MyDate (int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toDateString()
    {
        return String.valueOf(year)+"年"
                +String.valueOf(month)+"月"
                +String.valueOf(day)+"日";
    }
}
