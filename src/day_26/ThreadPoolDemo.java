package day_26;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @program: Java_Test
 * @description: 线程池
 * @author: Wang Jun
 * @create: 2020-02-21 16:54
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println(es);
        Future<Integer> f1 = es.submit(new GetSumCallable(100));
        Future<Integer> f2 = es.submit(new GetSumCallable(200));
        System.out.println(f1.get()+".."+f2.get());
    }
}
