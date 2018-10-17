package com.iotek.ssm.service;

import com.iotek.ssm.entity.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
public interface JobService {
    List<Job> findAllJobByBId(Integer id);

    Job findJobByName(String job);

    Job findJobById(Integer job);

    void insertJob(Job job);
}
