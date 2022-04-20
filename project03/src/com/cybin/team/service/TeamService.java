package com.cybin.team.service;

import com.cybin.team.domain.Architect;
import com.cybin.team.domain.Designer;
import com.cybin.team.domain.Employee;
import com.cybin.team.domain.Programmer;

/**
 * @author Chen Yuanbin
 * @description 关于开发团队成员的管理：添加、删除等。
 * @create 2022-04-20 15:57
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MENBER = 5;
    Programmer[] team = new Programmer[MAX_MENBER];
    private int total = 0;

    public TeamService() {
        super();
    }

    public Programmer[] getTeam() {
        return null;
    }

    public void addMenber(Employee employee) throws TeamException {
//失败信息包含以下几种：
//  成员已满，无法添加
        if(total>=MAX_MENBER)
            throw new TeamException("成员已满，无法再添加");
//  该成员不是开发人员，无法添加
        if(!(employee instanceof Programmer))
            throw new TeamException("该人员不是开发人员，无法添加");
//  该员工已在本开发团队中
        for (int i=0;i<total;i++) {
            if(employee.getId()==team[i].getId())
                throw new TeamException("该人员已在本团队中，无法再添加");
        }
//  该员工已是某团队成员
        if(((Programmer) employee).getStatus()==Status.BUSY)
        {
            throw new TeamException("该人员已在其他团队中，无法添加");
        }
//  该员正在休假，无法添加
        if(((Programmer) employee).getStatus()==Status.VOCATION)
        {
            throw new TeamException("该人员正在度假，无法添加");
        }
//  团队中至多只能有一名架构师
//  团队中至多只能有两名设计师
//  团队中至多只能有三名程序员
        int numOfArch=0,numOfDes=0,numOfPro=0;
        for (int i = 0; i <total; i++) {
            if(team[i] instanceof Architect)
                numOfArch++;
            else if(team[i] instanceof Designer) {
                numOfDes++;
            } else{
                numOfPro++;
            }
        }
        if(employee instanceof Architect&&numOfArch>=1){
            throw new TeamException("架构师数已上限，不能再加入架构师");
        }
        if(employee instanceof Designer&&numOfDes>=2){
            throw new TeamException("设计师数已上限，不能再加入设计师");
        }
        if(employee instanceof Programmer&&numOfPro>=3){
            throw new TeamException("程序员数已上限，不能再加入程序员");
        }

        //非法情况都排除后，添加成员
        team[total++]= (Programmer) employee;


    }

    public void removeMenber(int menberID) throws TeamException {
    }


}
