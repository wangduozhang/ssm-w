package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.EmployeeDao;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> findAllEmployee() {
        return employeeDao.queryAllEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public Employee findEmployeeByNameAndPass(String name, String password) {
        return employeeDao.queryEmployeeByNameAndPass(name,password);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDao.queryEmployeeById(id);
    }
}
