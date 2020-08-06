package com.guigu.springboot.controller;

import com.guigu.springboot.bean.Employee;
import com.guigu.springboot.mapper.DepartmentMapper;
import com.guigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kaiyi
 * @create: 2020-08-05 23:42
 */

@RestController
public class DeptController {
  //@Autowired
  //DepartmentMapper departmentMapper;

  @Autowired
  EmployeeMapper employeeMapper;

  @GetMapping("/emp/{id}")
  public Employee getEmp(@PathVariable("id") Integer id){
    return employeeMapper.getEmpById(id);
  }

}
