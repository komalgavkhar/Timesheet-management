package com.TimeSheet.Exception;

@SuppressWarnings("serial")
public class APIException extends RuntimeException {

	public APIException(String message) {
		super(message);
	}
}
