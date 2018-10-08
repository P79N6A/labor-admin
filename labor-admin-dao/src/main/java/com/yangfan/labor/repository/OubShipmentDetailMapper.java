package com.yangfan.labor.repository;

import com.yangfan.labor.entity.OubShipmentDetail;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface OubShipmentDetailMapper {
    int deleteByPrimaryKey(Long oubShipmentDetailId);

    int insert(OubShipmentDetail record);

    OubShipmentDetail selectByPrimaryKey(Long oubShipmentDetailId);

    List<OubShipmentDetail> selectAll();

    int updateByPrimaryKey(OubShipmentDetail record);
}