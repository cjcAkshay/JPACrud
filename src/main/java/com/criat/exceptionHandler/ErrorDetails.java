package com.criat.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorDetails {


	private String message;
	private HttpStatus statusmsg;
	private String requesturi;
	private int statuscode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatusmsg() {
		return statusmsg;
	}
	public void setStatusmsg(HttpStatus statusmsg) {
		this.statusmsg = statusmsg;
	}
	public String getRequesturi() {
		return requesturi;
	}
	public void setRequesturi(String requesturi) {
		this.requesturi = requesturi;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", statusmsg=" + statusmsg + ", requesturi=" + requesturi
				+ ", statuscode=" + statuscode + "]";
	}
	public ErrorDetails(String message, HttpStatus statusmsg, String requesturi, int statuscode) {
		super();
		this.message = message;
		this.statusmsg = statusmsg;
		this.requesturi = requesturi;
		this.statuscode = statuscode;
	}
	public ErrorDetails() {
		super();
	}

	
}
