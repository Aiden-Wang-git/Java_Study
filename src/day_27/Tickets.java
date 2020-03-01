package day_27;

/**
 * @program: Java_Test
 * @description: 电影票
 * @author: Wang Jun
 * @create: 2020-02-27 20:27
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 为了解决安全问题，Java程序提供了同步技术
 * 公式：
 *  synchronized(任意对象){
 *      需要操作的共享数据
 *  }
 *  同步代码块
 */
public class Tickets implements Runnable {
    private int ticket = 100;
    private Lock lock = new ReentrantLock();
//    private Object object = new Object();//这个对象起到了同步锁的作用,如果是写同步方法，那么这个对象就不需要了
    @Override
    public void run() {
        while (true)
            payTicket();
    }

    public void payTicket(){
        lock.lock();
        if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket-- + "张电影票");
                } catch (Exception e) {
                }
                finally {
                    lock.unlock();
                }
        }
    }
}
