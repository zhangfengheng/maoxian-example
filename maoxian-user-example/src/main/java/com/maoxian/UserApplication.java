package com.maoxian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 张丰亨
 * @date 2021/12/7 9:48
 */
@SpringBootApplication
@MapperScan("com.maoxian.mapper")
public class UserApplication {
  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class,args);
  }
}
