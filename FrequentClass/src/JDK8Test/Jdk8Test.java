package JDK8Test;

import sun.security.jca.GetInstance;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-06 10:10
 */
public class Jdk8Test {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("***************查*****************");
        System.out.println("day fo year:"+dateTime.getDayOfYear()
                            +",day fo month:"+dateTime.getDayOfMonth()
                            +",day fo week:"+dateTime.getDayOfWeek()
                            +",year:"+dateTime.getYear()
                            +",month:"+dateTime.getMonth());
        System.out.println("***************改(不可变性)*****************");
        LocalDateTime dateTime1 = dateTime.withDayOfYear(100);
        System.out.println("day fo year:"+dateTime1.getDayOfYear()
                +",day fo month:"+dateTime1.getDayOfMonth()
                +",day fo week:"+dateTime1.getDayOfWeek()
                +",year:"+dateTime1.getYear()
                +",month:"+dateTime1.getMonth());
        LocalDateTime dateTime2 = dateTime1.plusDays(26);
        System.out.println("day fo year:"+dateTime2.getDayOfYear()
                +",day fo month:"+dateTime2.getDayOfMonth()
                +",day fo week:"+dateTime2.getDayOfWeek()
                +",year:"+dateTime2.getYear()
                +",month:"+dateTime2.getMonth());
        LocalDateTime dateTime3 = dateTime2.minusDays(26);
        System.out.println("day fo year:"+dateTime3.getDayOfYear()
                +",day fo month:"+dateTime3.getDayOfMonth()
                +",day fo week:"+dateTime3.getDayOfWeek()
                +",year:"+dateTime3.getYear()
                +",month:"+dateTime3.getMonth());

        System.out.println("***************Instant类*************");
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
