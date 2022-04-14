package com.Cybin.java5;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 16:35
 */
public class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(String color,double weight)
    {
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0;
    }
}
