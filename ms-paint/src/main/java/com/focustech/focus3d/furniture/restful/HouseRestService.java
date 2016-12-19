package com.focustech.focus3d.furniture.restful;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;

import com.focustech.focus3d.rest.constant.ContentType;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Path("/rest/house")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
public class HouseRestService {
	/**
	 * *
	 * @param province
	 * @param city
	 * @param keyWord
	 * @param type
	 * @param areaRange
	 * @param roomType
	 * @return
	 */
	@GET
	@Path("search")
	public String searchByGet(
			@QueryParam("areaList") String areaRange,
			@QueryParam("city") String city,
			@QueryParam("keyword") String keyWord,
			@QueryParam("pageIndex") String pageNow,
			@QueryParam("pageSize") String pageSize,
			@QueryParam("province") String province,
			@QueryParam("type") String type,
			@QueryParam("plansTypeList") String plansTypeList,
			@QueryParam("roomsList") String roomType
			) {
		return searchData(province, city, keyWord, type, areaRange, roomType, pageNow, pageSize);
	}
	/**
	 * *
	 * @param province
	 * @param city
	 * @param keyWord
	 * @param type
	 * @param areaRange
	 * @param roomType
	 * @return
	 */
	@POST
	@Path("search")
	public String searchByPost(
			@FormParam("areaList") String areaRange,
			@FormParam("city") String city,
			@FormParam("keyword") String keyWord,
			@FormParam("pageIndex") String pageNow,
			@FormParam("pageSize") String pageSize,
			@FormParam("province") String province,
			@FormParam("type") String type,
			@FormParam("plansTypeList") String plansTypeList,
			@FormParam("roomsList") String roomType
			) {
		return searchData(province, city, keyWord, type, areaRange, roomType, pageNow, pageSize);
	}
	/**
	 * *
	 * @param province
	 * @param city
	 * @param keyWord
	 * @param type
	 * @param areaRange
	 * @param roomType
	 * @return
	 */
	private String searchData(String province, String city, String keyWord,
			String type, String areaRange, String roomType, String pageNow, String pageSize) {
		return "";
	}
}
