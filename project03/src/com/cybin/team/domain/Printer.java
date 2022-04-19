package com.cybin.team.domain;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 15:54
 */
public class Printer implements Equipment{

    private String name;//机器名
    private String type;//机器型号
    public Printer() {
    }

    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
