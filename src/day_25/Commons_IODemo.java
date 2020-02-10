package day_25;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @program: Java_Test
 * @description: commons包
 * @author: Wang Jun
 * @create: 2020-02-10 12:26
 */
public class Commons_IODemo {
    public static void main(String[] args) throws IOException {
        function_1();
        function_2();
        function_3();
        function_4();
        function_5();
    }

    public static void function_1(){
        String string = FilenameUtils.getName("c:\\1.java");
        System.out.println(string);
    }

    public static void function_2(){
        boolean b = FilenameUtils.isExtension("1.java","java");
        System.out.println(b);
    }

    public static void function_3() throws IOException {
        String string = FileUtils.readFileToString(new File(".\\src\\day_25\\person.txt"));
        System.out.println(string);
    }

    public static void function_4() throws IOException {
        FileUtils.writeStringToFile(new File(".\\src\\day_25\\writeStringToFile.txt"),"随便写点什么");
    }

    public static void function_5() throws IOException{
        FileUtils.copyFile(new File(".\\src\\day_25\\flush.txt"),new File(".\\src\\day_25\\flushcopy.txt"));
    }
}
