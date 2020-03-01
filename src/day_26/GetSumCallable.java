package day_26;

import java.util.concurrent.Callable;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-02-21 17:22
 */
public class GetSumCallable implements Callable<Integer>{
    private int a;
    public GetSumCallable(int a){
        this.a=a;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i=0;i<=a;++i)
            sum+=i;
        return sum;
    }
}
