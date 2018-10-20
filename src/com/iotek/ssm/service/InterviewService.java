package com.iotek.ssm.service;

import com.iotek.ssm.entity.Interview;

import java.util.List;

/**
 * Created by Administrator on 2018/10/18.
 */
public interface InterviewService {
    void insertInterview(Interview interview, Integer tid, Integer eid);

    List<Interview> findInterviewByTid(Integer tid);

    void editInterview(Integer id);

    List<Interview> findInterviewByState();

    void editInductionByTid(Integer tid);
}
