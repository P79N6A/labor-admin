package com.yangfan.labor.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OubShipmentDetail {
    private Long oubShipmentDetailId;

    private Long oubShipmentHeaderId;

    private String shipmentNo;

    private Integer shipmentLineNo;

    private String warehouseCode;

    private Short statusCode;

    private String erpOrderNo;

    private String erpOrderLineNo;

    private String itemCode;

    private String itemName;

    private String clientCode;

    private String clientName;

    private String inventoryType;

    private String batchNo;

    private String inventoryQuality;

    private String countryOfOrigin;

    private Date expDate;

    private Date mfgDate;

    private Date receivedDate;

    private String poNo;

    private String salesNo;

    private String salesStatus;

    private Boolean inventoryStatus;

    private String brandCode;

    private String brandName;

    private String vendorCode;

    private String vendorName;

    private BigDecimal reqQty;

    private String reqUom;

    private BigDecimal origAllocationQty;

    private BigDecimal allocationQty;

    private String allocationUom;

    private BigDecimal pickedQty;

    private String pickedUom;

    private BigDecimal oqcQty;

    private String oqcUom;

    private BigDecimal sortingQty;

    private BigDecimal sortingEpQty;

    private String sortingUom;

    private BigDecimal oubQty;

    private String oubUom;

    private Date oubDate;

    private String oubUser;

    private String priority;

    private String exceptionType;

    private String exceptionDesc;

    private String exceptionApproach;

    private BigDecimal exceptionQty;

    private BigDecimal price;

    private BigDecimal itemRetailPrice;

    private BigDecimal itemNetPrice;

    private BigDecimal reqWeight;

    private String weightUom;

    private String itemClassCode;

    private Boolean isGift;

    private Boolean isImmediateNeed;

    private String ecMode;

    private BigDecimal reqVolume;

    private String reqVolumeUom;

    private String brandType;

    private String channelType;

    private String fulfillmentType;

    private String itemSize;

    private String packageCode;

    private String packageName;

    private String returnMaxUom;

    private BigDecimal returnMaxQty;

    private String oqcItemscanField1;

    private String oqcItemscanValue1;

    private String oqcItemscanField2;

    private String oqcItemscanValue2;

    private String oqcColumnField1;

    private String oqcColumnValue1;

    private String oqcColumnField2;

    private String oqcColumnValue2;

    private String oqcItemdescValue1;

    private String oqcItemdescValue2;

    private Short noPo;

    private String enCompanyDesc;

    private String enItemDesc;

    private BigDecimal grossWeight;

    private String saleBrandId;

    private BigDecimal reservedQty;

    private Long invLotId;

    private String lotAttr1;

    private String lotAttr2;

    private String lotAttr3;

    private String lotAttr4;

    private String lotAttr5;

    private String lotAttr6;

    private String lotAttr7;

    private String lotAttr8;

    private BigDecimal lotAttr9;

    private BigDecimal lotAttr10;

    private BigDecimal lotAttr11;

    private BigDecimal lotAttr12;

    private Date lotAttr13;

    private Date lotAttr14;

    private Date lotAttr15;

    private Date lotAttr16;

    private String userDef1;

    private String userDef2;

    private String userDef3;

    private String userDef4;

    private String userDef5;

    private String userDef6;

    private Date userDef7;

    private Date userDef8;

    private BigDecimal userDef9;

    private BigDecimal userDef10;

    private BigDecimal goodsLineMoney;

    private String fromWarehouseCode;

    private String goodsPic;

    private Long createdByUserId;

    private String createdByUser;

    private String createdOffice;

    private Date createdDtmLoc;

    private String createdTimeZone;

    private Long updatedByUserId;

    private String updatedByUser;

    private String updatedOffice;

    private Date updatedDtmLoc;

    private String updatedTimeZone;

    private Long recordVersion;

    private String containerCode;

    private String ownerCode;

    private Byte salesTypeFlag;

    private Byte notAllowReturn;

    private Byte inventoryGroup;

    private String serialNo;

    public Long getOubShipmentDetailId() {
        return oubShipmentDetailId;
    }

    public void setOubShipmentDetailId(Long oubShipmentDetailId) {
        this.oubShipmentDetailId = oubShipmentDetailId;
    }

    public Long getOubShipmentHeaderId() {
        return oubShipmentHeaderId;
    }

    public void setOubShipmentHeaderId(Long oubShipmentHeaderId) {
        this.oubShipmentHeaderId = oubShipmentHeaderId;
    }

    public String getShipmentNo() {
        return shipmentNo;
    }

    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo == null ? null : shipmentNo.trim();
    }

    public Integer getShipmentLineNo() {
        return shipmentLineNo;
    }

    public void setShipmentLineNo(Integer shipmentLineNo) {
        this.shipmentLineNo = shipmentLineNo;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public Short getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Short statusCode) {
        this.statusCode = statusCode;
    }

    public String getErpOrderNo() {
        return erpOrderNo;
    }

    public void setErpOrderNo(String erpOrderNo) {
        this.erpOrderNo = erpOrderNo == null ? null : erpOrderNo.trim();
    }

    public String getErpOrderLineNo() {
        return erpOrderLineNo;
    }

    public void setErpOrderLineNo(String erpOrderLineNo) {
        this.erpOrderLineNo = erpOrderLineNo == null ? null : erpOrderLineNo.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType == null ? null : inventoryType.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getInventoryQuality() {
        return inventoryQuality;
    }

    public void setInventoryQuality(String inventoryQuality) {
        this.inventoryQuality = inventoryQuality == null ? null : inventoryQuality.trim();
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin == null ? null : countryOfOrigin.trim();
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo == null ? null : poNo.trim();
    }

    public String getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(String salesNo) {
        this.salesNo = salesNo == null ? null : salesNo.trim();
    }

    public String getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus == null ? null : salesStatus.trim();
    }

    public Boolean getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(Boolean inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public BigDecimal getReqQty() {
        return reqQty;
    }

    public void setReqQty(BigDecimal reqQty) {
        this.reqQty = reqQty;
    }

    public String getReqUom() {
        return reqUom;
    }

    public void setReqUom(String reqUom) {
        this.reqUom = reqUom == null ? null : reqUom.trim();
    }

    public BigDecimal getOrigAllocationQty() {
        return origAllocationQty;
    }

    public void setOrigAllocationQty(BigDecimal origAllocationQty) {
        this.origAllocationQty = origAllocationQty;
    }

    public BigDecimal getAllocationQty() {
        return allocationQty;
    }

    public void setAllocationQty(BigDecimal allocationQty) {
        this.allocationQty = allocationQty;
    }

    public String getAllocationUom() {
        return allocationUom;
    }

    public void setAllocationUom(String allocationUom) {
        this.allocationUom = allocationUom == null ? null : allocationUom.trim();
    }

    public BigDecimal getPickedQty() {
        return pickedQty;
    }

    public void setPickedQty(BigDecimal pickedQty) {
        this.pickedQty = pickedQty;
    }

    public String getPickedUom() {
        return pickedUom;
    }

    public void setPickedUom(String pickedUom) {
        this.pickedUom = pickedUom == null ? null : pickedUom.trim();
    }

    public BigDecimal getOqcQty() {
        return oqcQty;
    }

    public void setOqcQty(BigDecimal oqcQty) {
        this.oqcQty = oqcQty;
    }

    public String getOqcUom() {
        return oqcUom;
    }

    public void setOqcUom(String oqcUom) {
        this.oqcUom = oqcUom == null ? null : oqcUom.trim();
    }

    public BigDecimal getSortingQty() {
        return sortingQty;
    }

    public void setSortingQty(BigDecimal sortingQty) {
        this.sortingQty = sortingQty;
    }

    public BigDecimal getSortingEpQty() {
        return sortingEpQty;
    }

    public void setSortingEpQty(BigDecimal sortingEpQty) {
        this.sortingEpQty = sortingEpQty;
    }

    public String getSortingUom() {
        return sortingUom;
    }

    public void setSortingUom(String sortingUom) {
        this.sortingUom = sortingUom == null ? null : sortingUom.trim();
    }

    public BigDecimal getOubQty() {
        return oubQty;
    }

    public void setOubQty(BigDecimal oubQty) {
        this.oubQty = oubQty;
    }

    public String getOubUom() {
        return oubUom;
    }

    public void setOubUom(String oubUom) {
        this.oubUom = oubUom == null ? null : oubUom.trim();
    }

    public Date getOubDate() {
        return oubDate;
    }

    public void setOubDate(Date oubDate) {
        this.oubDate = oubDate;
    }

    public String getOubUser() {
        return oubUser;
    }

    public void setOubUser(String oubUser) {
        this.oubUser = oubUser == null ? null : oubUser.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType == null ? null : exceptionType.trim();
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc == null ? null : exceptionDesc.trim();
    }

    public String getExceptionApproach() {
        return exceptionApproach;
    }

    public void setExceptionApproach(String exceptionApproach) {
        this.exceptionApproach = exceptionApproach == null ? null : exceptionApproach.trim();
    }

    public BigDecimal getExceptionQty() {
        return exceptionQty;
    }

    public void setExceptionQty(BigDecimal exceptionQty) {
        this.exceptionQty = exceptionQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getItemRetailPrice() {
        return itemRetailPrice;
    }

    public void setItemRetailPrice(BigDecimal itemRetailPrice) {
        this.itemRetailPrice = itemRetailPrice;
    }

    public BigDecimal getItemNetPrice() {
        return itemNetPrice;
    }

    public void setItemNetPrice(BigDecimal itemNetPrice) {
        this.itemNetPrice = itemNetPrice;
    }

    public BigDecimal getReqWeight() {
        return reqWeight;
    }

    public void setReqWeight(BigDecimal reqWeight) {
        this.reqWeight = reqWeight;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom == null ? null : weightUom.trim();
    }

    public String getItemClassCode() {
        return itemClassCode;
    }

    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode == null ? null : itemClassCode.trim();
    }

    public Boolean getIsGift() {
        return isGift;
    }

    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public Boolean getIsImmediateNeed() {
        return isImmediateNeed;
    }

    public void setIsImmediateNeed(Boolean isImmediateNeed) {
        this.isImmediateNeed = isImmediateNeed;
    }

    public String getEcMode() {
        return ecMode;
    }

    public void setEcMode(String ecMode) {
        this.ecMode = ecMode == null ? null : ecMode.trim();
    }

    public BigDecimal getReqVolume() {
        return reqVolume;
    }

    public void setReqVolume(BigDecimal reqVolume) {
        this.reqVolume = reqVolume;
    }

    public String getReqVolumeUom() {
        return reqVolumeUom;
    }

    public void setReqVolumeUom(String reqVolumeUom) {
        this.reqVolumeUom = reqVolumeUom == null ? null : reqVolumeUom.trim();
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getFulfillmentType() {
        return fulfillmentType;
    }

    public void setFulfillmentType(String fulfillmentType) {
        this.fulfillmentType = fulfillmentType == null ? null : fulfillmentType.trim();
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize == null ? null : itemSize.trim();
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode == null ? null : packageCode.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getReturnMaxUom() {
        return returnMaxUom;
    }

    public void setReturnMaxUom(String returnMaxUom) {
        this.returnMaxUom = returnMaxUom == null ? null : returnMaxUom.trim();
    }

    public BigDecimal getReturnMaxQty() {
        return returnMaxQty;
    }

    public void setReturnMaxQty(BigDecimal returnMaxQty) {
        this.returnMaxQty = returnMaxQty;
    }

    public String getOqcItemscanField1() {
        return oqcItemscanField1;
    }

    public void setOqcItemscanField1(String oqcItemscanField1) {
        this.oqcItemscanField1 = oqcItemscanField1 == null ? null : oqcItemscanField1.trim();
    }

    public String getOqcItemscanValue1() {
        return oqcItemscanValue1;
    }

    public void setOqcItemscanValue1(String oqcItemscanValue1) {
        this.oqcItemscanValue1 = oqcItemscanValue1 == null ? null : oqcItemscanValue1.trim();
    }

    public String getOqcItemscanField2() {
        return oqcItemscanField2;
    }

    public void setOqcItemscanField2(String oqcItemscanField2) {
        this.oqcItemscanField2 = oqcItemscanField2 == null ? null : oqcItemscanField2.trim();
    }

    public String getOqcItemscanValue2() {
        return oqcItemscanValue2;
    }

    public void setOqcItemscanValue2(String oqcItemscanValue2) {
        this.oqcItemscanValue2 = oqcItemscanValue2 == null ? null : oqcItemscanValue2.trim();
    }

    public String getOqcColumnField1() {
        return oqcColumnField1;
    }

    public void setOqcColumnField1(String oqcColumnField1) {
        this.oqcColumnField1 = oqcColumnField1 == null ? null : oqcColumnField1.trim();
    }

    public String getOqcColumnValue1() {
        return oqcColumnValue1;
    }

    public void setOqcColumnValue1(String oqcColumnValue1) {
        this.oqcColumnValue1 = oqcColumnValue1 == null ? null : oqcColumnValue1.trim();
    }

    public String getOqcColumnField2() {
        return oqcColumnField2;
    }

    public void setOqcColumnField2(String oqcColumnField2) {
        this.oqcColumnField2 = oqcColumnField2 == null ? null : oqcColumnField2.trim();
    }

    public String getOqcColumnValue2() {
        return oqcColumnValue2;
    }

    public void setOqcColumnValue2(String oqcColumnValue2) {
        this.oqcColumnValue2 = oqcColumnValue2 == null ? null : oqcColumnValue2.trim();
    }

    public String getOqcItemdescValue1() {
        return oqcItemdescValue1;
    }

    public void setOqcItemdescValue1(String oqcItemdescValue1) {
        this.oqcItemdescValue1 = oqcItemdescValue1 == null ? null : oqcItemdescValue1.trim();
    }

    public String getOqcItemdescValue2() {
        return oqcItemdescValue2;
    }

    public void setOqcItemdescValue2(String oqcItemdescValue2) {
        this.oqcItemdescValue2 = oqcItemdescValue2 == null ? null : oqcItemdescValue2.trim();
    }

    public Short getNoPo() {
        return noPo;
    }

    public void setNoPo(Short noPo) {
        this.noPo = noPo;
    }

    public String getEnCompanyDesc() {
        return enCompanyDesc;
    }

    public void setEnCompanyDesc(String enCompanyDesc) {
        this.enCompanyDesc = enCompanyDesc == null ? null : enCompanyDesc.trim();
    }

    public String getEnItemDesc() {
        return enItemDesc;
    }

    public void setEnItemDesc(String enItemDesc) {
        this.enItemDesc = enItemDesc == null ? null : enItemDesc.trim();
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getSaleBrandId() {
        return saleBrandId;
    }

    public void setSaleBrandId(String saleBrandId) {
        this.saleBrandId = saleBrandId == null ? null : saleBrandId.trim();
    }

    public BigDecimal getReservedQty() {
        return reservedQty;
    }

    public void setReservedQty(BigDecimal reservedQty) {
        this.reservedQty = reservedQty;
    }

    public Long getInvLotId() {
        return invLotId;
    }

    public void setInvLotId(Long invLotId) {
        this.invLotId = invLotId;
    }

    public String getLotAttr1() {
        return lotAttr1;
    }

    public void setLotAttr1(String lotAttr1) {
        this.lotAttr1 = lotAttr1 == null ? null : lotAttr1.trim();
    }

    public String getLotAttr2() {
        return lotAttr2;
    }

    public void setLotAttr2(String lotAttr2) {
        this.lotAttr2 = lotAttr2 == null ? null : lotAttr2.trim();
    }

    public String getLotAttr3() {
        return lotAttr3;
    }

    public void setLotAttr3(String lotAttr3) {
        this.lotAttr3 = lotAttr3 == null ? null : lotAttr3.trim();
    }

    public String getLotAttr4() {
        return lotAttr4;
    }

    public void setLotAttr4(String lotAttr4) {
        this.lotAttr4 = lotAttr4 == null ? null : lotAttr4.trim();
    }

    public String getLotAttr5() {
        return lotAttr5;
    }

    public void setLotAttr5(String lotAttr5) {
        this.lotAttr5 = lotAttr5 == null ? null : lotAttr5.trim();
    }

    public String getLotAttr6() {
        return lotAttr6;
    }

    public void setLotAttr6(String lotAttr6) {
        this.lotAttr6 = lotAttr6 == null ? null : lotAttr6.trim();
    }

    public String getLotAttr7() {
        return lotAttr7;
    }

    public void setLotAttr7(String lotAttr7) {
        this.lotAttr7 = lotAttr7 == null ? null : lotAttr7.trim();
    }

    public String getLotAttr8() {
        return lotAttr8;
    }

    public void setLotAttr8(String lotAttr8) {
        this.lotAttr8 = lotAttr8 == null ? null : lotAttr8.trim();
    }

    public BigDecimal getLotAttr9() {
        return lotAttr9;
    }

    public void setLotAttr9(BigDecimal lotAttr9) {
        this.lotAttr9 = lotAttr9;
    }

    public BigDecimal getLotAttr10() {
        return lotAttr10;
    }

    public void setLotAttr10(BigDecimal lotAttr10) {
        this.lotAttr10 = lotAttr10;
    }

    public BigDecimal getLotAttr11() {
        return lotAttr11;
    }

    public void setLotAttr11(BigDecimal lotAttr11) {
        this.lotAttr11 = lotAttr11;
    }

    public BigDecimal getLotAttr12() {
        return lotAttr12;
    }

    public void setLotAttr12(BigDecimal lotAttr12) {
        this.lotAttr12 = lotAttr12;
    }

    public Date getLotAttr13() {
        return lotAttr13;
    }

    public void setLotAttr13(Date lotAttr13) {
        this.lotAttr13 = lotAttr13;
    }

    public Date getLotAttr14() {
        return lotAttr14;
    }

    public void setLotAttr14(Date lotAttr14) {
        this.lotAttr14 = lotAttr14;
    }

    public Date getLotAttr15() {
        return lotAttr15;
    }

    public void setLotAttr15(Date lotAttr15) {
        this.lotAttr15 = lotAttr15;
    }

    public Date getLotAttr16() {
        return lotAttr16;
    }

    public void setLotAttr16(Date lotAttr16) {
        this.lotAttr16 = lotAttr16;
    }

    public String getUserDef1() {
        return userDef1;
    }

    public void setUserDef1(String userDef1) {
        this.userDef1 = userDef1 == null ? null : userDef1.trim();
    }

    public String getUserDef2() {
        return userDef2;
    }

    public void setUserDef2(String userDef2) {
        this.userDef2 = userDef2 == null ? null : userDef2.trim();
    }

    public String getUserDef3() {
        return userDef3;
    }

    public void setUserDef3(String userDef3) {
        this.userDef3 = userDef3 == null ? null : userDef3.trim();
    }

    public String getUserDef4() {
        return userDef4;
    }

    public void setUserDef4(String userDef4) {
        this.userDef4 = userDef4 == null ? null : userDef4.trim();
    }

    public String getUserDef5() {
        return userDef5;
    }

    public void setUserDef5(String userDef5) {
        this.userDef5 = userDef5 == null ? null : userDef5.trim();
    }

    public String getUserDef6() {
        return userDef6;
    }

    public void setUserDef6(String userDef6) {
        this.userDef6 = userDef6 == null ? null : userDef6.trim();
    }

    public Date getUserDef7() {
        return userDef7;
    }

    public void setUserDef7(Date userDef7) {
        this.userDef7 = userDef7;
    }

    public Date getUserDef8() {
        return userDef8;
    }

    public void setUserDef8(Date userDef8) {
        this.userDef8 = userDef8;
    }

    public BigDecimal getUserDef9() {
        return userDef9;
    }

    public void setUserDef9(BigDecimal userDef9) {
        this.userDef9 = userDef9;
    }

    public BigDecimal getUserDef10() {
        return userDef10;
    }

    public void setUserDef10(BigDecimal userDef10) {
        this.userDef10 = userDef10;
    }

    public BigDecimal getGoodsLineMoney() {
        return goodsLineMoney;
    }

    public void setGoodsLineMoney(BigDecimal goodsLineMoney) {
        this.goodsLineMoney = goodsLineMoney;
    }

    public String getFromWarehouseCode() {
        return fromWarehouseCode;
    }

    public void setFromWarehouseCode(String fromWarehouseCode) {
        this.fromWarehouseCode = fromWarehouseCode == null ? null : fromWarehouseCode.trim();
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser == null ? null : createdByUser.trim();
    }

    public String getCreatedOffice() {
        return createdOffice;
    }

    public void setCreatedOffice(String createdOffice) {
        this.createdOffice = createdOffice == null ? null : createdOffice.trim();
    }

    public Date getCreatedDtmLoc() {
        return createdDtmLoc;
    }

    public void setCreatedDtmLoc(Date createdDtmLoc) {
        this.createdDtmLoc = createdDtmLoc;
    }

    public String getCreatedTimeZone() {
        return createdTimeZone;
    }

    public void setCreatedTimeZone(String createdTimeZone) {
        this.createdTimeZone = createdTimeZone == null ? null : createdTimeZone.trim();
    }

    public Long getUpdatedByUserId() {
        return updatedByUserId;
    }

    public void setUpdatedByUserId(Long updatedByUserId) {
        this.updatedByUserId = updatedByUserId;
    }

    public String getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser == null ? null : updatedByUser.trim();
    }

    public String getUpdatedOffice() {
        return updatedOffice;
    }

    public void setUpdatedOffice(String updatedOffice) {
        this.updatedOffice = updatedOffice == null ? null : updatedOffice.trim();
    }

    public Date getUpdatedDtmLoc() {
        return updatedDtmLoc;
    }

    public void setUpdatedDtmLoc(Date updatedDtmLoc) {
        this.updatedDtmLoc = updatedDtmLoc;
    }

    public String getUpdatedTimeZone() {
        return updatedTimeZone;
    }

    public void setUpdatedTimeZone(String updatedTimeZone) {
        this.updatedTimeZone = updatedTimeZone == null ? null : updatedTimeZone.trim();
    }

    public Long getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }

    public String getContainerCode() {
        return containerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode == null ? null : containerCode.trim();
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode == null ? null : ownerCode.trim();
    }

    public Byte getSalesTypeFlag() {
        return salesTypeFlag;
    }

    public void setSalesTypeFlag(Byte salesTypeFlag) {
        this.salesTypeFlag = salesTypeFlag;
    }

    public Byte getNotAllowReturn() {
        return notAllowReturn;
    }

    public void setNotAllowReturn(Byte notAllowReturn) {
        this.notAllowReturn = notAllowReturn;
    }

    public Byte getInventoryGroup() {
        return inventoryGroup;
    }

    public void setInventoryGroup(Byte inventoryGroup) {
        this.inventoryGroup = inventoryGroup;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }
}