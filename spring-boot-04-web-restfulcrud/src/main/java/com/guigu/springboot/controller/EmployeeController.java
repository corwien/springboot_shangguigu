package com.guigu.springboot.controller;

import com.guigu.springboot.dao.EmployeeDao;
import com.guigu.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author: kaiyi
 * @create: 2020-08-04 14:59
 */
@Controller
public class EmployeeController {

  @Autowired
  EmployeeDao employeeDao;

  @GetMapping("/emps")
  public String list(Model model){
   Collection<Employee> employees = employeeDao.getAll();

    // 结果放在请求域中，请求域是全局的，可以在页面获取得到
    // System.out.println(employees);
    model.addAttribute("emps", employees);


    return "emp/list";
  }

}
