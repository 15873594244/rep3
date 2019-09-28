package com.zl.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/*
 * 模糊查询类
 */
public class Query {
	private String bookName;
	public Integer tId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	@Override
	public String toString() {
		return "Query [bookName=" + bookName + ", tId=" + tId + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
