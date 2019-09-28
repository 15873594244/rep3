package com.zl.pojo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.springframework.format.annotation.DateTimeFormat;

public class Tuser  {    
	private Integer id ;
  
	@Override
	public String toString() {
		return "Tuser [id=" + id + ", age=" + age + ", username=" + username + ", pwd=" + pwd + ", hiredate=" + hiredate
				+ ", sex=" + sex + ", aihao=" + aihao + ", rId=" + rId + ", role=" + role + ", aihaoList=" + aihaoList
				+ ", sheng=" + sheng + ", shi=" + shi + "]";
	}


	private Integer age;
	private String username;
    private String pwd ;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date hiredate;
    private String sex ;
    private String aihao ;
    private String rId;
    private Role role;
   // private String[] aihaoList;
    private List<Integer> aihaoList;
  


	private String sheng;
    private String shi;
    
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Integer> getAihaoList() {
		return aihaoList;
	}

	public void setAihaoList(List<Integer> aihaoList) {
		this.aihaoList = aihaoList;
	}

	public String getSheng() {
		return sheng;
	}

	public void setSheng(String sheng) {
		this.sheng = sheng;
	}

	public String getShi() {
		return shi;
	}

	public void setShi(String shi) {
		this.shi = shi;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAihao() {
		return aihao;
	}
	public void setAihao(String aihao) {
		this.aihao = aihao;
	}

	
    

}
