package com.criat.dto;

public class ResponsDto {
	

	private String responseMsg;
	private String result;
	private Object responseData;
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	@Override
	public String toString() {
		return "ResponsDto [responseMsg=" + responseMsg + ", result=" + result + ", responseData=" + responseData + "]";
	}
	
	
	
	
}
