package java4;

import java2.ThreadbyRunnable;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张
 * @create 2022-04-24 17:05
 */
class Window extends Thread {
    static Object object=new Object();
    public static int ticket=100;
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                }
                else
                    break;
            }
        }

    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window thread1=new Window();
        Window thread2=new Window();
        Window thread3=new Window();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
