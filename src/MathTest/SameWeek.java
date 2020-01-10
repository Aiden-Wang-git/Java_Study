package MathTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:SameWeek
 * Package:MathTest
 * Description:
 *
 * @date:2020/1/7 15:50
 * @author:Wang Jun
 */
public class SameWeek {
    private static SimpleDateFormat sdf;
    static {
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    public static void main(String[] args) {
        System.out.println(atSameWeek(1604632804000L,1578194404000L));
    }

    public static boolean atSameWeek(Long time1, Long time2){
        //区分时间先后，time1要在time2之前
        if (time1>time2){
            Long time = time1;
            time1 =time2;
            time2 = time;
        }
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setFirstDayOfWeek(Calendar.MONDAY);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setFirstDayOfWeek(Calendar.MONDAY);
        calendar1.setTimeInMillis(time1);
        calendar2.setTimeInMillis(time2);
        System.out.println(calendar1);
        System.out.println(calendar2);
        System.out.println(calendar1.getTime());
        System.out.println(calendar2.getTime());
        //星期几是从2开始算起的,星期日为1
        if (time2-time1<1000*60*60*24*7){
            for (int i = 2;i<8;++i){
                if (calendar1.get(Calendar.DAY_OF_WEEK) == i && (calendar2.get(Calendar.DAY_OF_WEEK)>i || calendar2.get(Calendar.DAY_OF_WEEK)==1))
                    return true;
                if (time2-time1<1000*60*60*24 && calendar1.get(Calendar.DAY_OF_WEEK)==calendar2.get(Calendar.DAY_OF_WEEK))
                    return true;
            }
        }
        return false;
    }



}
