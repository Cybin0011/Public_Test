package java2;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-04-25 10:17
 */
public class ThreadbyRunnable implements Runnable{

    @Override
    public void run() {

        for(int i=0;i<10;i++)
        {
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
