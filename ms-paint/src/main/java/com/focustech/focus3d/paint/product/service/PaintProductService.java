package com.focustech.focus3d.paint.product.service;

import java.util.List;

import com.focustech.focus3d.agent.service.ICommonService;
/**
 * 
 * *
 * @author lihaijun
 *
 * @param <T>
 */
public interface PaintProductService<T> extends ICommonService<T> {

	public List<T> listByColor(long colorSn);
}
