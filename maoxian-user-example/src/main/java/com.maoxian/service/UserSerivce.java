package com.maoxian.service;

import com.maoxian.common.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张丰亨
 * @date 2021/12/7 14:57
 */
@Service("userSerivce")
public interface UserSerivce {
  void setUser(String... args);
  void addUser(User user);
  void delUser(String id);
  List<User> findUser();
  User findUser(String id);
}
