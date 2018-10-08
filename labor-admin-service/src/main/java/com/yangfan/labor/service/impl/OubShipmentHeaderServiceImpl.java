package com.yangfan.labor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangfan.labor.entity.OubShipmentHeader;
import com.yangfan.labor.repository.OubShipmentHeaderRepository;
import com.yangfan.labor.service.OubShipmentHeaderService;

/**
 * Created by leo01.zhu on 2018/9/30.
 */
@Service
public class OubShipmentHeaderServiceImpl implements OubShipmentHeaderService {

    @Autowired
    private OubShipmentHeaderRepository oubShipmentHeaderRepo;

    @Override
    public String hello() {
        OubShipmentHeader oubShipmentHeader = oubShipmentHeaderRepo.selectByPrimaryKey((long) 1673);
        oubShipmentHeader.getShipmentNo();
        return "hello"+oubShipmentHeader.getShipmentNo();
    }
}
