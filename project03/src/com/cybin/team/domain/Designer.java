package com.cybin.team.domain;

import com.cybin.team.service.Status;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 17:08
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
        super();
    }


    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails()+"\t设计师\t"+ getStatus()+"\t"+getBonus()+"\t\t"+getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getTeamBasicDetails()+"\t设计师\t"+getBonus();
    }
}
