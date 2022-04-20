package com.cybin.team.junit;

import com.cybin.team.domain.Employee;
import com.cybin.team.service.NameListService;

/**
 * @author Chen Yuanbin
 * @description 测试
 * @create 2022-04-20 13:58
 */
public class NameListServiceTest {


    public static void main(String[] args) {
        NameListServiceTest test=new NameListServiceTest();
        test.testgetAllEmployees();
        test.testGetemployee(3);
    }
    NameListService service= new NameListService();
    public void testgetAllEmployees(){
        Employee[] allEmployees = service.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i].toString());
        }
    }
    public Employee testGetemployee(int id){
        Employee employee=null;
        try {
            employee = service.getEmployee(id);
            System.out.println(employee.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }
}
