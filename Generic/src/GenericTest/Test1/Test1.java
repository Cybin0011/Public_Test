package GenericTest.Test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-13 10:56
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 test1=new Test1();
        List <String>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1.add("AA");
        list1.add("BB");
        list1.add("CC");
        list1.add("DD");
        list2.add(1);
        list2.add(2);
        list2.add(3);

        test1.show(list1);
        test1.show(list2);

    }
    public <T>void show(List<T> list ){
        Iterator<T> iterator= list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
class Person<E,T>{}
    class  Student<I,String> extends  Person{}


}
