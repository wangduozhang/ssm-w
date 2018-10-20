package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Work;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/19.
 */
@Repository
public interface WorkDao {

    void goInsertWork(Work work);
}
