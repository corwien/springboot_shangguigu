package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:kaiyiwang
 * Version:20/7/19
 */
@Controller
public class HelloController {

  @ResponseBody
  @RequestMapping("/hello")
  public String hello() {
    return "Hello world";
  }

}
