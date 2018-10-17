package com.iotek.ssm.service;

import com.iotek.ssm.entity.Recruit;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface RecruitService {
    void insertRecruit(Recruit recruit);

    List<Recruit> findAllRecruit();

}
