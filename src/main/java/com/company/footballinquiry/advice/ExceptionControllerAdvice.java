package com.company.footballinquiry.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.company.footballinquiry.exception.BadRequestException;
import com.company.footballinquiry.exception.RestApiError;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Dinesh Lohia
 */

@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {
	
    private static Logger log = LoggerFactory.getLogger(ExceptionControllerAdvice.class);


	@ExceptionHandler({ BadRequestException.class })
	public ResponseEntity<RestApiError> handleBadRequestException(Exception ex) {
		log.error("Exception caught: ", ex);
		return new ResponseEntity<>(new RestApiError(HttpStatus.BAD_REQUEST, ex.getMessage()), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ Exception.class, HttpClientErrorException.class })
	public ResponseEntity<RestApiError> handleException(Exception ex) {
		log.error("Exception caught: ", ex);
		return new ResponseEntity<>(new RestApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
