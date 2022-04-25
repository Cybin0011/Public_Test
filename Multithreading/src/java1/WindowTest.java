package java1;

/**
 * @author Chen Yuanbin
 * @description 创建3个窗口卖票, 100张
 * @create 2022-04-24 17:05
 */
class Window implements Runnable {

    public  int ticket=100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            }
            else
                break;

        }

    }
}

public class WindowTest {
    public static void main(String[] args) {
        Integer totalTicket=100;

        Window w1 = new Window();

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
