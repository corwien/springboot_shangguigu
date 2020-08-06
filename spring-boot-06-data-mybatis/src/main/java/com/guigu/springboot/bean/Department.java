package com.guigu.springboot.bean;

/**
 * @author: kaiyi
 * @create: 2020-08-05 23:43
 */
public class Department {

  private Integer id;
  private String departmentName;

  public void setId(Integer id) {
    this.id = id;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public Integer getId() {
    return id;
  }

  public String getDepartmentName() {
    return departmentName;
  }
}
