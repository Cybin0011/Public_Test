package com.cybin.team.domain;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 13:58
 */
public class PC implements Equipment {
//    model表示机器型号
//    display 表示显示器名称

    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
//    返回各自的属性信息
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
