package day_22;

import java.io.*;
import java.util.HashMap;

/**
 * ClassName:Test
 * Package:day_22
 * Description:
 *
 * @date:2019/11/27 18:15
 * @author:Wang Jun
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\28586\\Desktop\\Java_study\\shooping\\src\\day_22\\点位数据.txt");//获取文件位置
        File file1 = new File("C:\\Users\\28586\\Desktop\\Java_study\\shooping\\src\\day_22\\结果.txt");//结果文件位置
        System.out.println(file.exists());//判断文件是否存在
        Point[] points = Functions.read(file);//读入点到内存
        HashMap<String,Double> map =Functions.calculate(points);//计算距离
        Functions.paixu(map,file1);//排序写入数据

    }
}
