package day_26;

/**
 * @program: Java_Test
 * @description: 实现多线程
 * @author: Wang Jun
 * @create: 2020-02-14 14:09
 */
public class SbuThread extends Thread {

    @Override
    public void run() {
        for (int i = 0;i<50;++i)
            System.out.println("run:"+i);
    }
}
