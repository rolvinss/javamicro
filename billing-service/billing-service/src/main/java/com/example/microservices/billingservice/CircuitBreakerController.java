package com.example.microservices.billingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
	
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
//	@CircuitBreaker(name="default", fallbackMethod="hardCodedResponse" )
	@Retry(name="sample-api", fallbackMethod="hardCodedResponse" )
	@RateLimiter(name="default")
	@Bulkhead(name="sample-api")
	public String sampleApi() {
		logger.info("Sample API call received");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8087/some-dummy-url",
				String.class
				);
		return forEntity.getBody();
	}
	
	public String hardCodedResponse(Exception ex) {
		return "Hard coded fallback response to handle failure";
	}
	
	@GetMapping("/billing/sample/circuit-breaker")
	@CircuitBreaker(name="default", fallbackMethod="hardCodedResponse" )
	public String sampleApiCircuitBreaker() {
		logger.info("Sample API call received Circuit Breaker");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8087/some-dummy-url",
				String.class
				);
		return forEntity.getBody();		
	}
	
	@GetMapping("/billing/sample/retry")
	@Retry(name="sample-api", fallbackMethod="hardCodedResponseRetry" )
	public String sampleApiRetry() {
		logger.info("Sample API call received for Retry. ");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8087/some-dummy-url",
				String.class
				);
		return forEntity.getBody();
	}
	
	public String hardCodedResponseRetry(Exception ex) {
		return "Hard coded fallback response to handle failure after retrying several times.";
	}
	
	
	
}
