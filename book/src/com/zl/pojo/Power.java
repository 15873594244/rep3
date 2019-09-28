package com.zl.pojo;

import java.io.Serializable;

public class Power implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer p_Id;
	private String name;
	private String url;
	@Override
	public String toString() {
		return "Power [id=" + id + ", pId=" + p_Id + ", name=" + name + ", url=" + url + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getP_Id() {
		return p_Id;
	}
	public void setP_Id(Integer p_Id) {
		this.p_Id = p_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
