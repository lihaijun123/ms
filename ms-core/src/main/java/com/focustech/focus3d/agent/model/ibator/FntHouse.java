package com.focustech.focus3d.agent.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.math.BigDecimal;
import java.util.Date;

@Xss
@SqlMap(Name = "fnt_house", Class = FntHouse.class)
public class FntHouse<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.TYPE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Integer type;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.AREA
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private BigDecimal area;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.PIC_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Long picFileSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Integer roomNum;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.LIVING_ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Integer livingRoomNum;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.MODEL_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String modelName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.MODEL_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Long modelFileSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.MODEL_FILE_VERSION
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Integer modelFileVersion;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.BUILDING_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String buildingName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.PROVINCE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String province;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.CITY
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.STREET
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String street;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.BUILDING_NO
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String buildingNo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.STATUS
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Integer status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.REMARK
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String remark;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.ADDER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.ADDER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.ADD_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.UPDATER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.UPDATER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_house.UPDATE_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    @Column
    private Date updateTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.SN
     *
     * @return the value of fnt_house.SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.SN
     *
     * @param sn the value for fnt_house.SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.NAME
     *
     * @return the value of fnt_house.NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.NAME
     *
     * @param name the value for fnt_house.NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.TYPE
     *
     * @return the value of fnt_house.TYPE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.TYPE
     *
     * @param type the value for fnt_house.TYPE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.AREA
     *
     * @return the value of fnt_house.AREA
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.AREA
     *
     * @param area the value for fnt_house.AREA
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.PIC_FILE_SN
     *
     * @return the value of fnt_house.PIC_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Long getPicFileSn() {
        return picFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.PIC_FILE_SN
     *
     * @param picFileSn the value for fnt_house.PIC_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setPicFileSn(Long picFileSn) {
        this.picFileSn = picFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.ROOM_NUM
     *
     * @return the value of fnt_house.ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.ROOM_NUM
     *
     * @param roomNum the value for fnt_house.ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.LIVING_ROOM_NUM
     *
     * @return the value of fnt_house.LIVING_ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Integer getLivingRoomNum() {
        return livingRoomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.LIVING_ROOM_NUM
     *
     * @param livingRoomNum the value for fnt_house.LIVING_ROOM_NUM
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setLivingRoomNum(Integer livingRoomNum) {
        this.livingRoomNum = livingRoomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.MODEL_NAME
     *
     * @return the value of fnt_house.MODEL_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.MODEL_NAME
     *
     * @param modelName the value for fnt_house.MODEL_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.MODEL_FILE_SN
     *
     * @return the value of fnt_house.MODEL_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Long getModelFileSn() {
        return modelFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.MODEL_FILE_SN
     *
     * @param modelFileSn the value for fnt_house.MODEL_FILE_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setModelFileSn(Long modelFileSn) {
        this.modelFileSn = modelFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.MODEL_FILE_VERSION
     *
     * @return the value of fnt_house.MODEL_FILE_VERSION
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Integer getModelFileVersion() {
        return modelFileVersion;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.MODEL_FILE_VERSION
     *
     * @param modelFileVersion the value for fnt_house.MODEL_FILE_VERSION
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setModelFileVersion(Integer modelFileVersion) {
        this.modelFileVersion = modelFileVersion;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.BUILDING_NAME
     *
     * @return the value of fnt_house.BUILDING_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.BUILDING_NAME
     *
     * @param buildingName the value for fnt_house.BUILDING_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.PROVINCE
     *
     * @return the value of fnt_house.PROVINCE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.PROVINCE
     *
     * @param province the value for fnt_house.PROVINCE
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.CITY
     *
     * @return the value of fnt_house.CITY
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.CITY
     *
     * @param city the value for fnt_house.CITY
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.STREET
     *
     * @return the value of fnt_house.STREET
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getStreet() {
        return street;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.STREET
     *
     * @param street the value for fnt_house.STREET
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.BUILDING_NO
     *
     * @return the value of fnt_house.BUILDING_NO
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.BUILDING_NO
     *
     * @param buildingNo the value for fnt_house.BUILDING_NO
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.STATUS
     *
     * @return the value of fnt_house.STATUS
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.STATUS
     *
     * @param status the value for fnt_house.STATUS
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.REMARK
     *
     * @return the value of fnt_house.REMARK
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.REMARK
     *
     * @param remark the value for fnt_house.REMARK
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.ADDER_SN
     *
     * @return the value of fnt_house.ADDER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.ADDER_SN
     *
     * @param adderSn the value for fnt_house.ADDER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.ADDER_NAME
     *
     * @return the value of fnt_house.ADDER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.ADDER_NAME
     *
     * @param adderName the value for fnt_house.ADDER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.ADD_TIME
     *
     * @return the value of fnt_house.ADD_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.ADD_TIME
     *
     * @param addTime the value for fnt_house.ADD_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.UPDATER_SN
     *
     * @return the value of fnt_house.UPDATER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.UPDATER_SN
     *
     * @param updaterSn the value for fnt_house.UPDATER_SN
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.UPDATER_NAME
     *
     * @return the value of fnt_house.UPDATER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.UPDATER_NAME
     *
     * @param updaterName the value for fnt_house.UPDATER_NAME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_house.UPDATE_TIME
     *
     * @return the value of fnt_house.UPDATE_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_house.UPDATE_TIME
     *
     * @param updateTime the value for fnt_house.UPDATE_TIME
     *
     * @ibatorgenerated Tue Sep 20 22:14:59 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}