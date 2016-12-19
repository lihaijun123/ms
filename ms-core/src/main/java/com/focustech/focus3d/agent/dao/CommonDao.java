package com.focustech.focus3d.agent.dao;

import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.focustech.cief.ibatis.IbatisWrapper;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.domain.BaseEntity;
import com.focustech.common.utils.ReflectUtils;
import com.focustech.focus3d.agent.model.CommonModel;
/**
 *
 * *
 * @author lihaijun
 *
 */
public class CommonDao<T> extends IbatisWrapper {

	private static final Logger log = LoggerFactory.getLogger(CommonDao.class);
	private static final String SELECT_BY_PRIMARYKEY = ".ibatorgenerated_selectByPrimaryKey";

	 public <T> T selectByKey(Long sn, Class<?> cls) {
        	try {
				Object newInstance = cls.newInstance();
				if(newInstance instanceof CommonModel && sn != null && sn > 0){
					CommonModel commonModel = (CommonModel)newInstance;
					commonModel.setSn(sn);
					return convertIfNecessary(getSqlMapClient().queryForObject(acquireSqlMapName(cls) + SELECT_BY_PRIMARYKEY, commonModel),
							cls);
				} else {
					log.warn(cls.getName() + " 未实现CommonModel 接口，所以无法查询数据");
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
	    }

	    private <T> String acquireSqlMapName(Class<?> clazz) {
	        String sqlMapName = "";
	        SqlMap sqlMap = null;
	        while (clazz != null) {
	            sqlMap = clazz.getAnnotation(SqlMap.class);
	            if (sqlMap != null) {
	                break;
	            }
	            if (clazz.getSuperclass() == Object.class) {
	                break;
	            }
	            clazz = clazz.getSuperclass();
	        }
	        if (sqlMap == null) {
	            sqlMapName = parseToTableName(clazz.getSimpleName());
	        }
	        else {
	            sqlMapName = sqlMap.Name();
	        }
	        return sqlMapName;
	    }
	  

	    private String parseToTableName(String sqlMapName) {
	        StringBuffer sb = new StringBuffer();
	        for (char c : sqlMapName.toCharArray()) {
	            if (Character.isUpperCase(c) && sb.length() > 0) {
	                // 如果是大写，则加上“_”
	                sb.append("_");
	            }
	            sb.append(c);
	        }
	        return sb.toString();
	    }

	    @SuppressWarnings("unchecked")
	    private <T> T convertIfNecessary(Object obj, Class<? extends Object> clazz) {
	    	if(null == obj){
	    		return null;
	    	}
	        if (obj.getClass() == clazz) {
	            return (T) obj;
	        }
	        Object o = null;
	        try {
	            o = clazz.newInstance();
	        }
	        catch (Exception e) {
	            return null;
	        }
	        ReflectUtils.copyPropertis(obj, o);
	        return (T) o;
	    }

		@SuppressWarnings("unchecked")
		public <U> List<T> listByCriteria(U u) {
			ParameterizedType genericType = (ParameterizedType)this.getClass().getGenericSuperclass();
			Class<T> targetCls = (Class<T>)genericType.getActualTypeArguments()[0];
			return selectByCriteria(u, targetCls);
		}
		 /**
	     * 插入一个对象。
	     *
	     * @param t 对应的领域对象或领域Model。
	     * @throws SQLException
	     */
	    private static final String INSERT = ".ibatorgenerated_insert";
	    public void insertBySystem(T t) {
	    	if(t instanceof BaseEntity){
	    		BaseEntity baseEntity = (BaseEntity)t;
	    		baseEntity.setAdderName("system");
	    		baseEntity.setAdderSn(-1L);
	    		baseEntity.setAddTime(new Date());
	    		baseEntity.setUpdaterName("system");
	    		baseEntity.setUpdaterSn(-1L);
	    		baseEntity.setUpdateTime(new Date());
	    		try {
	    			getSqlMapClient().insert(acquireSqlMapName(baseEntity.getClass()) + INSERT, baseEntity);
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }

	    public T selectBySn(Long sn){
			ParameterizedType genericType = (ParameterizedType)this.getClass().getGenericSuperclass();
			Class<T> targetClass = (Class<T>)genericType.getActualTypeArguments()[0];
			return selectByKey(sn, targetClass);
		}

}
