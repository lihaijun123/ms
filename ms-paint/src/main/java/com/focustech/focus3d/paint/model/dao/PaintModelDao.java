package com.focustech.focus3d.paint.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.paint.ibator.PaintModelCriteria;
import com.focustech.focus3d.paint.model.PaintModelModel;
/**
 * *
 * @author lihaijun
 *
 */
@Repository
public class PaintModelDao extends CommonDao<PaintModelModel> {

	public List<PaintModelModel> list(){
		PaintModelCriteria criteria = new PaintModelCriteria();
		criteria.setOrderByClause(" model_type, house_type, add_time desc, name");
		return listByCriteria(criteria);
	}
}
