package com.example.demo.controller;/**
 * Created by kaiyiwang on 20/7/19.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:kaiyiwang
 * Version:20/7/19
 */

/*
@ResponseBody
@Controller
*/
@RestController
public class HelloWorld {

  @RequestMapping("/hello")
  public List<String> hello() {
    // return "Hello, world";

    List<String> list = new ArrayList<>();
    list.add("kaiyi");
    list.add("丽丽");
    return list;
  }

}
