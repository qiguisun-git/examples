package com.examples.page;

import java.util.List;

/**
 * 分页的包装类
 * @version 创建时间 2018年6月1日 下午5:14:25
 * @Title PageResult.java
 * @Package com.examples.page
 * @param <T>
 */
public class PageResult<T> {
	
    /**
     * 数据
     */
    private List<T> dataList;
    /**
     * 当前页
     */
    private int pageNo;
    /**
     * 条数
     */
    private int pageSize;
    /**
     * 总条数
     */
    private long total;

    /**
     * 总页面数目
     */
    private int pages;

	/**
	 * 获取数据
	 * @return the dataList
	 */
	public List<T> getDataList() {
		return dataList;
	}
	

	/**
	 * 设置数据 
	 * @param dataList  数据
	 */
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	

	/**
	 * 获取当前页
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	

	/**
	 * 设置当前页 
	 * @param pageNo  当前页
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	

	/**
	 * 获取条数
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	

	/**
	 * 设置条数 
	 * @param pageSize  条数
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

	/**
	 * 获取总条数
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	

	/**
	 * 设置总条数 
	 * @param total  总条数
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	

	/**
	 * 获取总页面数目
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	

	/**
	 * 设置总页面数目 
	 * @param pages  总页面数目
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	
    
}
