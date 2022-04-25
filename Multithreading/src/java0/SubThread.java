package java0;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-04-24 14:38
 */
public class SubThread extends Thread{
    @Override
    public void run() {
       for(int i=0;i<10;i++)
       {
           if(i%2==0)
               System.out.println(i);
       }
    }

}
