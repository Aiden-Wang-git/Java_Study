package day_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:Data_test
 * Package:day_16
 * Description:
 *
 * @date:2019/11/8 8:52
 * @author:Wang Jun
 */
public class Data_test {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        String string = simple.format(date);
        System.out.println(string);
        Date date1 = simple.parse(string);
        System.out.println(date1);
        function1();
    }

    public static void function1(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2022);
        c.add(Calendar.DAY_OF_MONTH,30);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) +1 ;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
