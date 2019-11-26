package day_21;

/**
 * ClassName:FuShuExceptionDemo
 * Package:day_21
 * Description:
 *
 * @date:2019/11/22 14:13
 * @author:Wang Jun
 */
public class FuShuExceptionDemo {
    public static void main(String[] args) {
        System.out.println(function(20,30,-40,50));
    }

    public static double function(int...a){
        int sum = 0;
        for (int b : a){
            if (b<0)
                throw new FuShuException("错误数据："+b);
            sum+=b;
        }
        return sum/a.length;
    }
}
