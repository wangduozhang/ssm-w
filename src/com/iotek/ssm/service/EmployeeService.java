package com.iotek.ssm.service;

import com.iotek.ssm.entity.Employee;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
public interface EmployeeService {
    List<Employee> findAllEmployee();

    void addEmployee(Employee employee);

    Employee findEmployeeByNameAndPass(String name, String password);

    Employee findEmployeeById(Integer id);
}
