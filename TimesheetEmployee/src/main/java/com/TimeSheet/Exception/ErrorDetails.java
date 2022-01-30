package com.TimeSheet.Exception;

import java.util.Date;

public class ErrorDetails {
 private Date timestamp;
 private String massage;
 private String details;
public ErrorDetails(Date date, String string, String string2) {
	// TODO Auto-generated constructor stub
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getMassage() {
	return massage;
}
public void setMassage(String massage) {
	this.massage = massage;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
@Override
public String toString() {
	return "ErrorDetails [timestamp=" + timestamp + ", massage=" + massage + ", details=" + details + "]";
}
 
}
