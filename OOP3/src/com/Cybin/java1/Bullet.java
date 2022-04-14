package com.Cybin.java1;

/**
 * @author Chen Yuanbin
 * @create 2022-04-11 10:47
 */
public class Bullet implements CanFly,CanAttract {
    @Override
    public String flyWays() {
        return "高速子弹";
    }

    @Override
    public String attractWays() {
        return "强力打击";
    }
}
