package com.quantsmart.springboot.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: kaiyi
 * @create: 2020-08-06 10:18
 */
public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {


  @Override
  public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
    System.out.println("ApplicationContextInitializer...initialize..." + configurableApplicationContext);

  }
}
