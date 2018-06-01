package com.examples.page;

import java.util.List;

import com.github.pagehelper.Page;

/**
 * 对客户端请求分页数据转换处理
 * @version 创建时间 2018年6月1日 下午5:24:32
 * @Title PageChange.java
 * @Package com.examples.page
 * @param <T>
 */
public class PageChange<T> {

	private List<T> dataList;// 数据

	private int pageNo;// 当前页

	private int pageSize;// 条数

	private long total;// 总条数

	private int pages;// 总页面数目

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static <T> PageResult<T> pageResult(List<T> datas, PageResult<T> result) {
		if (datas instanceof Page) {
			Page<T> page = (Page<T>) datas;
			result.setPageNo(page.getPageNum());
			result.setPageSize(page.getPageSize());
			result.setDataList(page.getResult());
			result.setTotal(page.getTotal());
			result.setPages(page.getPages());
		} else {
			result.setPageNo(1);
			result.setPageSize(datas.size());
			result.setDataList(datas);
			result.setTotal(datas.size());
		}
		return result;
	}

//	public static <T, D> PageResult<D> pageResultVo(List<T> datas, PageResult<D> result, Class<T> sourceClass, Class<D> destinationClass) {
//		if (datas instanceof Page) {
//			Page<T> page = (Page<T>) datas;
//			result.setPageNo(page.getPageNum());
//			result.setPageSize(page.getPageSize());
//			result.setDataList(BeanMapper.mapList(page.getResult(), sourceClass, destinationClass));
//			result.setTotal(page.getTotal());
//			result.setPages(page.getPages());
//		} else {
//			result.setPageNo(1);
//			result.setPageSize(datas.size());
//			result.setDataList(BeanMapper.mapList(datas, sourceClass, destinationClass));
//			result.setTotal(datas.size());
//		}
//		return result;
//	}
}
