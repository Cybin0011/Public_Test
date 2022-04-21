package com.cybin.team.domain;

import com.cybin.team.service.Status;

/**
 * @author Chen Yuanbin
 * @create 2022-04-19 16:05
 */
public class Programmer extends Employee{
    private int memberid;//团队中的id
    private Status status= Status.FREE;//员工状态
    private Equipment equipment;//员工所持设备

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails()+"\t程序员\t"+getStatus()+"\t\t\t"+equipment.getDescription();
    }

   public String getaTeamBasicDetails(){
        return getMemberid()+"/"+getId()+"\t"+getName()+"\t"+getAge();
   }
   public String getDetailsForTeam(){
        return getDetailsForTeam()+"\t程序员\t";
    }
}
