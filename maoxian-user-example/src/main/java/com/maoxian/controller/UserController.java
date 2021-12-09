package com.maoxian.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maoxian.common.User;
import com.maoxian.mapper.UserMapper;
import org.apache.ibatis.jdbc.Null;
import org.apache.tomcat.util.digester.Digester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.support.NullValue;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.MD5;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张丰亨
 * @date 2021/12/7 15:04
 */
@RestController
public class UserController {
  private Logger logger = LoggerFactory.getLogger(UserController.class);
  @Resource
  private UserMapper userMapper;
  //添加用户
  @RequestMapping(value = "addUser",method = RequestMethod.GET )

  public void addUser(@RequestBody User user){
    logger.info("添加一条数据："+user);
    userMapper.insert(user);
  }
  //修改用户
  @RequestMapping(value = "setUser")
  @ResponseBody
  public void setUser(User user){
    logger.info("修改一条数据"+user);
    userMapper.updateById(user);
  }
  //删除用户
  @RequestMapping("delUser")
  @ResponseBody
  public void delUser(String id){

    logger.info("强制删除一条数据"+id);
    userMapper.deleteById(id);
  }

  @RequestMapping("/finduser")
  @ResponseBody
  public List<User> findUser() {
    QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
    logger.info("批量查询数据"+userQueryWrapper);
    return userMapper.selectList(userQueryWrapper);

  }
  @RequestMapping("findUserById")
  @ResponseBody
  public User findUser(User user){
    logger.info("查询一条数据"+user);
    return userMapper.selectById(user.getId());
  }
}
