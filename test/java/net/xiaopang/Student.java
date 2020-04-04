package net.xiaopang;

import org.junit.Test;

import java.sql.*;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-04 21:56
 **/
public class Student {

    /**
     * 使用JDBC连接并操作mysql数据库
     */
    @Test
    public  void main() {
        // 数据库驱动类名的字符串
        String driver = "com.mysql.jdbc.Driver";
        // 数据库连接串
        String url = "jdbc:mysql://127.0.0.1:3306/cms";
        // 用户名
        String username = "root";
        // 密码
        String password = "root";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1、加载数据库驱动（ 成功加载后，会将Driver类的实例注册到DriverManager类中）
            Class.forName(driver );
            // 2、获取数据库连接  加载JDBC驱动程序。 提供JDBC连接的URL 创建一个数据库连接
            conn = DriverManager.getConnection(url, username, password);
            // 3、创建一个数据库操作对象
            stmt = conn.createStatement();
            // 4、定义操作的SQL语句
            String sql = "select * from sys_dept ";
            // 5、执行数据库操作
            rs = stmt.executeQuery(sql);
            // 6、获取并操作结果集
            while (rs.next()) {
                System.out.println(rs.getInt("dept_id"));
                System.out.println(rs.getString("dept_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7、关闭对象，回收数据库资源 闭JDBC对象。
            if (rs != null) { //关闭结果集对象
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) { // 关闭数据库操作对象
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) { // 关闭数据库连接对象
                try {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }




    @Test
    public void select(){

    }

}



