package com.maoxian.service.impl;

import com.maoxian.common.User;
import com.maoxian.mapper.UserMapper;
import com.maoxian.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 张丰亨
 * @date 2021/12/7 14:59
 */
public class UserServiceImpl implements UserSerivce {
  @Autowired
  private UserMapper userMapper;
  public void setUser(String... args) {
    userMapper.setUser(args);
  }

  public void addUser(User user) {
    userMapper.addUser(user);
  }

  public void delUser(String id) {
    userMapper.delUser(id);
  }

  public List<User> findUser() {

    return userMapper.findUser();
  }

  public User findUser(String id) {
    return userMapper.findUser(id);
  }
}
