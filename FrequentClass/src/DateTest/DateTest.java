package DateTest;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-05 17:05
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("java.util.Date");
        System.out.println("*********************************************");
        Date date=new Date();//时期时间字符串
        System.out.println(date);
        Date mydate=new Date(25533333320064l);
        System.out.println(mydate);
        System.out.println("java.sql.Date");
        System.out.println("*********************************************");
        System.out.println("mydate——>sqldate");
        java.sql.Date sql_date=new java.sql.Date(mydate.getTime());
        System.out.println(sql_date);
        SimpleDateFormat sdmf=new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("格式化："+sdmf.format(mydate));
        Date Cybin_date=sdmf.parse("1999-02-06");
        System.out.println(Cybin_date.getTime()+520);

    }
}
