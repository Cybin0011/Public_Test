package java7;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-04-26 10:13
 */
class  Bank{
   private Bank(){

   }
   private static Bank instance=null;
   public static Bank getInstance(){
       if(instance==null)
           instance=new Bank();
       return instance;
   }
}
public class BankTest {
}
