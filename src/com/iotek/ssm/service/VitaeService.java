package com.iotek.ssm.service;

import com.iotek.ssm.entity.Vitae;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface VitaeService {
    public Vitae findVitaeByTouristId(Integer id);

    void addVitae(Vitae vitae);

    void updateVitae(Vitae vitae);

    List<Vitae> findVitaeByState();

    void resumeVitae(Integer tid);

    void redVitae(Integer tid);
}
