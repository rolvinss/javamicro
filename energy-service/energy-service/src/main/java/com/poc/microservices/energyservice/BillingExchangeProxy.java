package com.poc.microservices.energyservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//below is used when we know about the exact url to hit else remove url key to get load balancing by itself using eureka-namingserver
//@FeignClient(name="currency-exchange", url="localhost:8000")

@FeignClient(name="billing")
public interface BillingExchangeProxy {

	@GetMapping("/billing/")
	public Energy retrieveExchangeService(
			@PathVariable String from,
			@PathVariable String to
			);
	
}
