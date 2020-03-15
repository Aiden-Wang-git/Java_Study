package day_29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @program: Java_Test
 * @description: JDBC工具类
 * @author: Wang Jun
 * @create: 2020-03-11 18:53
 */
public class JDBCUtils {
    private JDBCUtils(){}
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
        }catch (Exception ex){
            throw new RuntimeException(ex+"数据库连接失败！");
        }

    }

    public static Connection getConnection() {
        return connection;
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection){
        if (resultSet!=null)try {
            resultSet.close();
        }catch (Exception ex){}

        if (statement!=null)try {
            statement.close();
        }catch (Exception ex){}

        if (connection!=null)try {
            connection.close();
        }catch (Exception ex){}
    }

    public static void close(Statement statement, Connection connection){
        if (statement!=null)try {
            statement.close();
        }catch (Exception ex){}

        if (connection!=null)try {
            connection.close();
        }catch (Exception ex){}
    }
}
