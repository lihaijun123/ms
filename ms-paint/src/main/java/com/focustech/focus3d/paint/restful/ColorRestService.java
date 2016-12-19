package com.focustech.focus3d.paint.restful;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.focus3d.paint.color.service.PaintColorService;
import com.focustech.focus3d.paint.model.PaintColorModel;
import com.focustech.focus3d.paint.model.PaintProductModel;
import com.focustech.focus3d.paint.product.service.PaintProductService;
import com.focustech.focus3d.rest.constant.ContentType;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Path("/rest/color")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class ColorRestService {
	@Autowired
	private PaintColorService<PaintColorModel> colorService;
	@Autowired
	private PaintProductService<PaintProductModel> productService;
	@POST
	@Path("list")
	public String listByGet() {
		JSONArray jary = new JSONArray();
		List<PaintColorModel> list = colorService.list();
		for (PaintColorModel paintColorModel : list) {
			JSONObject jo = new JSONObject();
			jo.put("name", paintColorModel.getName());
			jo.put("sn", paintColorModel.getEncryptSn());
			jo.put("colors", new JSONArray());
			List<PaintProductModel> colors = productService.listByColor(paintColorModel.getSn());
			for (PaintProductModel paintProductModel : colors) {
				jo.getJSONArray("colors").add(paintProductModel.serialize());
			}
			jary.add(jo);
		}
		return jary.toString();
	}
}
