package com.company.footballinquiry.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Dinesh Lohia
 */

public class RestApiError {

	private HttpStatus status;
	private String message;

	public RestApiError(HttpStatus badRequest, String message2) {
		this.setMessage(message2);
		this.setStatus(badRequest);
	}

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
