package com.iotek.ssm.service;

import com.iotek.ssm.entity.Interview;

/**
 * Created by Administrator on 2018/10/18.
 */
public interface InterviewService {
    void insertInterview(Interview interview, Integer tid, Integer eid);
}
