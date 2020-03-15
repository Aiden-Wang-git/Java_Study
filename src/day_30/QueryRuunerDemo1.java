package day_30;

import day_29.JDBCUtils;
import day_29.Sort;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-15 15:45
 */
public class QueryRuunerDemo1 {
    public static QueryRunner queryRunner = new QueryRunner();
    public static Connection connection = JDBCUtils.getConnection();

    public static void main(String[] args) throws SQLException {
//        arraryHandelr();
        beanHandler();
    }

    public static void arraryHandelr() throws SQLException {
        String sql = "SELECT * FROM sort;";
        List<Object[]> result = queryRunner.query(connection, sql, new ArrayListHandler());
        DbUtils.closeQuietly(connection);
        for (Object[] object : result) {
            for (Object object1 : object)
                System.out.print(object1 + "\t");
            System.out.println();
        }
    }

    public static void beanHandler() throws SQLException {
        String sql = "SELECT * FROM sort;";
        List<Object> sorts = queryRunner.query(connection, sql, new ColumnListHandler<Object>(3));
        DbUtils.closeQuietly(connection);
        for (Object sort : sorts)
            System.out.println(sort);
    }

}
