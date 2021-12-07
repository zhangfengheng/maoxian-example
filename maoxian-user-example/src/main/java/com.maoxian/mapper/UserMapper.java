package com.maoxian.mapper;

import com.maoxian.common.User;

import java.util.List;

/**
 * @author 张丰亨
 * @date 2021/12/7 14:43
 */
public interface UserMapper {
  void setUser(String... args);
  void addUser(User user);
  void delUser(String id);
  List<User> findUser();
  User findUser(String id);
}
