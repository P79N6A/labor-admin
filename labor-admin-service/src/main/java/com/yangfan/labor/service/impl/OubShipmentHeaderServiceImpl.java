package com.yangfan.labor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yangfan.labor.entity.OubShipmentDetail;
import com.yangfan.labor.mapper.OubShipmentDetailMapper;
import com.yangfan.labor.service.OubShipmentHeaderService;

/**
 * Created by leo01.zhu on 2018/9/30.
 */
@Service
@Transactional
public class OubShipmentHeaderServiceImpl implements OubShipmentHeaderService {

//    @Autowired
//    private OubShipmentHeaderRepository oubShipmentHeaderRepo;

    @Autowired
    private OubShipmentDetailMapper oubShipmentDetailMapper;

    @Override
    public String hello() {
//        OubShipmentHeader oubShipmentHeader = oubShipmentHeaderRepo.selectByPrimaryKey((long) 1673);
//        oubShipmentHeader.getShipmentNo();

        OubShipmentDetail oubShipmentDetail = oubShipmentDetailMapper.selectByPrimaryKey((long) 1673);
        String shipmentNo = "";
        if (null != oubShipmentDetail) {
            shipmentNo = oubShipmentDetail.getShipmentNo();
        }
        return "hello:" + shipmentNo;
    }
}
