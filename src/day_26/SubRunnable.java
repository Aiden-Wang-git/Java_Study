package day_26;

/**
 * @program: Java_Test
 * @description: 实现Runnable接口
 * @author: Wang Jun
 * @create: 2020-02-16 13:13
 */
public class SubRunnable implements Runnable  {
    @Override
    public void run() {
        for (int i=0;i<5;++i)
            System.out.println("run:"+i);
    }
}
