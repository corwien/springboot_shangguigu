package com.guigu.springboot.config;

/**
 * @author: kaiyi
 * @create: 2020-08-05 23:29
 */
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

  @Bean
  public ConfigurationCustomizer configurationCustomizer(){
    return new ConfigurationCustomizer(){

      @Override
      public void customize(Configuration configuration) {
        configuration.setMapUnderscoreToCamelCase(true);
      }
    };
  }
}
