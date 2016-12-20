/**
 * 
 */
package com.focustech.focus3d.paint.share.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focustech.focus3d.agent.dao.CommonDao;
import com.focustech.focus3d.agent.service.impl.CommonServiceTemplate;
import com.focustech.focus3d.paint.model.PaintShareModel;
import com.focustech.focus3d.paint.share.dao.PaintShareDao;
import com.focustech.focus3d.paint.share.service.PaintShareService;

/**
 * @author lihaijun
 *
 * 2016-12-20
 */
@Service
public class PaintShareServiceImpl extends CommonServiceTemplate<PaintShareModel> implements PaintShareService<PaintShareModel> {
	
	@Autowired
	private PaintShareDao paintShareDao;
	
	@Override
	public CommonDao<PaintShareModel> getDao() {
		return paintShareDao;
	}

	@Override
	public List<PaintShareModel> selectByPicSn(long picFileSn) {
		return paintShareDao.selectByPicSn(picFileSn);
	}

}
