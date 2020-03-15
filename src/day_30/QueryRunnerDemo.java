package day_30;

import day_29.JDBCUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-15 09:52
 */
public class QueryRunnerDemo {
    public static void main(String[] args) throws SQLException{
//        insert();
//        update();
        delete();
    }
    public static Connection connection = JDBCUtils.getConnection();
    public static QueryRunner queryRunner = new QueryRunner();
    public static void insert() throws SQLException {
        String sql = "INSERT INTO sort (sname,sprice,sdesc) VALUES (?,?,?)";
        int row = queryRunner.update(connection,sql,"ipad",1500,"二手平板电脑");
        DbUtils.closeQuietly(connection);
        System.out.println(row);
    }
    public static void update()throws SQLException{
        String sql = "UPDATE sort SET sdesc = ? WHERE sid = 10";
        int row = queryRunner.update(connection,sql,"咸鱼二手");
        DbUtils.closeQuietly(connection);
        System.out.println(row);
    }
    public static void delete() throws SQLException{
        String sql = "DELETE FROM sort WHERE sid = ?";
        int row = queryRunner.update(connection,sql,10);
        DbUtils.closeQuietly(connection);
        System.out.println(row);
    }
}
