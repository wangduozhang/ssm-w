package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/16.
 */
@Repository
public interface AdminDao {

    Admin queryAdminByNameAndPass(@Param("name") String name, @Param("password") String password);

    Admin queryAdminByName(String name);

    void insertAdmin(Admin admin);
}
