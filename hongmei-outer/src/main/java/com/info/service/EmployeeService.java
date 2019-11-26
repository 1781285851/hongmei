package com.info.service;

import com.info.dao.EmployeeDao;
import com.info.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    ////根据姓名查询用户基本信息
    public Employee findByNameService(String name){
        return employeeDao.findByName(name);
    }

    //查询所有用户
    public List<Employee> findAllService(){
        return employeeDao.findAll();
    }

    //添加用户
    public Boolean addEmployeeService(Employee employee){
        try {
            employeeDao.addEmployee(employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //删除用户
    public void removeByNameService(String name){
        employeeDao.removeByName(name);
    }


}
