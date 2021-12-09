package com.maoxian.common;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.*;

/**
 * @author 张丰亨
 * @date 2021/12/7 14:28
 */
@Data
@TableName(value = "user",schema = "maoxian")
public class User {
  @TableId
  private String id;
  private String name;
  private String password;
  private String salt;
  private String phone;
  private String email;
  private Integer isdelete;


}
