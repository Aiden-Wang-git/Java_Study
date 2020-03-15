package day_29;

import java.sql.*;
import java.util.Scanner;

/**
 * @program: Java_Test
 * @description: JDBC
 * @author: Wang Jun
 * @create: 2020-03-10 21:34
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入用户名和密码：");
        String username = scanner.nextLine();
        String userpass = scanner.nextLine();
        String sql = "select * from users where username =? and userpass =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1,username);
        statement.setObject(2,userpass);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("username")+"  "+resultSet.getString("userpass"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
