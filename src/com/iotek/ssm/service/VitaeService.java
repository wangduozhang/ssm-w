package com.iotek.ssm.service;

import com.iotek.ssm.entity.Vitae;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface VitaeService {
    public Vitae findVitaeByTouristId(Integer id);
}
