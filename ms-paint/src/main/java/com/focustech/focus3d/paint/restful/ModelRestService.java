package com.focustech.focus3d.paint.restful;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.common.utils.StringUtils;
import com.focustech.common.utils.TCUtil;
import com.focustech.focus3d.paint.model.PaintModelModel;
import com.focustech.focus3d.paint.model.service.PaintModelService;
import com.focustech.focus3d.rest.RestMethodDesc;
import com.focustech.focus3d.rest.constant.ContentType;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@RestMethodDesc("模型服务")
@Service
@Path(value = "/rest/model")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class ModelRestService {
	@Autowired
	private PaintModelService<PaintModelModel> modelService;
	
	@RestMethodDesc("获取模型列表数据（2D全景和3D模型）")
	@POST
	@Path("list")
	public String list() {
		/*JSONObject data = new JSONObject();
		data.put("d2", new JSONArray());
		data.put("d3", new JSONArray());*/
		JSONArray rv = new JSONArray();
		List<PaintModelModel> list = modelService.list();
		for (PaintModelModel paintModelModel : list) {
			//int modelType = paintModelModel.getModelType();
			/*if(modelType == 1){
				data.getJSONArray("d2").add(paintModelModel.serialize());
			} else {
				data.getJSONArray("d3").add(paintModelModel.serialize());
			}*/
			rv.add(paintModelModel.serialize());
		}
		
		return rv.toString();
	}
	
	@RestMethodDesc("模型使用次数")
	@POST
	@Path("usecount")
	public String useCount(@FormParam("id")String id) {
		JSONObject jo = new JSONObject();
		int status = 0;
		String message = "";
		if(StringUtils.isNotEmpty(id)){
			PaintModelModel paintModelModel = modelService.selectBySn(TCUtil.lv(id));
			if(paintModelModel != null){
				int useCount = TCUtil.iv(paintModelModel.getUseCount());
				paintModelModel.setUseCount(++ useCount);
				modelService.updateByKeySelective(paintModelModel);
				status = 1;
				message = "保存成功";
			} else {
				message = "保存失败";
			}
		}
		jo.put("status", status);
		jo.put("message", message);
		return jo.toString();
	}
	
}
