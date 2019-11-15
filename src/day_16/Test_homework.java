package day_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:Test_homework
 * Package:day_16
 * Description:
 *
 * @date:2019/11/8 9:50
 * @author:Wang Jun
 */
public class Test_homework {
    public static void main(String[] args) throws ParseException {
//        System.out.println("请输入生日：yyyy-MM-dd");
//        String birthday = new Scanner(System.in).next();
//        function1(birthday);
        System.out.print("请输入年份：");
        int year = new Scanner(System.in).nextInt();
        System.out.println(function2(year));
    }

    public static void function1(String birthday) throws ParseException {
        Date date2 = new Date();
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simp.parse(birthday);
        long ms = date2.getTime() - date1.getTime();
        System.out.println(ms/1000/60/60/24);

    }

    public static boolean function2(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,2,1);
        cal.add(Calendar.DATE,-1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        if (cal.get(Calendar.DAY_OF_MONTH)==29)
            return true;
        else
            return false;
    }
}
