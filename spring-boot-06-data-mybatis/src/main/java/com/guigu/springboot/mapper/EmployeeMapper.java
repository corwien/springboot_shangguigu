package com.guigu.springboot.mapper;

import com.guigu.springboot.bean.Employee;

/**
 * @author: kaiyi
 * @create: 2020-08-05 22:54
 */

// @Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
  public Employee getEmpById(Integer id);

  public void insertEmp(Employee employee);

}
