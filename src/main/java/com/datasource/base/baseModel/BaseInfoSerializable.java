package com.datasource.base.baseModel;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class BaseInfoSerializable {
	
	/**
	 * @Fields loginPhone : 用户登录手机号
	 */
	private String loginPhone;
	
	/**
	 * @Fields respCode : 返回编码
	 */
	private String respCode;

	/**
	 * @Fields respMesg :返回结果描述
	 */
	private String respMesg;

	public String getLoginPhone() {
		return loginPhone;
	}

	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMesg() {
		return respMesg;
	}

	public void setRespMesg(String respMesg) {
		this.respMesg = respMesg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ReflectionToStringBuilder.toString(this);
	}
}
