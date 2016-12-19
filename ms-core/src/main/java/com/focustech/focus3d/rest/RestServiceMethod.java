package com.focustech.focus3d.rest;

import java.util.HashMap;
import java.util.Map;

public class RestServiceMethod {

	private String path;
	private String httpMethod;
	private Map<String, String> requestParameter = new HashMap<String, String>();
	private String desc;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getHttpMethod() {
		return httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	public Map<String, String> getRequestParameter() {
		return requestParameter;
	}
	public void setRequestParameter(Map<String, String> requestParameter) {
		this.requestParameter = requestParameter;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
