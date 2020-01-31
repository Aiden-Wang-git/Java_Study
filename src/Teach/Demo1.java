package Teach;

import javax.sound.midi.Soundbank;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: Java_Test
 * @description: 乘法口诀表
 * @author: Wang Jun
 * @create: 2020-01-24 09:55
 */
public class Demo1 {
    public static void main(String[] args) {
//        chenfa();
//        shuixianhua();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请您输入一个整数：");
//        int year = scanner.nextInt();
//        if (runnian(year))
//            System.out.println(year+"是闰年");
//        else
//            System.out.println(year+"不是闰年");
//        type();
        Date date1 = new Date();
        sushu();
        Date date2 = new Date();
        System.out.println(date2.getTime()-date1.getTime());
    }

    public static void chenfa(){
        for (int i = 1;i<10;++i){
            for (int j =1;j<i+1;++j){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }

    public static void shuixianhua(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请您输入一个100——999之间的整数");
//        int num = scanner.nextInt();
        int num;
        int ge;
        int shi;
        int bai;
        for (num =100;num<1000;++num){
            bai = num/100;
            shi = (num - bai*100)/10;
            ge = num - bai*100-shi*10;
            if (num == Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)) {
//                System.out.println("百位数："+bai+"  十位数："+shi+"  个位数："+ge);
                System.out.println(num+"是水仙花数");
            }
//            else System.out.println(num+"不是水仙花数");
        }
    }

    public static boolean runnian(int year){
        if (year%4==0 && year%100!=0)
            return true;
        if (year%400==0)
            return true;
        return false;
    }

    public static void type(){
        for (int i=10;i<=10000;++i){
            if (i%2==0)
                System.out.println(i+"能被2整除！");
            else if(i%3==0)
                System.out.println(i+"能被3整除！");
            else if (i%5==0)
                System.out.println(i+"能被5整除");
            else if (i%7==0)
                System.out.println(i+"能被7整除！");
            else System.out.println("抱歉，您输入的数字"+i+"错误！");
        }
    }

    public static void sushu(){
        for (int i=3;i<10001;++i){
            for (int j=2;j<Math.pow(i,0.5);++j){
                if (i%j==0){
                    System.out.println(i+"不是素数！");
                    break;
                }
                if (j==(i-1))
                    System.out.println(i+"是素数！");
            }
        }
    }
}
