package com.quantsmart.springboot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: kaiyi
 * @create: 2020-08-06 11:19
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("HelloCommandLineRunner...run..." + Arrays.asList(args));
  }
}
