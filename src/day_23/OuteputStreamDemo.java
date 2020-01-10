package day_23;

import java.io.*;

/**
 * ClassName:OuteputStreamDemo
 * Package:day_23
 * Description:
 *
 * @date:2020/1/7 14:52
 * @author:Wang Jun
 */
public class OuteputStreamDemo {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        demo3();
    }

    public static void demo1() throws IOException {
        OutputStream outputStream = new FileOutputStream(".\\src\\day_23\\test.txt", false);
        outputStream.write("字符串".getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write("换行".getBytes());
        outputStream.close();
    }

    public static void demo2() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(".\\src\\day_23\\a.txt", true);
            outputStream.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void demo3() throws IOException {
        InputStream inputStream = new FileInputStream(".\\src\\day_23\\test.txt");
        int flag = 0;
        while ((flag = inputStream.read()) != -1){
            System.out.print((char) flag);
        }
        inputStream.close();
    }
}
