package com.nwq.utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBUtil {
    private static DruidDataSource druidDataSource;

    static {
        Properties p=new Properties();
        InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");

        try {
            p.load(is);
            druidDataSource=new DruidDataSource();
            druidDataSource.setName(p.getProperty("jdbc.username"));
            druidDataSource.setPassword(p.getProperty("jdbc.password"));
            druidDataSource.setUrl("jdbc.url");
            druidDataSource.setDriverClassName("jdbc.driverClassName");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static DruidDataSource getDruidDataSource(){
        return druidDataSource;
    }

}
