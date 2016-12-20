/**
 * 
 */
package com.focustech.focus3d.paint.share.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.common.utils.EncryptUtil;
import com.focustech.common.utils.StringUtils;
import com.focustech.focus3d.paint.model.PaintShareModel;
import com.focustech.focus3d.paint.share.service.PaintShareService;

/**
 * @author lihaijun
 *
 * 2016-12-20
 */
@Controller
@RequestMapping("/share")
public class ShareController {
	@Autowired
	private PaintShareService<PaintShareModel> paintShareService;
	/**
	 * *
	 * @param modelMap
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/{picFilesn}")
	public String index(@PathVariable("picFileSn") String picFileSn, ModelMap modelMap) throws Exception{
		if(StringUtils.isNotEmpty(picFileSn)){
			Long decode = EncryptUtil.decode(picFileSn);
			List<PaintShareModel> list = paintShareService.selectByPicSn(decode);
			modelMap.put("picFileSn", decode);
			modelMap.put("list", list);
		}
		return "/share/page";
	}
}
