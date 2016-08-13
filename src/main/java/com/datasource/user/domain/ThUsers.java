package com.datasource.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.datasource.utils.Tools;


public class ThUsers implements Serializable{

	private static final long serialVersionUID = 932996428931089777L;

	private Long id;

    private String loginName;

    private String password;

    private Integer type;

    private String nikeName;

    private String realName;

    private String idenNo;

    private Integer lockState;

    private Date pwdErrTime;

    private Integer pwdErrNum;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdenNo() {
        return idenNo;
    }

    public void setIdenNo(String idenNo) {
        this.idenNo = idenNo;
    }

    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }

    public Date getPwdErrTime() {
        return pwdErrTime;
    }

    public void setPwdErrTime(Date pwdErrTime) {
        this.pwdErrTime = pwdErrTime;
    }

    public Integer getPwdErrNum() {
        return pwdErrNum;
    }

    public void setPwdErrNum(Integer pwdErrNum) {
        this.pwdErrNum = pwdErrNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "ThUsers [id=" + id + ", loginName=" + loginName + ", password="
				+ password + ", type=" + type + ", nikeName=" + nikeName
				+ ", realName=" + realName + ", idenNo=" + idenNo
				+ ", lockState=" + lockState + ", pwdErrTime=" + Tools.formatyyyyMMddhhmmss(pwdErrTime)
				+ ", pwdErrNum=" + pwdErrNum + ", createTime=" + Tools.formatyyyyMMddhhmmss(createTime)
				+ "]";
	}
    
}