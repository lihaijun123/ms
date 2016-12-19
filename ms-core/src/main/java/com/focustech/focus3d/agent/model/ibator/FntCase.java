package com.focustech.focus3d.agent.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "fnt_case", Class = FntCase.class)
public class FntCase<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.HOUSE_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Long houseId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.USER_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Long userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.ADDER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.ADDER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.ADD_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.UPDATER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.UPDATER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.UPDATE_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column fnt_case.CASE_DATA
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    @Column
    private String caseData;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.SN
     *
     * @return the value of fnt_case.SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.SN
     *
     * @param sn the value for fnt_case.SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.HOUSE_ID
     *
     * @return the value of fnt_case.HOUSE_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Long getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.HOUSE_ID
     *
     * @param houseId the value for fnt_case.HOUSE_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.USER_ID
     *
     * @return the value of fnt_case.USER_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.USER_ID
     *
     * @param userId the value for fnt_case.USER_ID
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.ADDER_SN
     *
     * @return the value of fnt_case.ADDER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.ADDER_SN
     *
     * @param adderSn the value for fnt_case.ADDER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.ADDER_NAME
     *
     * @return the value of fnt_case.ADDER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.ADDER_NAME
     *
     * @param adderName the value for fnt_case.ADDER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.ADD_TIME
     *
     * @return the value of fnt_case.ADD_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.ADD_TIME
     *
     * @param addTime the value for fnt_case.ADD_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.UPDATER_SN
     *
     * @return the value of fnt_case.UPDATER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.UPDATER_SN
     *
     * @param updaterSn the value for fnt_case.UPDATER_SN
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.UPDATER_NAME
     *
     * @return the value of fnt_case.UPDATER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.UPDATER_NAME
     *
     * @param updaterName the value for fnt_case.UPDATER_NAME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.UPDATE_TIME
     *
     * @return the value of fnt_case.UPDATE_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.UPDATE_TIME
     *
     * @param updateTime the value for fnt_case.UPDATE_TIME
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column fnt_case.CASE_DATA
     *
     * @return the value of fnt_case.CASE_DATA
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public String getCaseData() {
        return caseData;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column fnt_case.CASE_DATA
     *
     * @param caseData the value for fnt_case.CASE_DATA
     *
     * @ibatorgenerated Thu Oct 13 14:44:28 CST 2016
     */
    public void setCaseData(String caseData) {
        this.caseData = caseData;
    }
}