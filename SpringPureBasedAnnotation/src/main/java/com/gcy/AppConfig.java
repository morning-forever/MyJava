package com.gcy;

import com.gcy.beans.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by guochaoyong on 2018/12/5.
 */
@Configuration
@ComponentScan(basePackages = "com.gcy.beans" )
public class AppConfig {

    @Bean
    public MyService getMyService(){
        return new MyService();
    }

}
