package com.zl.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Book {
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", tId=" + tId + ", bookMan=" + bookMan + ", pressName="
				+ pressName + ", pressDate=" + pressDate + ", stock=" + stock + ", bookType=" + bookType + "]";
	}
	private Integer id;
	private String bookName;
	private Integer tId;
	private String bookMan;
	private String pressName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pressDate ;
	private Integer stock;
	private BookType bookType;
	
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getBookMan() {
		return bookMan;
	}
	public void setBookMan(String bookMan) {
		this.bookMan = bookMan;
	}
	public String getPressName() {
		return pressName;
	}
	public void setPressName(String pressName) {
		this.pressName = pressName;
	}
	public Date getPressDate() {
		return pressDate;
	}
	public void setPressDate(Date pressDate) {
		this.pressDate = pressDate;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}


}
