package day_29;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java_Test
 * @description: JDBC
 * @author: Wang Jun
 * @create: 2020-03-10 12:12
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws Exception{
//        Class.forName("com.mysql.jdbc.Driver");
//////        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
//////        Statement statement = connection.createStatement();
//////        ResultSet resultSet = statement.executeQuery("select * from sort;");
//////        System.out.println(resultSet);
//////        while (resultSet.next()){
//////            System.out.println(resultSet.getInt("sid")+"  "+resultSet.getString("sname")+"  "+resultSet.getDouble("sprice")+"  "+resultSet.getString("sdesc"));
//////        }
//////        resultSet.close();
//////        statement.close();
//////        statement.close();
//        demo1();
//        demo2();
//        demo3();
        demo4();
    }

    public static void demo1() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
        String sql="UPDATE sort SET sname=?, sprice=?, sdesc=? WHERE sid=?;";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setObject(1,"家电9");
        pst.setObject(2,900);
        pst.setObject(3,"描述9");
        pst.setObject(4,9);
        int number = pst.executeUpdate();
        pst.close();
        connection.close();
        System.out.println(number);
    }

    public static void demo2() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123456");
        String sql = "select  * from sort;";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("sid")+"  "+resultSet.getString("sname")+"  "+resultSet.getString("sprice")+"  "+resultSet.getString("sdesc"));
        }
        resultSet.close();
        pst.close();
        connection.close();
    }

    public static void demo3() throws Exception{
        Connection connection = JDBCUtils.getConnection();
        String sql = "select  sname from sort;";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("sname"));
        }
        JDBCUtils.close(resultSet,pst,connection);
    }

    public static void demo4() throws Exception{
        Connection connection = JDBCUtils.getConnection();
        String sql = "select * from sort;";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        List<Sort> list = new ArrayList<>();
        while (resultSet.next()){
            Sort sort = new Sort(resultSet.getInt("sid"),resultSet.getString("sname"),resultSet.getDouble("sprice"),resultSet.getString("sdesc"));
            list.add(sort);
        }
        JDBCUtils.close(resultSet,pst,connection);
        for (Sort sort:list)
            System.out.println(sort);
    }
}
