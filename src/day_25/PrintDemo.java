package day_25;

import java.io.*;

/**
 * @program: Java_Test
 * @description: 打印流
 * @author: Wang Jun
 * @create: 2020-02-10 11:19
 */
public class PrintDemo {
    public static void main(String[] args) throws IOException{
//        function_1();
//        function_2();
        function_3();
    }

    public static void function_1() throws FileNotFoundException {
        File file = new File(".\\src\\day_25\\print.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(123);
        printWriter.flush();
        printWriter.close();
    }

    public static void function_2() throws FileNotFoundException{
        OutputStream os = new FileOutputStream(".\\src\\day_25\\flush.txt");
        PrintWriter printWriter = new PrintWriter(os,true);
        printWriter.println("自动");
        printWriter.println("刷新");
        printWriter.close();
    }

    public static void function_3() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\src\\day_25\\flush.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter(".\\src\\day_25\\printCopy.txt"),true);
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
            printWriter.println(line);
        }
        printWriter.close();
        bufferedReader.close();
    }
}
