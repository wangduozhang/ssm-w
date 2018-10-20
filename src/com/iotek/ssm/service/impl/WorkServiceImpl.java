package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.WorkDao;
import com.iotek.ssm.entity.Work;
import com.iotek.ssm.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/19.
 */
@Service("workService")
public class WorkServiceImpl implements WorkService{
    @Autowired
    private WorkDao workDao;
    @Override
    public void goInsertWork(Work work) {
        workDao.goInsertWork(work);
    }
}
