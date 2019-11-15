/**
 * ClassName:math
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2019/10/13 21:08
 * @author:2858600511@qq.com
 */
public class math {
    public static void main(String[] args) {
    double x = 0.5;
    for (int i =0;i<30;i++){
         x = Math.pow(Math.E,-x);
        System.out.println(i+":"+x);
    }
        System.out.println("----------------");
    x = 0.5;
    for (int i =0;i<30;++i){
        x = (x*x*Math.pow(Math.E,x)+1)/((1+x)*Math.pow(Math.E,x));
        System.out.println(i+":"+x);
    }
    }
}
