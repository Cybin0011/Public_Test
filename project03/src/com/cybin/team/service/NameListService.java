package com.cybin.team.service;

import com.cybin.team.domain.*;

import static com.cybin.team.service.Data.*;


/**
 * @author Chen Yuanbin
 * @despription 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作
 * Employee[]的方法。
 * @create 2022-04-20 9:56
 */
public class NameListService {
    private Employee[] employees;

    /*  1.根据项目提供的Data类构建相应大小的employees数组
        2.再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，
        以及相关联的Equipment子类的对象
        3.将对象存于数组中*/
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
//        根据序号生成对应员工类型的对象
        for (int i = 0; i < employees.length; i++) {
//        取Data中的各员工类型号
            int TyperID = Integer.parseInt(EMPLOYEES[i][0]);
//            获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            int salary = Integer.parseInt(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (TyperID) {
                case EMPLOYEE: {
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                }
                case PROGRAMMER: {
                    equipment = CreatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                }
                case DESIGNER: {
                    equipment = CreatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                }
                case ARCHITECT: {
                    equipment = CreatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary,equipment, bonus, stock);
                }
            }
        }
    }


    private Equipment CreatEquipment(int number) {
        int EtypeID = Integer.parseInt(EQUIPMENTS[number][0]);
        switch (EtypeID) {
            case PC: {
                String model = EQUIPMENTS[number][1];
                String display = EQUIPMENTS[number][2];
                return new PC(model, display);
            }
            case NOTEBOOK: {
                String model = EQUIPMENTS[number][1];
                double price = Double.parseDouble(EQUIPMENTS[number][2]);
                return new NoteBook(model, price);
            }
            case PRINTER: {
                String name = EQUIPMENTS[number][1];
                String type = EQUIPMENTS[number][2];
                return new Printer(name, type);
            }
        }

        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }
    public Employee getEmployee(int id)throws Exception{
        for (int i = 0; i < employees.length; i++) {
            if(id==employees[i].getId())
                return employees[i];
        }
        throw new TeamException("没有此人！");
    }
}
