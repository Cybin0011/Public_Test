package com.Cybin.java3;

/**
 * @author Chen Yuanbin
 * @create 2022-04-11 15:20
 */
public class CompareCircle extends Circle implements CompareObject {


    public CompareCircle(Double r)
    {
        super();
        super.setRadius(r);
    }
    public int compareTo(Object o) {
        Circle circle =(Circle) o;
//        if(this.getRadius()>circle.getRadius())
//            return 1;
//        else if(this.getRadius()<circle.getRadius())
//            return -1;
//        else
//            return 0;
        this.getRadius().compareTo(circle.getRadius());
        return  0;
    }
}
