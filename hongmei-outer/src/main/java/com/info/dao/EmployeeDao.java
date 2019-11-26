package com.info.dao;

import com.info.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeDao {
    //根据code查询用户
    Employee findByName(String code);
    //查询所有用户
    List<Employee> findAll();
    //添加用户
    void addEmployee(Employee employee);
    //根据code删除用户
    void alertStatus(String code);
}
