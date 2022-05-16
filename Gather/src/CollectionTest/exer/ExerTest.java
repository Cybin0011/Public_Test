package CollectionTest.exer;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-10 16:00
 */
public class ExerTest {
    public static void main(String[] args) {
//        Collection<G_Employee> coll=new TreeSet<>(new Comparator<G_Employee>() {
//            @Override
//            public int compare(G_Employee o1, G_Employee o2) {
//               return o1.getBirthday().getMonth()*30+o1.getBirthday().getDay()-(o2.getBirthday().getMonth()*30+o2.getBirthday().getDay());
//            }
//        });
        Collection<G_Employee> coll=new TreeSet();
        G_Employee g_employee = new G_Employee("B", 19, new Mydate(2003, 1, 30));
        coll.add(new G_Employee("F",23,new Mydate(1999,2,6)));
        coll.add(new G_Employee("D",22,new Mydate(2000,3,6)));
        coll.add(new G_Employee("C",21,new Mydate(2001,2,8)));
        coll.add(new G_Employee("A",20,new Mydate(2002,2,1)));
        coll.add(g_employee);
        Iterator iterator=coll.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("第二次遍历");
        coll.remove(g_employee);
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
