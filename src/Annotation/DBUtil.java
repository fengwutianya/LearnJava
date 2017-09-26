package Annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by xuan on 2017/8/17 0017.
 */
@JDBCConfig(ip = "127.0.0.1", database = "yc", loginName = "root", password = "12301230s")
public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        JDBCConfig config = DBUtil.class.getAnnotation(JDBCConfig.class);   //反射获取注解对象

        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        Connection conn = DriverManager.getConnection(url, loginName, password);
        System.out.println(conn);
    }
}
