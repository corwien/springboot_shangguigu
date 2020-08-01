package com.guigu.springboot.config;

import com.guigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: kaiyi
 * @create: 2020-08-01 14:51
 *
 * @Configuration 指明当前类是一个配置类，就是替代之前的Spring配置文件
 *
 * 在配置文件中用 <bean></bean> 标签来添加组件
 */
@Configuration
public class MyAppConfig {

  // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
  @Bean
  public HelloService helloService02(){

    return new HelloService();
  }

}
