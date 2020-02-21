package day_26;

/**
 * @program: Java_Test
 * @description: 多线程
 * @author: Wang Jun
 * @create: 2020-02-14 13:51
 */
public class Demo {
    public static void main(String[] args) {
       SubRunnable subRunnable = new SubRunnable();
       Thread thread = new Thread(subRunnable);
       thread.start();
       for (int i = 0;i<5;++i)
           System.out.println("main:"+i);
    }

}
