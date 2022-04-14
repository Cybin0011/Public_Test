package com.Cybin.java0;

/**
 * @author Chen Yuanbin
 * @create 2022-03-28 20:14
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest=new AnimalTest();
        animalTest.func(new Animal());//一般
        animalTest.func(new Dog());//一般
        animalTest.func(new Cat());//一般
    }
    public void func(Animal animal)
    {
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物，吃");
    }
    public void shout(){
        System.out.println("动物，叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗，吃骨头");
    }
    public void shout(){
        System.out.println("狗，叫汪汪汪");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫，吃鱼");
    }
    public void shout(){
        System.out.println("猫，叫喵喵喵");
    }
}
