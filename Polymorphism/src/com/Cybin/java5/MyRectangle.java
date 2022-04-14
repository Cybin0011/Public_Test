package com.Cybin.java5;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 16:35
 */
public class MyRectangle extends GeometricObject{
    double width;
    double height;
    protected MyRectangle(String color, double weight,double width,double height) {
        super(color, weight);
        this.width=width;
        this.height=height;
    }
    public double findArea(){
        return width*height;
    }
}
