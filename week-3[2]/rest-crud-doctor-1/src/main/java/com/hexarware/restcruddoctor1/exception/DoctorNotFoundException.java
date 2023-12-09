package com.hexarware.restcruddoctor1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class DoctorNotFoundException extends ResponseStatusException

{
	public DoctorNotFoundException(HttpStatus status, String msg) {
		super(status, msg);
		
	}
	
}
