package com.guigu.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

  // 记录器
  Logger logger = LoggerFactory.getLogger(getClass());

  @Test
  void contextLoads() {
    
    // System.out.println("太Low了");
    logger.trace("这是trace日志...");
    logger.debug("这是debug日志...");
    logger.info("这是info日志...");
    logger.error("这是error日志...");


  }

}
