package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Tourist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/12.
 */
@Repository
public interface TouristerDao {
    public void insertTourist(Tourist tourist);

    Tourist queryTouristByNameAndPass(@Param("name") String name, @Param("password") String password);
}
