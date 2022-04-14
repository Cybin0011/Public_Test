package com.Cybin.java3;

/**
 * @author Chen Yuanbin
 * @create 2022-04-11 15:21
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareCircle c1=new CompareCircle(4.3);
        CompareCircle c2=new CompareCircle(4.0);
        System.out.println(c1.compareTo(c2));

    }
}
