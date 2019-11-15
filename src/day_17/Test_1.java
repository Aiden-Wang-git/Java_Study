package day_17;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * ClassName:Test_1
 * Package:day_17
 * Description:
 *
 * @date:2019/11/10 13:34
 * @author:Wang Jun
 */
public class Test_1 {
    public static void main(String[] args) {
        int[] arr = {1,5,10,98,5,0,10,45};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int a : arr)
            System.out.print(a+"<");
        System.out.println();
        int index =Arrays.binarySearch(arr,45);
        System.out.println(index);
        int[] old = {10,50,40,50,45,45,24,8,24,43};
        System.out.println(Arrays.toString(function1(old)));
        function2();
        System.out.println(0.09+0.01);
    }

    public static int[] function1(int[] old){
        int[] result = new int[3];
        Arrays.sort(old);
        System.arraycopy(old,0,result,0,3);
        return result;
    }

    public static void function2(){
        BigInteger a = new BigInteger("465746435467346847176841646871464346");
        BigInteger b = new BigInteger("4654346868464684643465314344563467634");
        BigInteger c = a.add(b);
        System.out.println(c);
        System.out.println(a);
        BigInteger d = c.subtract(b);
        System.out.println(d);
        BigInteger e = a.multiply(b);
        System.out.println(e);
        BigInteger f = e.divide(b);
        System.out.println(f);
    }
}
