package com.atguigu.yygh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @Author: 吴华美
 * @Date: 2021/4/2 23:00
 */
@ComponentScan(basePackages = {"com.atguigu"})
@SpringBootApplication
public class ServiceHospApplication {
        public static void main(String[] args) {
            SpringApplication.run(ServiceHospApplication.class, args);
        }
}
