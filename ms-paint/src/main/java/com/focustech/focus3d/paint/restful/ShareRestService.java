/**
 * 
 */
package com.focustech.focus3d.paint.restful;

import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.focustech.common.utils.EncryptUtil;
import com.focustech.common.utils.StringUtils;
import com.focustech.focus3d.paint.model.PaintShareModel;
import com.focustech.focus3d.paint.share.service.PaintShareService;
import com.focustech.focus3d.rest.RestMethodDesc;
import com.focustech.focus3d.rest.constant.ContentType;

/**
 * @author lihaijun
 *
 * 2016-12-20
 */
@RestMethodDesc("分享服务")
@Service
@Path("/rest/share")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class ShareRestService {
	@Autowired
	private PaintShareService<PaintShareModel> paintShareService;
	@Value("${rest.service.protocal}")
	private String serviceProtocalUrl;
	
	public String share(@FormParam("picFileSn") String picFileSn, @FormParam("colorSns") String colorSns) throws Exception{
		if(StringUtils.isNotEmpty(picFileSn) && StringUtils.isNotEmpty(colorSns)){
			long picFileSnDecode = EncryptUtil.decode(picFileSn);
			String[] colorAry = colorSns.split(",");
			for (String colorSn : colorAry) {
				long colorSnDecode = EncryptUtil.decode(colorSn);
				PaintShareModel shareModel = new PaintShareModel();
				shareModel.setPicFileSn(picFileSnDecode);
				shareModel.setProductSn(colorSnDecode);
				paintShareService.insert(shareModel);
			}
		}
		return serviceProtocalUrl + "/share/" + picFileSn;
	}
	
	
}
