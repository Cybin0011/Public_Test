package com.Cybin.java7;

/**
 * @author Chen Yuanbin
 * @create 2022-04-14 14:01
 */
public class SuperClass {
    private String PriStr="superclass private str";
    public String PubStr="superclass public";

    public void func(String pubStr){
        this.PubStr=pubStr;
    }

}
