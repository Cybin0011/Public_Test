package exer1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Chen Yuanbin
 * @description 银行有一 个账户。
 * 有两个储户分别向同一个账户存 3000 元， 每次存 1000 存 3 次 。每次存完打印账户余额。
 * @create 2022-04-26 14:33
 */
class Account {
    private double money;

    public Account(double money) {
        this.money = money;
    }

    public void Deposite(double amt)
    {
        money+=amt;
        System.out.println(Thread.currentThread().getName()+":成功存款" + amt + ",当前余额：" + money);
    }
}
class Custommer implements Runnable{
    Account account;
    private ReentrantLock lock=new ReentrantLock();
    public Custommer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            try {
                lock.lock();
                account.Deposite(1000);
            }finally {
                lock.unlock();
            }

        }
    }
}
public class DepositeTest {
    public static void main(String[] args) {
        Account account=new Account(0);
        Custommer custommer=new Custommer(account);
        Thread thread1=new Thread(custommer);
        thread1.setName("用户1");
        Thread thread2=new Thread(custommer);
        thread2.setName("用户2");
        thread1.start();
        thread2.start();
    }
}
