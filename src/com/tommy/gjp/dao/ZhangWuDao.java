package com.tommy.gjp.dao;

import com.tommy.gjp.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;

/**
 * Created by humingtao on 2017/7/4.
 * 数据库的-CRUD
 */
public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
}
