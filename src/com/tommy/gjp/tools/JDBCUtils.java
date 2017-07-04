package com.tommy.gjp.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * Created by humingtao on 2017/7/4.
 */
public class JDBCUtils {
    public static BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/gjp");
        dataSource.setUsername("root");
        dataSource.setPassword("12356");
        dataSource.setMaxActive(10);
        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(2);
        dataSource.setInitialSize(10);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
