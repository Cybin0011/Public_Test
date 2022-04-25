package java3;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张,
 * 问题：卖票出现重票，错票；
 * 原因：当某个线程在操作数据时，还没结束，另一个线程参与进来，也来操作数据。
 * 如何解决：当一个线程在操作ticket时，其它线程不可参与，直到它完成操作，期间即便出现阻塞也不影响（把cpu指定分配）
 * Java通过同步机制，来解决线程安全问题
 *      方式一：同步代码块(用这个方法一定要注意检查是否都用同一个锁！)
 *          synchronized(同步监视器（俗称：锁）){
 *           //需要被同步的代码（操作共享数据的代码，即为需要被同步的代码）
 *           }
 *           释：
 *              需要被同步的代码：操作共享数据的代码，即为需要被同步的代码。
 *              同步监视器：（俗称：锁）任何一个对象都可充当锁。要求：多个线程必须共用同把锁
 *            特点：能解决线程安全问题
 *                 在同步代码块处，只能有一个线程参与，相当于单线程。
 *      方式二:
 *
 * @create 2022-04-24 17:05
 */
class Window3 implements Runnable {
    Object obj=new Object();

    public  int ticket=100;
    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
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

public class WindowTest33 {
    public static void main(String[] args) {
        Integer totalTicket=100;

        Window3 w1 = new Window3();

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
