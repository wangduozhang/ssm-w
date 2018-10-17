package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.RecruitDao;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
@Service("recruitService")
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitDao recruitDao;
    @Override
    public void insertRecruit(Recruit recruit) {
        recruitDao.insertRecruit(recruit);
    }

    @Override
    public List<Recruit> findAllRecruit() {
        return recruitDao.queryAllRecruit();
    }
}
