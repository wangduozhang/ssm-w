package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Interview;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/18.
 */
@Repository
public interface InterviewDao {
    void insertInterview(@Param("interview") Interview interview, @Param("tid") Integer tid, @Param("eid") Integer eid);
}
