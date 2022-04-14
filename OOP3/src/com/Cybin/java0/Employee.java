package com.Cybin.java0;

/**
 * @author Chen Yuanbin
 * @create 2022-04-08 11:03
 */
abstract  public class Employee {
    private String name;
    private long number;
    MyDate birthday=new MyDate();
    abstract double earnings();
    public Employee(){}
    public Employee(String name,long number,MyDate birthday){
        this.name=name;
        this.number=number;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
