package com.yangfan.labor.repository;

import org.springframework.stereotype.Repository;

import com.yangfan.labor.entity.OubShipmentHeader;

/**
 * Created by leo01.zhu on 2018/9/30.
 */
@Repository
public interface OubShipmentHeaderRepository {

    OubShipmentHeader selectByPrimaryKey(Long id);

}
