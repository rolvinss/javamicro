package com.example.microservices.billingservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {

//	Billing findByFromAndTo(String from, String to);
}
