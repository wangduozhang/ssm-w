package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.VitaeDao;
import com.iotek.ssm.entity.Vitae;
import com.iotek.ssm.service.VitaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@Service("vitaeService")
public class VitaeServiceImpl implements VitaeService {
    @Autowired
    private VitaeDao vitaeDao;

    @Override
    public Vitae findVitaeByTouristId(Integer id) {
        return vitaeDao.queryVitaeByTouristId(id);
    }

    @Override
    public void addVitae(Vitae vitae) {
        vitaeDao.insertVitae(vitae);
    }

    @Override
    public void updateVitae(Vitae vitae) {
        vitaeDao.updateVitae(vitae);
    }

    @Override
    public List<Vitae> findVitaeByState() {
        return vitaeDao.queryVitaeByState();
    }
}
