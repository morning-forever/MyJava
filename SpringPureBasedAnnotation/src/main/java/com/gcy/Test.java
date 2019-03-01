package com.gcy;

import com.gcy.beans.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guochaoyong on 2018/12/5.
 */
public class Test {
    public static void main(String args[]){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beans = ac.getBeanDefinitionNames();
        for(String beanName : beans){
            System.out.println(beanName);
        }
        MyService myService = (MyService) ac.getBean("getMyService");
        myService.sayHello();

    }
}
