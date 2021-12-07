package com.maoxian.controller;


import com.maoxian.common.User;
import com.maoxian.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张丰亨
 * @date 2021/12/7 15:04
 */
@RestController("User")
public class UserController {
  @Autowired
  private UserSerivce userSerivce;
  @RequestMapping("addUser")
  @ResponseBody
  public void addUser(User user){
    userSerivce.addUser(user);
  }
  @RequestMapping("setUser")
  @ResponseBody
  public void setUser(String[] args){
    userSerivce.setUser(args);
  }
  @RequestMapping("delUser")
  @ResponseBody
  public void delUser(String id){
    userSerivce.delUser(id);
  }
  @RequestMapping("findUser")
  @ResponseBody
  public List<User> findUser(){
    return userSerivce.findUser();
  }
  @RequestMapping("findUserById")
  @ResponseBody
  public User findUser(String id){
    return userSerivce.findUser(id);
  }
}
