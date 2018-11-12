package com.itheima.boot.config;

import com.itheima.boot.pojo.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author NQ
 * @create 2018-11-09 16:44
 */
//@Configuration  // 替换  applicationContext.xml 文件
@SpringBootConfiguration
public class MyConfig {



    @Bean("user")              // 默认情况下  是 方法名称 是ID="getUser"
    public User getUser() {
        User user = new User();
        user.setId(11);

        return user;
    }



}
