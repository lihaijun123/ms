package com.focustech.focus3d.paint.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focustech.cief.filemanage.common.utils.FileManageUtil;
import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.agent.service.impl.CommonServiceTemplate;
import com.focustech.focus3d.paint.model.PaintModelModel;
import com.focustech.focus3d.paint.model.dao.PaintModelDao;
import com.focustech.focus3d.paint.model.service.PaintModelService;
/**
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PaintModelServiceImpl extends CommonServiceTemplate<PaintModelModel> implements PaintModelService<PaintModelModel> {

	@Autowired
	private PaintModelDao modelDao;
	@Override
	public CommonDao<PaintModelModel> getDao() {
		return modelDao;
	}
	@Override
	public List<PaintModelModel> list() {
		List<PaintModelModel> list = modelDao.list();
		for (PaintModelModel paintModelModel : list) {
			Long picFileSn = paintModelModel.getPicFileSn();
			if(picFileSn != null){
				paintModelModel.setPicFileUrl(FileManageUtil.getFileURL(picFileSn));
			}
			Long modelFileSn = paintModelModel.getModelFileSn();
			if(modelFileSn != null){
				paintModelModel.setModelFileUrl(FileManageUtil.getFileURL(modelFileSn));
			}
		}
		return list;
	}

	
}
