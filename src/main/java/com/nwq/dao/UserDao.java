package com.nwq.dao;

import com.nwq.entity.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public class UserDao extends BaseDao {

    //查询listXXX findXXX getXXX query getUserById
    //添加 addXXX insertXXX addUser add
    //修改 update edit updateUser
    //删除 delete remove


    public List<User> listAll(String username,Integer page){
        String sql="select * from user ";
        return template.query(sql,new BeanPropertyRowMapper<>(User.class));
    }

    public void addUser(User user){
        String sql="insert into user (username,password,email,real_name,age,sex,description,register_time,dept_id)" +
                "values(?,?,?,?,?,?,?,?,?)";
        template.update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getRealName(),
                user.getAge(),user.getSex(),user.getDescription(),user.getRegisterTime(),user.getDeptId());

    }
    public User getUserByUserName(String userName){
        String sql="select * from user where username=?";
        try {
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),userName);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Integer getCount(){
        return 0;
    }
    public User getUserById(Integer id){
        String sql="select * from user where id=?";
        try {
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void delete(Integer id){
        String sql="delete from user where id=?";
        template.update(sql,id);
    }
}
