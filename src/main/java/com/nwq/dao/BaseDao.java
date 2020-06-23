package com.nwq.dao;

import com.nwq.utils.DBUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
    public JdbcTemplate template=new JdbcTemplate(DBUtil.getDruidDataSource());
}
