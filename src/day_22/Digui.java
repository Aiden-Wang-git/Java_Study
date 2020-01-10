package day_22;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName:Digui
 * Package:day_22
 * Description:
 *
 * @date:2020/1/7 14:17
 * @author:Wang Jun
 */
public class Digui {
    public static void main(String[] args) {
//        System.out.println(rabbit(12));
        findjava(new File(".\\"));
    }

    public static int rabbit(int month){
        if (month == 1)
            return 1;
        else if (month == 2)
            return 1;
        else return rabbit(month-1) + rabbit(month-2);
    }

    public static void findjava(File file){
        File[] files = file.listFiles();
        for (File file1 :files){
            if (file1.isDirectory())
                findjava(file1);
            else if (file1.getName().endsWith(".java"))
                System.out.println(file1);
        }
    }
}
