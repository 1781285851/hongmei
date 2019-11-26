package com.info.dao;

import com.info.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmployeeDao {
    //根据姓名删除用户
    Employee findByName(String name);
    //查询所有用户
    List<Employee> findAll();
    //添加用户
    void addEmployee(Employee employee);
    //删除用户
    void removeByName(String name);
}
