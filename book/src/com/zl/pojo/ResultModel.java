package com.zl.pojo;

public class ResultModel {
	private boolean success=false;
	private Object date;
	private String redirectUrl;
	private String error;
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Object getDate() {
		return date;
	}
	public void setDate(Object date) {
		this.date = date;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	

}
