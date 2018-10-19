package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Vitae;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@Repository
public interface VitaeDao {
    Vitae queryVitaeByTouristId(Integer id);

    void insertVitae(Vitae vitae);

    void updateVitae(Vitae vitae);

    List<Vitae> queryVitaeByState();

    void resumeVitae(Integer tid);

    void redVitae(Integer tid);
}
