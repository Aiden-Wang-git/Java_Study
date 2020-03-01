package day_27;

/**
 * @program: Java_Test
 * @description: 死锁
 * @author: Wang Jun
 * @create: 2020-03-01 10:10
 */
public class DeadLock implements Runnable{
    private int i = 0;
    @Override
    public void run() {
        while (true){
            if (i%2==0){
                synchronized (LockA.lockA){
                    System.out.println("进入A锁");
                    synchronized (LockB.lockB){
                        System.out.println("进入B锁");
                    }
                }
            }
            else {
                synchronized (LockB.lockB){
                    System.out.println("进入B锁");
                    synchronized (LockA.lockA){
                        System.out.println("进入A锁");
                    }
                }
            }
            ++i;
        }
    }
}
