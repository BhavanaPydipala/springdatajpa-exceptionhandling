package com.cap.anurag.entity;

public class ErrorInformation {
 private String url;
 private String message;
	public ErrorInformation(String url, String bodyOfResponse)
	{
		// TODO Auto-generated constructor stub
		this.url=url;
		this.message=bodyOfResponse;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	
}

