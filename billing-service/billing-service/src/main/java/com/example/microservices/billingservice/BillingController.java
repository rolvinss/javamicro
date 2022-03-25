package com.example.microservices.billingservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {
	
	
	@Autowired
	private BillingRepository billingRepository;
	
	@Autowired
	private Environment environment;
	
//	@GetMapping("/currency-exchange/from/{from}/to/{to}")
//	public Billing retrieveExchangeService(
//			@PathVariable String from,
//			@PathVariable String to
//			) {
//		Billing currencyExchange= repository.findByFromAndTo(from, to);
//		if(currencyExchange==null) {
//			throw new RuntimeException("Unable to find data" + from + "  to  " + to);
//		}
//		String port = environment.getProperty("local.server.port");
//		currencyExchange.setEnvironment(port);
//		return currencyExchange;
//		
//	}
	
	@GetMapping("/billing/tenant/bill/summary")
	public  ArrayList<Billing> getAllBillSummary() {
		
		ArrayList<Billing> billing = (ArrayList<Billing>) billingRepository.findAll(); 
		if(billing==null) {
			throw new RuntimeException("Unable to find data");
		}
		
		return billing;
		
	}
	

}
