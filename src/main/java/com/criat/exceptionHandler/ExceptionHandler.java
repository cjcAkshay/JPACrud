package com.criat.exceptionHandler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandler {

	/*
	 * @org.springframework.web.bind.annotation.ExceptionHandler(
	 * StoreIdNotFoundException.class) public ResponseEntity<?>
	 * handleStoreIdNotFoundException(StoreIdNotFoundException exception, WebRequest
	 * request) { ErrorDetails errorDetails = new ErrorDetails(new Date(),
	 * exception.getMessage(),HttpStatus statusmsg, request.getDescription(false));
	 * 
	 * return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND); }
	 */
	
	public ErrorDetails m1(StoreIdNotFoundException s, HttpServletRequest req) 
	{
		ErrorDetails e = new ErrorDetails();
		e.setMessage(s.getMessage());
		e.setStatusmsg(HttpStatus.NOT_FOUND);
		e.setRequesturi(req.getRequestURI());
		e.setStatuscode(HttpServletResponse.SC_NOT_FOUND);
		
		return e;
	}

	
	
}
