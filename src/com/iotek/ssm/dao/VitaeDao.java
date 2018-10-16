package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Vitae;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/12.
 */
@Repository
public interface VitaeDao {
    Vitae queryVitaeByTouristId(Integer id);

    void insertVitae(Vitae vitae);
}
