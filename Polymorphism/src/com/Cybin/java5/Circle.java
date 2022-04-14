package com.Cybin.java5;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 16:35
 */
public class Circle extends GeometricObject {
   private double radius;

    public  Circle(String c,double w,double r){
        super(c,w);
        radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return radius*radius*3.14;
    }
}
