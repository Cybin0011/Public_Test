package QuestionTest;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-09 9:05
 */
public class Test {
    public static void main(String[] args) {

    }
}
class person{
    private String name;
    private int age;

    person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public void habit(String h){
        System.out.println(h);
    }
}
class Student extends person
{
    Student(String name, int age) {
        super(name, age);
    }
}
