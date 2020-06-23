package com.nwq.dao;


import com.nwq.entity.Menu;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public class MenuDao extends BaseDao {
    public List<Menu>listAll(){
        String sql="select * from menu";
        return template.query(sql,new BeanPropertyRowMapper<Menu>(Menu.class));
    }
}
