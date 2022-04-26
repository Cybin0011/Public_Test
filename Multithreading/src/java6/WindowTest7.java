package java6;

/**
 * @author Chen Yuanbin
 * @description 同步方法保证线程安全的Runnable实现的线程
 * @create 2022-04-24 17:05
 */
class Window7 implements Runnable {
    Object obj=new Object();

    public  int ticket=100;
    @Override
    public void run() {
        while (true) {
            show();
            if(ticket<=0)
                break;
        }
    }
    private synchronized void show (){
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest7 {
    public static void main(String[] args) {
        Window7 w1 = new Window7();
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
