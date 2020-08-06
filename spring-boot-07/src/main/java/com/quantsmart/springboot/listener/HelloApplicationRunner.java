package com.quantsmart.springboot.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author: kaiyi
 * @create: 2020-08-06 11:08
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {


  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("ApplicationRunner...run...");

  }
}
