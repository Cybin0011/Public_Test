package java0;

/**
 * @author Chen Yuanbin
 * @description 多线程的创建方式一：基于继承的方式；
 * Step1.创建一个继承于Thread类的子类
 * Step2.重写Thread类中的run（）;-->这个线程要做的事写到run中
 * Step3.创建子类对象
 * Step4.通过子类对象调用Start（）方法；
 * * @create 2022-04-24 14:33
 */
public class ThreadTest {
    public static void main(String[] args) {
//        法一：
//        SubThread subThread = new SubThread();
//        subThread.start();//不包括start（），start之后才离开主线程
//        System.out.println("which first");//开始子线程后,主线程不受影响
//        法二：匿名子类的匿名对象(只用一次的线程)
        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 != 0)
                        System.out.println(i);
                }
            }
        }.start();

    }
}
