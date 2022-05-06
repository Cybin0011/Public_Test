package compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EmptyStackException;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-06 11:01
 */
public class CompareTest {
    public static void main(String[] args) {
        Man [] mans=new Man[4];
        mans[0]=new Man("A",10,171,120);
        mans[1]=new Man("B",9,172,120);
        mans[2]=new Man("D",11,170,120);
        mans[3]=new Man("E",11,174,120);
        Arrays.sort(mans);
        for (int i = 0; i < mans.length; i++) {
            System.out.println(mans[i].getName());
        }
        Arrays.sort(mans, new Comparator<Man>() {
            Man man1=null,man2=null;
            @Override
            public int compare(Man o1, Man o2) {
                if(o1 instanceof Man&&o2 instanceof Man) {
                    man1 = (Man) o1;
                    man2 = (Man) o2;
                }
                if(o1.getHeight()- o2.getHeight()>0)
                    return 1;
                else if(o1.getHeight()- o2.getHeight()<0)
                    return -1;
                else return 0;
            }
        });
        System.out.println("comparator");
        for (int i = 0; i < mans.length; i++) {
            System.out.println(mans[i].getName());
        }
    }


}
class  Man implements Comparable{
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Object o) {
        Man man=null;
        if(o instanceof Man)
            man = (Man) o;
        if(this.age-man.age>0)
            return 1;
        else if(this.age- man.age<0)
            return-1;
        else
            return 0;
    }

    public Man(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
