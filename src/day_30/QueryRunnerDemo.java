package day_30;

import day_29.JDBCUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

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
//        delete();
//        add();
        search();
    }

    private static QueryRunner qu = new QueryRunner(day_30.JDBCUtils.getDataSource());

    public static void add(){
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?);";
        try {
            qu.update(sql,"macbook","10600","好贵呦");
        } catch (Exception ex){
            throw new RuntimeException(ex.toString());
        }
    }

    public static void search(){
        String sql = "SELECT * FROM sort;";
        try {
            List<Map<String,Object>> lists = qu.query(sql,new MapListHandler());
            for (Map<String,Object> list :lists){
                for (String key:list.keySet())
                    System.out.print(key+":"+list.get(key)+"\t");
                System.out.println();
            }
        }catch (Exception ex){
            throw new RuntimeException(ex.toString());
        }
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
