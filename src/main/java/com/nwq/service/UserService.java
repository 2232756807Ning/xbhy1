package com.nwq.service;

import com.nwq.dao.UserDao;
import com.nwq.entity.User;

import java.util.Date;
import java.util.List;

public class UserService  {
    private UserDao userDao=new UserDao();
    public List<User> listAll(String username,Integer page){
        return userDao.listAll(username,page);
    }
    public void addUser(User user){
        user.setId(null);
        user.setRegisterTime(new Date());
        userDao.addUser(user);
    }
    //验证用户名是否存在
    public boolean getUserByUserName(String userName){
        User user=new User();
        if (user==null){
            return true;
        }
        //账号已存在
        return false;
    }

    public Integer getCount(){
        return userDao.getCount();
    }
    public User getUserById(Integer id){
        return userDao.getUserById(id);
    }
    public void delete(Integer id){
        userDao.delete(id);
    }
}
