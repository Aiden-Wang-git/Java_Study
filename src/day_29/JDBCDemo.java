package day_29;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: Java_Test
 * @description: JDBC
 * @author: Wang Jun
 * @create: 2020-03-10 11:00
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
        System.out.println(connection);
        Statement statement = connection.createStatement();
        System.out.println(statement);
        int number = statement.executeUpdate("INSERT INTO sort(sname,sprice,sdesc) VALUES('家电8',800,'描述8')");
        System.out.println(number);
        statement.close();
        connection.close();
    }
}
