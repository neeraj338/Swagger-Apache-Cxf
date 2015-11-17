package com.mondia.swagger.test.exception;

public class ApiException extends Exception{
	  private int code;
	  public ApiException (int code, String msg) {
	    super(msg);
	    this.code = code;
	  }
	}
