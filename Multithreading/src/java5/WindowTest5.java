package java5;

import java2.ThreadbyRunnable;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张
 * @create 2022-04-24 17:05
 */
class Window5 extends Thread {

    public static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }

}
public  class WindowTest5 {
    public static void main(String[] args) {
        Window5 thread1 = new Window5();
        Window5 thread2 = new Window5();
        Window5 thread3 = new Window5();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


