package com.examples.po;

import com.examples.utils.excel.annotation.ExcelField;

/**
 * 借款审核、审查、审批、借款报表excel模板
 * 
 * @author sunqigui
 * @version 创建时间 2018年1月2日 下午5:15:08
 * @Title BorrowLogReporyVo.java
 * @Package com.zyzl.vpay.common.vo.Borrow
 */
public class BorrowLogExcel {

	/**
	 * 借款交易号
	 */
	private String borrowNo;

	/**
	 * 申请时间
	 */
	private String createTime;

	/**
	 * 借款类型0常规，1临时
	 */
	private String borrowType;

	/**
	 * 公司账号
	 */
	private String comId;

	/**
	 * 客户经理
	 */
	private String salesId;

	/**
	 * 借款金额
	 */
	private Double borrowAmount;

	/**
	 * 备注
	 */
	private String note;

	@ExcelField(title = "交易号", align = 2, sort = 1)
	public String getBorrowNo() {
		return borrowNo;
	}

	public void setBorrowNo(String borrowNo) {
		this.borrowNo = borrowNo;
	}

	@ExcelField(title = "借款日期", align = 2, sort = 2)
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@ExcelField(title = "借款类型", align = 2, sort = 3)
	public String getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(String borrowType) {
		this.borrowType = borrowType;
	}

	@ExcelField(title = "客户账号", align = 2, sort = 4)
	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@ExcelField(title = "客户经理", align = 2, sort = 5)
	public String getSalesId() {
		return salesId;
	}

	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}

	@ExcelField(title = "借款金额", align = 2, sort = 6)
	public Double getBorrowAmount() {
		return borrowAmount;
	}

	public void setBorrowAmount(Double borrowAmount) {
		this.borrowAmount = borrowAmount;
	}

	@ExcelField(title = "备注", align = 2, sort = 7)
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
