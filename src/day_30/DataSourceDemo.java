package day_30;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-15 18:26
 */
public class DataSourceDemo {
    public static void main(String[] args){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        try {
            Connection connection = dataSource.getConnection();
        }catch (Exception ex){
            System.out.println(ex);
            throw new RuntimeException("数据库连接失败！");
        }
    }
}
