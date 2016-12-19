package com.focustech.focus3d.paint.restful;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.focus3d.paint.model.PaintModelModel;
import com.focustech.focus3d.paint.model.service.PaintModelService;
import com.focustech.focus3d.rest.constant.ContentType;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Path(value = "/rest/model")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class ModelRestService {
	@Autowired
	private PaintModelService<PaintModelModel> modelService;
	
	@POST
	@Path("list")
	public String list() {
		JSONObject d2Jo = new JSONObject();
		d2Jo.put("d2", new JSONArray());
		JSONObject d3Jo = new JSONObject();
		d3Jo.put("d3", new JSONArray());
		List<PaintModelModel> list = modelService.list();
		for (PaintModelModel paintModelModel : list) {
			int modelType = paintModelModel.getModelType();
			if(modelType == 1){
				d2Jo.getJSONArray("d2").add(paintModelModel.serialize());
			} else {
				d3Jo.getJSONArray("d3").add(paintModelModel.serialize());
			}
		}
		JSONArray jary = new JSONArray();
		jary.add(d2Jo);
		jary.add(d3Jo);
		return jary.toString();
	}
}
