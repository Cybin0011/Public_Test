package com.cybin.team.domain;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 17:09
 */
public class Architect extends Designer{
    private int stock;//股票

    public Architect() {
        super();
    }


    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails()+"\t架构师\t"+ getStatus()+"\t"+getBonus()+"\t"+getStock()+"\t"+getEquipment().getDescription();

    }
}
