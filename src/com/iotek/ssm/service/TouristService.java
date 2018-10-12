package com.iotek.ssm.service;

import com.iotek.ssm.entity.Tourist;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface TouristService {
    public void addTourist(Tourist tourist);

    Tourist findTouristByNameAndPass(String name, String password);
}
