package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.TouristerDao;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12.
 */
@Service("tourService")
public class TouristserviceImpl implements TouristService {
    @Autowired
    private TouristerDao touristerDao;
    @Override
    public void addTourist(Tourist tourist) {
        touristerDao.insertTourist(tourist);
    }

    @Override
    public Tourist findTouristByNameAndPass(String name, String password) {
        return touristerDao.queryTouristByNameAndPass(name,password);
    }

    @Override
    public Tourist findTouristById(Integer id) {
        return touristerDao.queryTouristById(id);
    }

    @Override
    public Tourist findTouristByName(String name) {
        return touristerDao.queryTouristByName(name);
    }
}
