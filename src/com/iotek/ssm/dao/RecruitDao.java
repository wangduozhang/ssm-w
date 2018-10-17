package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Recruit;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
@Repository
public interface RecruitDao {
    void insertRecruit(Recruit recruit);

    List<Recruit> queryAllRecruit();

}
