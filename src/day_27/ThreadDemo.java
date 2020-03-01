package day_27;

/**
 * @program: Java_Test
 * @description: 多线程同时并发访问一个资源
 * @author: Wang Jun
 * @create: 2020-02-27 20:26
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        Tickets tickets = new Tickets();
//        Thread t0 = new Thread(tickets);
//        Thread t1 = new Thread(tickets);
//        Thread t2 = new Thread(tickets);
//        t0.start();
//        t1.start();
//        t2.start();
        DeadLock deadLock = new DeadLock();
        Thread thread1 = new Thread(deadLock);
        Thread thread2 = new Thread(deadLock);
        thread1.start();
        thread2.start();
    }
}
