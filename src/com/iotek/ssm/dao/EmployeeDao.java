package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
@Repository
public interface EmployeeDao {
    List<Employee> queryAllEmployee();
}
