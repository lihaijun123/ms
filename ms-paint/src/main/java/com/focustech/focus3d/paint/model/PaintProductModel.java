package com.focustech.focus3d.paint.model;

import net.sf.json.JSONObject;

import com.focustech.focus3d.agent.model.CommonModel;
import com.focustech.focus3d.paint.ibator.PaintProduct;
import com.focustech.focus3d.paint.ibator.PaintProductCriteria;
/**
 * *
 * @author lihaijun
 *
 */
public class PaintProductModel extends PaintProduct<PaintProductModel, PaintProductCriteria> implements CommonModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PaintCategoryModel categoryModel;
	
	private String picFileUrl;
	private String modelFileUrl;

	public PaintCategoryModel getCategoryModel() {
		return categoryModel;
	}

	public void setCategoryModel(PaintCategoryModel categoryModel) {
		this.categoryModel = categoryModel;
	}
	
	public String serialize(){
		JSONObject jo = new JSONObject();
		jo.put("sn", getEncryptSn());
		jo.put("colorName", getColorName());
		jo.put("name", getName());
		jo.put("productId", getProductId());
		jo.put("category", getCategoryModel().getName());
		jo.put("size", getSize());
		jo.put("dosage", getDosage());
		jo.put("picFileUrl", picFileUrl);
		jo.put("modelFileUrl", modelFileUrl);
		jo.put("version", getVersionNum());
		return jo.toString();
	}

	public String getPicFileUrl() {
		return picFileUrl;
	} 

	public void setPicFileUrl(String picFileUrl) {
		this.picFileUrl = picFileUrl;
	}

	public String getModelFileUrl() {
		return modelFileUrl;
	}

	public void setModelFileUrl(String modelFileUrl) {
		this.modelFileUrl = modelFileUrl;
	}
	
}
