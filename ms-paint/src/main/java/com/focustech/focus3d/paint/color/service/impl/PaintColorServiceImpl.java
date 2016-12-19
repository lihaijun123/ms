package com.focustech.focus3d.paint.color.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.agent.service.impl.CommonServiceTemplate;
import com.focustech.focus3d.paint.color.dao.PaintColorDao;
import com.focustech.focus3d.paint.color.service.PaintColorService;
import com.focustech.focus3d.paint.model.PaintColorModel;
/**
 * *
 * @author lihaijun
 *
 */
@Service
public class PaintColorServiceImpl extends CommonServiceTemplate<PaintColorModel> implements PaintColorService<PaintColorModel> {
	@Autowired
	private PaintColorDao colorDao;
	@Override
	public CommonDao<PaintColorModel> getDao() {
		return colorDao;
	}

}
