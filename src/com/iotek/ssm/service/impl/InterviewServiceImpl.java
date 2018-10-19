package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.InterviewDao;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/18.
 */
@Service("interviewService")
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewDao interviewDao;
    @Override
    public void insertInterview(Interview interview, Integer tid, Integer eid) {
        interviewDao.insertInterview(interview,tid,eid);
    }
}
