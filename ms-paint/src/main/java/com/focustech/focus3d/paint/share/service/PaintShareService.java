/**
 * 
 */
package com.focustech.focus3d.paint.share.service;

import java.util.List;

import com.focustech.focus3d.agent.service.ICommonService;

/**
 * @author lihaijun
 *
 * 2016-12-20
 */
public interface PaintShareService<T> extends ICommonService<T> {

	public List<T> selectByPicSn(long picFileSn);
}
