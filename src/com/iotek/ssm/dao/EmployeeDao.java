package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
@Repository
public interface EmployeeDao {
    List<Employee> queryAllEmployee();

    void insertEmployee(Employee employee);

    Employee queryEmployeeByNameAndPass(@Param("name") String name, @Param("password") String password);

    Employee queryEmployeeById(Integer id);
}
