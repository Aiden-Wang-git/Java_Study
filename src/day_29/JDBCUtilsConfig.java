package day_29;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-15 09:27
 */
public class JDBCUtilsConfig {
    private static Connection connection;
    static {
        try {
            InputStream inputStream = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            Class.forName(properties.getProperty("driverClass"));
            connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
        }catch (Exception ex){
            throw new RuntimeException("数据库连接失败");
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
