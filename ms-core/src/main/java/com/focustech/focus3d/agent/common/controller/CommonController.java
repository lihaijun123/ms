package com.focustech.focus3d.agent.common.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.focustech.cief.filemanage.core.FileInfo;
import com.focustech.cief.filemanage.core.FileManageFactory;
import com.focustech.cief.filemanage.core.IFileManageClient;
import com.focustech.common.qrcodes.MatrixToImageWriter;
import com.focustech.common.utils.TCUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 *
 * *
 * @author lihaijun
 *
 */
public abstract class CommonController {
	 /**
     * ajax输出
     *
     * @param response HttpServletResponse
     * @param outputString 输出字符
     * @throws IOException 输出流异常

     */
    protected void ajaxOutput(HttpServletResponse response, String outputString) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().write(outputString);
        response.getWriter().flush();
    }

    /**
     * 使用redirect跳转到指定的请求上
     *
     * @param URI 指定的请求链接
     * @return
     */
    protected String redirect(String URI, Integer statusCode, HttpServletRequest req) {
    	req.getSession().setAttribute("saveCode", TCUtil.sv(statusCode));
    	return redirect(URI);
    }

    /**
     * 使用redirect跳转到指定的请求上
     *
     * @param URI 指定的请求链接
     * @return
     */
    public static String redirect(String URI) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("redirect:");
        stringBuilder.append(URI);
        return stringBuilder.toString();
    }

    /**
	 *
	 * 生成二维码
	 * */
	public static byte[] generate(String content){
		try {
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			hints.put(EncodeHintType.MARGIN, 1);
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 319, 319, hints);
			ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
			MatrixToImageWriter.writeToStream(bitMatrix, "jpg", arrayOutputStream);
			return arrayOutputStream.toByteArray();
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取二维码sn
	 * *
	 * @param productInfo
	 * @return
	 */
	protected long getQrFileSn(String content, String sequence) throws RuntimeException {
		long qrFileSn = 0;
		try {
			FileInfo fileUploadObject = new FileInfo();
			fileUploadObject.setName(sequence + ".jpg");
			fileUploadObject.setBytes(generate(content));
			IFileManageClient fileManageClient = FileManageFactory.getFileManageClient(fileUploadObject);
			fileManageClient.upload();
			qrFileSn = TCUtil.lv(fileManageClient.getFileId());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return qrFileSn;
	}
	/**
	 *
	 * *
	 * @param req
	 * @return
	 */
	public boolean isWeixinBrowser(HttpServletRequest req){
        String ua = TCUtil.sv(req.getHeader("User-Agent")).toLowerCase();
        return ua.contains("micromessenger");
    }
	/**
	 *
	 * *
	 * @param req
	 * @return
	 */
	public int getMobileSystemType(HttpServletRequest req){
        String ua = TCUtil.sv(req.getHeader("User-Agent")).toLowerCase();
        if(ua.contains("iphone") || ua.contains("ipad")){
        	return 2;
        }
        return !ua.contains("android") ? 0 : 1;
	}
}
