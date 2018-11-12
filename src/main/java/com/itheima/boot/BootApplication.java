package com.itheima.boot;

import com.itheima.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author NQ
 * @create 2018-11-09 9:33
 *
 * SpringBoot 的主入口  或者  引导类
 */
@SpringBootApplication    // 当前springboot的应用
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Bean("users")              // 默认情况下  是 方法名称 是ID="getUser"
    public User getUser() {
        User user = new User();
        user.setId(11);

        return user;
    }

}
