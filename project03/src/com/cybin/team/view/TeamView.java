package com.cybin.team.view;

import com.cybin.team.domain.Employee;
import com.cybin.team.domain.Programmer;
import com.cybin.team.service.NameListService;
import com.cybin.team.service.TeamException;
import com.cybin.team.service.TeamService;

import java.security.interfaces.ECKey;

/**
 * @author Chen Yuanbin
 * @description
 * @create 2022-04-21 11:47
 */
public class TeamView {
    private NameListService namelistservice = new NameListService();
    private TeamService teamservice = new TeamService();


    public void enterMainMenu() {

        boolean Loopflag = true;
        char menu = 0;
        while (Loopflag) {

            if (menu != '1')
                listAllEmployees();
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMenber();
                    break;
                case '3':
                    deleteMenber();
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）:");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y')
                        Loopflag = false;
                    System.out.println("退出");
                    break;
            }
        }
    }

    //显示所有员工的信息
    private void listAllEmployees() {
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------\n");
        Employee[] allEmployees = namelistservice.getAllEmployees();
        if (allEmployees == null || allEmployees.length == 0) {
            System.out.println("公司没有任何员工信息");
        } else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (int i = 0; i < allEmployees.length; i++) {
                System.out.println(allEmployees[i].toString());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------\n");
    }

    private void getTeam() {
        Programmer[] team = teamservice.getTeam();
        System.out.println("查看团队成员");
        System.out.println("--------------------团队成员列表---------------------\n");
        if (team == null || team.length == 0) {
            System.out.println("开发团队为空");
        } else {
            System.out.println("TDI/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].toString());
            }
            System.out.println("-----------------------------------------------------\n");
        }

    }

    private void addMenber() {
        System.out.println("添加团队成员");
        System.out.println("---------------------添加成员---------------------\n");
        System.out.println("请输入要添加成员的ID：");
        int id = TSUtility.readInt();
        try {
            Employee emp=namelistservice.getEmployee(id);
            teamservice.addMenber(emp);
            System.out.println("添加成功！");
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e)
       {
            System.out.println("nullException");
        }

    }

    private void deleteMenber() {
        System.out.println("删除团队成员");
    }


    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }


}
