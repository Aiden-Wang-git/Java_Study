package day_22;

import java.io.File;

/**
 * ClassName:FileDemo
 * Package:day_22
 * Description:
 *
 * @date:2019/11/22 15:28
 * @author:Wang Jun
 */
public class FileDemo {
    public static void main(String[] args) {
        function1();
    }

    public static void function1() {
        File file = new File(".\\test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        File file1 = new File("C:\\Users\\28586\\Desktop\\Java_study");
        System.out.println(file.exists());
        System.out.println(file1.isDirectory());
        File file2 = new File("F:\\百度云下载");
        String []string = file2.list();
        System.out.println(string.length);
        for (String str:string)
            System.out.println(str);
        File []files = file2.listFiles();
        for (File file3 : files)
            System.out.println(file3);
        System.out.println("=============================");
        File [] files1 = file2.listFiles(new Myfliter());
        for (File file3:files1){
            System.out.println(file3);
        }
        System.out.println("=========================");
        searchAll(file2);
    }

    public static void searchAll(File file){
        File[] files = file.listFiles();
        for (File file1:files){
            if (file1.isDirectory())
                searchAll(file1);
            else System.out.println(file1);
        }
    }
}
