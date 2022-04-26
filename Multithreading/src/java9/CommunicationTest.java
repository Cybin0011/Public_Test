package java9;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-04-26 15:20
 */
class Number implements Runnable{
    private int i = 0;
    @Override
    public void run() {
        for (; i < 100; i++) {
            synchronized (this) {
                notify();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1=new Thread(number);
        Thread thread2=new Thread(number);
        thread1.start();
        thread2.start();
    }
}
