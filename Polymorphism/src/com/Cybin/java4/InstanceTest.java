package com.Cybin.java4;

/**
 * @author Chen Yuanbin
 * @create 2022-03-31 15:57
 */
public class InstanceTest {
    public static void main(String[] args) {
        Student student=new Student();
       InstanceTest instanceTest=new InstanceTest();
       instanceTest.method(student);
    }
    public void method(Person e){
        if(e instanceof Person)
            System.out.println("a person");
        if(e instanceof Student)
            System.out.println("a student");
        if(e instanceof  Graduate)
            System.out.println("a graduate student");
    };
}
