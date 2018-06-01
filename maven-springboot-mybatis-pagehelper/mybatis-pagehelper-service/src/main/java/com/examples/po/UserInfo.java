package com.examples.po;

import java.math.BigDecimal;
import java.util.Date;

public class UserInfo {

	private String sid;

	/**
	 * 用户登录名
	 */
	private String userId;
	
	/**
	 * 用户登录密码
	 */
	private String userPassword;

	/**
	 * 用户真实姓名
	 */
	private String realName;

	/**
	 * 手机号码
	 */
	private String mobile;

	/**
	 * 联系电话
	 */
	private String telephone;

	/**
	 * 邮件地址
	 */
	private String email;

	/**
	 * QQ号码
	 */
	private String qq;

	/**
	 * 公司ID
	 */
	private String comId;

	private String isPtWork;

	/**
	 * 用户类型10：平台管理员
	 * 11：平台员工
	 * 20：供应商
	 * 21：供应商员工
	 * 30：分销商
	 * 31：分销商员工
	 * 40：二代
	 * 41：二代员工
	 */
	private String userType;

	/**
	 * 组织ID
	 */
	private BigDecimal orgId;

	/**
	 * 资源ID:平台、采购、供应的员工资源权限。 201，301.401,501
	 */
	private String resourceIds;

	/**
	 * 工号
	 */
	private String workId;

	/**
	 * 是否可用.用户标识
	 * 0：禁用
	 * 1：启用
	 * 2：删除
	 * 默认：1
	 */
	private String status;

	/**
	 * 账号开通时间
	 */
	private Date regTime;

	/**
	 * 创建人ID。默认：当前用户ID
	 */
	private String createUser;

	/**
	 * 创建时间:当前时间
	 */
	private Date createTime;

	/**
	 * 最后修改人ID，初始为创建人
	 */
	private String lastUpdateUser;

	/**
	 * 最后修改时间，初始为创建时间
	 */
	private Date lastUpdateTime;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getIsPtWork() {
		return isPtWork;
	}

	public void setIsPtWork(String isPtWork) {
		this.isPtWork = isPtWork;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BigDecimal getOrgId() {
		return orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public String getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}
