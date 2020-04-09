package com.cap.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
public class Exception extends Throwable
{

	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value={Exception.class})
	protected ErrorInformation handler(Exception exception,HttpServletRequest request)
	{
		String bodyOfResponse=exception.getMessage();
		String url=request.getRequestURI().toString();
		return new ErrorInformation(url,bodyOfResponse);
	}
}

