package java4;

import java2.ThreadbyRunnable;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张
 * @create 2022-04-24 17:05
 */
class Window4 extends Thread {
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

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 thread1=new Window4();
        Window4 thread2=new Window4();
        Window4 thread3=new Window4();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
