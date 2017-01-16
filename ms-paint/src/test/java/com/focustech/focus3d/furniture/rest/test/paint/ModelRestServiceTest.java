package com.focustech.focus3d.furniture.rest.test.paint;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.junit.Test;
import org.springframework.http.HttpMethod;

import com.focustech.focus3d.rest.test.AbstractTest;
/**
 * *
 * @author lihaijun
 *
 */
public class ModelRestServiceTest extends AbstractTest{
	

	@Test
	public void testHouse() {
		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
		httpRequest(getProtocal() + "/rest/model/list", qparams, HttpMethod.POST);
	}

	@Override
	protected String getProtocal() {
		return URL_TEST;
	}
	
}
