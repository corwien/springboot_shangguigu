package com.guigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author: kaiyi
 * @create: 2020-08-02 10:08
 */

@Controller
public class HelloController {

  @ResponseBody
  @RequestMapping("/hello")
  public String hello(){
    return "Hello World";
  }

  /*
  @RequestMapping({"/", "index.html"})
  public String index(){
    return "index";
  }
   */

  @RequestMapping("/success")
  public String success(Map<String, Object> map){
    map.put("hello", "<h1>你好</h1>");
    return "success";
  }

}
