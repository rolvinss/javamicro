package com.poc.microservices.energyservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EnergyController {

	@Autowired
	private BillingExchangeProxy proxy;
	
	
    @GetMapping("/energy/faults/details")
    public ResponseEntity<JsonNode> get() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree("[{\"EquipmentID\":\"00d8e593-bf05-488b-a8f1-b4f4d3a3bda8\",\"FaultDetailList\":[{\"FaultID\":\"907\",\"FaultName\":\"\",\"Duration\":366.59749698638916,\"fddTimeLineDetail\":[{\"EndTime\":\"2019-03-31T00:00:00+05:30\",\"StartTime\":\"2019-03-30T16:15:35+05:30\",\"Duration\":7.740278},{\"EndTime\":\"2019-04-01T00:00:00+05:30\",\"StartTime\":\"2019-03-31T00:00:37+05:30\",\"Duration\":23.989721},{\"EndTime\":\"2019-04-02T00:00:00+05:30\",\"StartTime\":\"2019-04-01T00:00:43+05:30\",\"Duration\":23.988056},{\"EndTime\":\"2019-04-03T00:00:00+05:30\",\"StartTime\":\"2019-04-02T00:00:34+05:30\",\"Duration\":23.990555},{\"EndTime\":\"2019-04-04T00:00:00+05:30\",\"StartTime\":\"2019-04-03T00:00:36+05:30\",\"Duration\":23.99},{\"EndTime\":\"2019-04-05T00:00:00+05:30\",\"StartTime\":\"2019-04-04T00:00:35+05:30\",\"Duration\":23.990278},{\"EndTime\":\"2019-04-06T00:00:00+05:30\",\"StartTime\":\"2019-04-05T00:00:34+05:30\",\"Duration\":23.990555},{\"EndTime\":\"2019-04-06T23:45:36+05:30\",\"StartTime\":\"2019-04-06T00:00:37+05:30\",\"Duration\":23.749722},{\"EndTime\":\"2019-04-08T00:00:00+05:30\",\"StartTime\":\"2019-04-07T00:00:36+05:30\",\"Duration\":23.99},{\"EndTime\":\"2019-04-09T00:00:00+05:30\",\"StartTime\":\"2019-04-08T00:00:37+05:30\",\"Duration\":23.989721},{\"EndTime\":\"2019-04-10T00:00:00+05:30\",\"StartTime\":\"2019-04-09T00:00:38+05:30\",\"Duration\":23.989445},{\"EndTime\":\"2019-04-10T16:00:36+05:30\",\"StartTime\":\"2019-04-10T00:00:35+05:30\",\"Duration\":16.000278},{\"EndTime\":\"2019-04-12T00:00:00+05:30\",\"StartTime\":\"2019-04-11T16:45:35+05:30\",\"Duration\":7.240278},{\"EndTime\":\"2019-04-13T00:00:00+05:30\",\"StartTime\":\"2019-04-12T00:00:38+05:30\",\"Duration\":23.989445},{\"EndTime\":\"2019-04-14T00:00:00+05:30\",\"StartTime\":\"2019-04-13T00:00:36+05:30\",\"Duration\":23.99},{\"EndTime\":\"2019-04-15T00:00:00+05:30\",\"StartTime\":\"2019-04-14T00:00:36+05:30\",\"Duration\":23.99},{\"EndTime\":\"2019-04-16T00:00:00+05:30\",\"StartTime\":\"2019-04-15T00:00:39+05:30\",\"Duration\":23.989166}]}],\"EquipmentName\":\"\",\"TotalDuration\":366.59749698638916}]");
        return ResponseEntity.ok(json);
    }		
}
