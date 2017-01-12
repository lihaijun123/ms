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
import com.focustech.focus3d.rest.RestMethodDesc;
import com.focustech.focus3d.rest.constant.ContentType;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@RestMethodDesc("色系服务")
@Service
@Path("/rest/color")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class ColorRestService {
	@Autowired
	private PaintColorService<PaintColorModel> colorService;
	@Autowired
	private PaintProductService<PaintProductModel> productService;
	@RestMethodDesc("获取色系数据（一种色系对应多个颜色数据）")
	@POST
	@Path("list")
	public String list() {
		JSONArray jary = new JSONArray();
		List<PaintColorModel> list = colorService.list();
		for (PaintColorModel paintColorModel : list) {
			JSONObject idJo = new JSONObject();
			JSONObject jo = new JSONObject();
			jo.put("name", paintColorModel.getName());
			jo.put("sn", paintColorModel.getEncryptSn());
			jo.put("colors", new JSONArray());
			List<PaintProductModel> colors = productService.listByColor(paintColorModel.getSn());
			for (PaintProductModel paintProductModel : colors) {
				jo.getJSONArray("colors").add(paintProductModel.serialize());
			}
			idJo.put(paintColorModel.getSn(), jo);
			jary.add(idJo);
		}
		return jary.toString();
	}
}
