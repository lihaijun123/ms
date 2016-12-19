package com.focustech.focus3d.paint.model;

import net.sf.json.JSONObject;

import com.focustech.common.utils.DateUtils;
import com.focustech.common.utils.TCUtil;
import com.focustech.focus3d.agent.model.CommonModel;
import com.focustech.focus3d.paint.ibator.PaintModel;
import com.focustech.focus3d.paint.ibator.PaintModelCriteria;

public class PaintModelModel extends PaintModel<PaintModelModel, PaintModelCriteria> implements CommonModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String picFileUrl;
	
	private String modelFileUrl;

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
	
	public String serialize(){
		JSONObject jo = new JSONObject();
		jo.put("name", getName());
		jo.put("modelType", getModelType());
		jo.put("houseType", getHouseType());
		jo.put("picFileUrl", picFileUrl);
		jo.put("modelFileUrl", modelFileUrl);
		jo.put("useCount", TCUtil.sv(getUseCount()));
		jo.put("addTime", DateUtils.formatDate(getAddTime(), "yyyy-MM-dd"));
		return jo.toString();
	}
}
