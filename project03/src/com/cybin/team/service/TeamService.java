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
    private Programmer[] team = new Programmer[MAX_MENBER];
    private int total = 0;

    public TeamService() {
        super();
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[this.total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMenber(Employee employee) throws TeamException {
//失败信息包含以下几种：
//  成员已满，无法添加
        if (total >= MAX_MENBER)
            throw new TeamException("成员已满，无法再添加");
//  该成员不是开发人员，无法添加
        if (!(employee instanceof Programmer))
            throw new TeamException("该人员不是开发人员，无法添加");
//  该员工已在本开发团队中
        for (int i = 0; i < total; i++) {
            if (employee.getId() == team[i].getId())
                throw new TeamException("该人员已在本团队中，无法再添加");
        }
//  该员工已是某团队成员
        if (((Programmer) employee).getStatus() == Status.BUSY) {
            throw new TeamException("该人员已在其他团队中，无法添加");
        }
//  该员正在休假，无法添加
        if (((Programmer) employee).getStatus() == Status.VOCATION) {
            throw new TeamException("该人员正在度假，无法添加");
        }
//  团队中至多只能有一名架构师
//  团队中至多只能有两名设计师
//  团队中至多只能有三名程序员
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect)
                numOfArch++;
            else if (team[i] instanceof Designer) {
                numOfDes++;
            } else {
                numOfPro++;
            }
        }
        if (employee instanceof Architect) {
            if (numOfArch >= 1)
                throw new TeamException("架构师数已上限，不能再加入架构师");
        } else if (employee instanceof Designer) {
            if (numOfDes >= 2)
                throw new TeamException("设计师数已上限，不能再加入设计师");
        } else if (employee instanceof Programmer) {
            if (numOfPro >= 3)
                throw new TeamException("程序员数已上限，不能再加入程序员");
        }


        //非法情况都排除,后添加成员,
        this.team[total++] = (Programmer) employee;
        //员工状态更新

        this.team[total-1].setStatus(Status.BUSY);
        //设置员工团队中的id
        this.team[total-1].setMemberid(counter++);

    }

    public void removeMenber(int menberID) throws TeamException {
        //删除失败的情况
        //团队为空
        int i = 0;
        if (total == 0)
            throw new TeamException("团队中无人，删除失败");
        //查问此人
        for (; i < total; i++) {
            if (menberID == team[i].getMemberid())
                break;
        }
        if (team[i].getMemberid() != menberID)
            throw new TeamException("团队中没有此人，删除失败");
        //删除
        team[i].setStatus(Status.FREE);
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[--total]=null;
    }


}
