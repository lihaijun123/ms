package com.focustech.focus3d.paint.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "paint_product", Class = PaintProduct.class)
public class PaintProduct<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.COLOR_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String colorName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.PIC_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long picFileSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.MODEL_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long modelFileSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.PRODUCT_ID
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String productId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.CATE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long cateSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.COLOR_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long colorSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.SIZE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String size;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.DOSAGE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String dosage;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.ADDER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.ADDER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.ADD_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.UPDATER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.UPDATER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.UPDATE_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column paint_product.encryptSn
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.SN
     *
     * @return the value of paint_product.SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.SN
     *
     * @param sn the value for paint_product.SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.NAME
     *
     * @return the value of paint_product.NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.NAME
     *
     * @param name the value for paint_product.NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.COLOR_NAME
     *
     * @return the value of paint_product.COLOR_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.COLOR_NAME
     *
     * @param colorName the value for paint_product.COLOR_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.PIC_FILE_SN
     *
     * @return the value of paint_product.PIC_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getPicFileSn() {
        return picFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.PIC_FILE_SN
     *
     * @param picFileSn the value for paint_product.PIC_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setPicFileSn(Long picFileSn) {
        this.picFileSn = picFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.MODEL_FILE_SN
     *
     * @return the value of paint_product.MODEL_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getModelFileSn() {
        return modelFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.MODEL_FILE_SN
     *
     * @param modelFileSn the value for paint_product.MODEL_FILE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setModelFileSn(Long modelFileSn) {
        this.modelFileSn = modelFileSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.PRODUCT_ID
     *
     * @return the value of paint_product.PRODUCT_ID
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.PRODUCT_ID
     *
     * @param productId the value for paint_product.PRODUCT_ID
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.CATE_SN
     *
     * @return the value of paint_product.CATE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getCateSn() {
        return cateSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.CATE_SN
     *
     * @param cateSn the value for paint_product.CATE_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setCateSn(Long cateSn) {
        this.cateSn = cateSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.COLOR_SN
     *
     * @return the value of paint_product.COLOR_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getColorSn() {
        return colorSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.COLOR_SN
     *
     * @param colorSn the value for paint_product.COLOR_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setColorSn(Long colorSn) {
        this.colorSn = colorSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.SIZE
     *
     * @return the value of paint_product.SIZE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.SIZE
     *
     * @param size the value for paint_product.SIZE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.DOSAGE
     *
     * @return the value of paint_product.DOSAGE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.DOSAGE
     *
     * @param dosage the value for paint_product.DOSAGE
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.ADDER_SN
     *
     * @return the value of paint_product.ADDER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.ADDER_SN
     *
     * @param adderSn the value for paint_product.ADDER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.ADDER_NAME
     *
     * @return the value of paint_product.ADDER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.ADDER_NAME
     *
     * @param adderName the value for paint_product.ADDER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.ADD_TIME
     *
     * @return the value of paint_product.ADD_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.ADD_TIME
     *
     * @param addTime the value for paint_product.ADD_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.UPDATER_SN
     *
     * @return the value of paint_product.UPDATER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.UPDATER_SN
     *
     * @param updaterSn the value for paint_product.UPDATER_SN
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.UPDATER_NAME
     *
     * @return the value of paint_product.UPDATER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.UPDATER_NAME
     *
     * @param updaterName the value for paint_product.UPDATER_NAME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.UPDATE_TIME
     *
     * @return the value of paint_product.UPDATE_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.UPDATE_TIME
     *
     * @param updateTime the value for paint_product.UPDATE_TIME
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column paint_product.encryptSn
     *
     * @return the value of paint_product.encryptSn
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column paint_product.encryptSn
     *
     * @param encryptSn the value for paint_product.encryptSn
     *
     * @ibatorgenerated Fri Dec 16 14:01:29 CST 2016
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}