package day_30;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-15 18:51
 */
public class JDBCUtils {
    private static BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setInitialSize(10);//初始化连接数
        dataSource.setMaxActive(8);//最大连接数
        dataSource.setMaxIdle(5);//最大空闲数
        dataSource.setMinIdle(1);//最小空闲数
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
