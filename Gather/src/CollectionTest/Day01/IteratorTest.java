package CollectionTest.Day01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-09 10:41
 */
public class IteratorTest {
    public static void main(String[] args) {
        System.out.println();
        Collection coll=new ArrayList(10);
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(1);
        coll.add(1);
        for (Object a:coll
             ) {
            System.out.println(a);
        }
    }
}
