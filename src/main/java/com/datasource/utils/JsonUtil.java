package com.datasource.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import com.datasource.base.config.ContantsSys;

import net.sf.json.JSONObject;


public class JsonUtil {
	
	@SuppressWarnings("unchecked")
	public static Object str2Obj(String src, Class cla) {

		return JSONObject.toBean(JSONObject.fromObject(src), cla);
	}
	
	public static String obj2Str(Object o) {
	
		return StringTools.removeNull(JSONObject.fromObject(o).toString());
	}
	
	public static String getJson(HttpServletRequest request)
			 {
		String result = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					(ServletInputStream) request.getInputStream(),
					ContantsSys.ENCODING));
			StringBuffer sb = new StringBuffer("");
			String temp;
			while ((temp = br.readLine()) != null) {
				sb.append(temp);
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			/*throw new AppBizException(ContantsRespCode.RESP_CODE_APPBIZ, "鍙傛暟瑙ｆ瀽閿欒");*/
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
