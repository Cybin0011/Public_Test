package com.Cybin.java0;

/**
 * @author Chen Yuanbin
 * @create 2022-03-29 9:48
 */
public class Practice1 {
    public static void main(String[] args) {

    }
}
class  Person{
    String name;
    char sex;
    int age;
    //各种重载的构造器
    Person(){
    }
    Person(String name){
        this.name=name;
    }
    Person(String name,char sex){
       this(name);
       this.sex=sex;
    }
    Person(String name,char sex,int age){
        this(name,sex);
        this.age=age;
    }

// pvs 快速构建，设置字段的方法
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

class Student  extends  Person{
    long number;
    int math;
    int english;
    int computer;
    Student(String name,char sex,int age)
    {
        super(name,sex,age);
    }
    Student(String name,char sex,int age,int math)
    {
        this(name,sex,age);
        this.math=math;
    }



    }




