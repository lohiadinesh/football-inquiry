package com.company.footballinquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author Dinesh Lohia
 */

@SpringBootApplication
@EnableCircuitBreaker
public class FootballInquiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballInquiryApplication.class, args);
	}

}
