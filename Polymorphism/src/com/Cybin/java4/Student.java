package com.Cybin.java4;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 15:58
 */
public class Student extends Person{
    protected String school="pku";
    public String geiInfo(){
        return "name:"+name+",age:"+age+",school:"+school;    }
}
