package MathTest;

/**
 * ClassName:qiugeng
 * Package:MathTest
 * Description:
 *
 * @date:2019/12/20 14:20
 * @author:Wang Jun
 */
public class qiugeng {
    public static void main(String[] args) {
//        double x = 1;
//        double y;
//        double y1;
//        for (int i = 0; i <= 100; ++i) {
//            y = Math.pow(x, 3) + 1.1*Math.pow(x,2)+0.9 * x -1.4;
//            y1 = 3*Math.pow(x,2)+2.2*x+0.9;
//            System.out.println("X:" + x + ",Y:" + y);
//            x = x - y/y1;
//        }
        function1();
    }

    public static void function1(){
        double x =-1;
        double y;
        double y1;
        for (int i = 0 ;i<100;++i){
            y = Math.pow(x,5)+5*x+1;
            y1 = 5*Math.pow(x,4)+5;
            System.out.println("x:"+x+",y:"+y);
            x = x - y/y1;
        }
    }

}
