package day_25;

import Teach.Demo1;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @program: Java_Test
 * @description: Properties学习
 * @author: Wang Jun
 * @create: 2020-02-09 13:23
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException{
        demo1();
//        demo2();
    }

    public static void demo1() throws IOException{
        Properties properties = new Properties();
        properties.setProperty("1","a");
        properties.setProperty("2","b");
        properties.setProperty("3","c");
        Writer writer = new FileWriter(".\\src\\day_25\\pro.properties");
        properties.store(writer,"test");
        writer.close();
        Set<String> set = properties.stringPropertyNames();
        for (String string:set)
            System.out.println(string+"->"+properties.getProperty(string));
    }

    public static void demo2() throws IOException {
        Properties properties = new Properties();
        Reader reader = new FileReader(".\\src\\day_25\\pro.properties");
        properties.load(reader);
        reader.close();
        System.out.println(properties);
    }
}
