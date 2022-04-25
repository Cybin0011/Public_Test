package java2;

/**
 * @author Chen Yuanbin
 * @description 用runna
 * @create 2022-04-25 10:17
 */
public class Runnable_Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("main:");

        ThreadbyRunnable threadbyRunnable=new ThreadbyRunnable();
        new Thread(threadbyRunnable).start();
        new Thread(threadbyRunnable).start();
        System.out.println(Thread.currentThread().getName() + ":");


    }
}
