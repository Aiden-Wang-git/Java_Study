package day_17;

import java.util.Date;

/**
 * ClassName:IntegerDemo
 * Package:day_17
 * Description:
 *
 * @date:2019/11/8 11:13
 * @author:Wang Jun
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        long start = System.currentTimeMillis();
        Integer i = 3;
        String str = 3+"";
        System.out.println(str+1);
        String s1 = Integer.toString(7);
        System.out.println(s1+3);
        function1();
        function2();
        Integer a = 500;
        Integer b = 500;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        for (long j=0;j<100000000;++j){
        }
        Date date2 = new Date();
        long stop = System.currentTimeMillis();
        System.out.println(date2.getTime());
        System.out.println(stop);
        System.out.println(date1.getTime());
        System.out.println(start);
        System.out.println(date2.getTime()-date1.getTime());
        System.out.println(stop-start);
        function3();
    }

    public static void function1(){
        Integer in = new Integer("100");
        System.out.println(in.intValue());
    }

    public static void function2(){
        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(99));
    }

    public static void function3(){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {11,22,33,44};
        System.arraycopy(arr1,1,arr2,1,2);
        for (int i :arr2)
            System.out.println(i);
    }
}
