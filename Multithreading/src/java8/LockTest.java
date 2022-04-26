package java8;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张
 * @create 2022-04-24 17:05
 */
class window8 implements Runnable {

    public  int ticket=100;
    private ReentrantLock lock=new ReentrantLock();
    
    @Override
    public void run() {
        try{
            lock.lock();
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            }
            else {
                break;
            }
        }
        }
        finally {
            lock.unlock();
        }

    }
}

public class LockTest {
    public static void main(String[] args) {
        Integer totalTicket=100;

        window8 w1 = new window8();

        Thread thread1=new Thread(w1);
        thread1.setName("窗口1");
        Thread thread2=new Thread(w1);
        thread2.setName("窗口2");
        Thread thread3=new Thread(w1);
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
