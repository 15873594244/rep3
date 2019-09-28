package com.zl.pojo;

import java.util.List;

public class Role {
	private Integer id;
	private Integer rId;
	private String name;
	private List<Power> powerList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", rId=" + rId + ", name=" + name + ", powerList=" + powerList + "]";
	}
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Power> getPowerList() {
		return powerList;
	}
	public void setPowerList(List<Power> powerList) {
		this.powerList = powerList;
	}
	
	
	

}
