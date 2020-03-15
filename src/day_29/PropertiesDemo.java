package day_29;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-11 20:04
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        InputStream ins = PropertiesDemo.class.getClassLoader().getResourceAsStream("database.Properties");
//        FileInputStream fis = new FileInputStream(".\\src\\database.PropertiesDemo");
        System.out.println(ins);
        Properties pro = new Properties();
        pro.load(ins);
        String driverClass = pro.getProperty("driverClass");
        System.out.println(driverClass);
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println(connection);
    }
}
