package com.TimeSheet.Exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
//handle specific exception
	@ExceptionHandler(RecordNotFountException.class)
	public ResponseEntity<?> handleResourceNotFoundException(RecordNotFountException exception,WebRequest request){
      ErrorDetails errordetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
    		  return new ResponseEntity<Object>(errordetails,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> handleAPIException(APIException exception,WebRequest request){
	      ErrorDetails errordetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
	    		  return new ResponseEntity<Object>(errordetails,HttpStatus.NOT_FOUND);
		}
	
	
		//Handle global Exception
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleAPIException(Exception exception,WebRequest request){
	      ErrorDetails errordetails=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
	    		  return new ResponseEntity(errordetails,HttpStatus.NOT_FOUND);
		}
   // @ExceptionHandler(MethodArgumentNotValidException.class) 
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status,WebRequest request){
		Map<String,String> errors=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName =((FieldError)error).getField();
		   String message=error.getDefaultMessage();
		   errors.put(fieldName, message);
		});
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
		
	}
}
