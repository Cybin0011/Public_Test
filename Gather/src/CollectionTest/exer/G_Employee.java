package CollectionTest.exer;

import java.util.Iterator;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-10 15:55
 */
public class G_Employee implements Comparable <G_Employee>{
    private String name;
    private int age;
    private Mydate birthday;

    public G_Employee() {
    }

    public G_Employee(String name, int age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "G_Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(G_Employee emp) {

        return this.name.compareTo(emp.getName());

    }


}
