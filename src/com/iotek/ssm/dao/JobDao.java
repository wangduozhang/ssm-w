package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Job;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Repository
public interface JobDao {

    Job queryJobByName(String name);

    List<Job> queryAllJobByBId(Integer id);

    Job queryJobById(Integer id);

    void insertJob(Job job);
}
