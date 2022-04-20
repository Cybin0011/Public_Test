package com.cybin.team.service;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 16:07
 */
public class Status {
    private final String NAME;
    private Status(String name){
        NAME=name;
    }
    public static final Status FREE= new Status("FREE");
    public static final Status BUSY=new Status("BUSY");
    public static final Status VOCATION=new Status("VOCATION");

    @Override
    public String toString() {
        return NAME;
    }
}
