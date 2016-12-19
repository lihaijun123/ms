package com.focustech.focus3d.paint.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.cief.filemanage.common.utils.FileManageUtil;
import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.agent.service.impl.CommonServiceTemplate;
import com.focustech.focus3d.paint.category.dao.PaintCategoryDao;
import com.focustech.focus3d.paint.ibator.PaintProductCriteria;
import com.focustech.focus3d.paint.model.PaintCategoryModel;
import com.focustech.focus3d.paint.model.PaintProductModel;
import com.focustech.focus3d.paint.product.dao.PaintProductDao;
import com.focustech.focus3d.paint.product.service.PaintProductService;
/**
 * *
 * @author lihaijun
 *
 */
@Service
public class PaintProductServiceImpl extends CommonServiceTemplate<PaintProductModel> implements
		PaintProductService<PaintProductModel> {

	@Autowired
	private PaintProductDao productDao;
	@Autowired
	private PaintCategoryDao categoryDao;
	@Override
	public CommonDao<PaintProductModel> getDao() {
		return productDao;
	}
	@Override
	public List<PaintProductModel> listByColor(long colorSn) {
		PaintProductCriteria criteria = new PaintProductCriteria();
		criteria.createCriteria().andColorSnEqualTo(colorSn);
		List<PaintProductModel> list = productDao.listByCriteria(criteria);
		for (PaintProductModel paintProductModel : list) {
			Long picFileSn = paintProductModel.getPicFileSn();
			if(picFileSn != null){
				paintProductModel.setPicFileUrl(FileManageUtil.getFileURL(picFileSn));
			}
			Long modelFileSn = paintProductModel.getModelFileSn();
			if(modelFileSn != null){
				paintProductModel.setModelFileUrl(FileManageUtil.getFileURL(modelFileSn));
			}
			Long cateSn = paintProductModel.getCateSn();
			PaintCategoryModel categoryModel = categoryDao.selectBySn(cateSn);
			paintProductModel.setCategoryModel(categoryModel);
		}
		return list;
	}

}
