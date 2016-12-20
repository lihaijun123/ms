package com.focustech.focus3d.paint.share.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.paint.ibator.PaintShareCriteria;
import com.focustech.focus3d.paint.model.PaintShareModel;

/**
 * 
 * *
 * @author lihaijun
 *
 */
 
@Repository
public class PaintShareDao extends CommonDao<PaintShareModel> {

	public List<PaintShareModel> selectByPicSn(long picFileSn){
		PaintShareCriteria criteria = new PaintShareCriteria();
		criteria.createCriteria().andPicFileSnEqualTo(picFileSn);
		return selectByCriteria(criteria, PaintShareModel.class);
	}
}
