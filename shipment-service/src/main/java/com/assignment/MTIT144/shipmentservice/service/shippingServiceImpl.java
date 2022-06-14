package com.assignment.MTIT144.shipmentservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.MTIT144.shipmentservice.dto.shipmentRequest;
import com.assignment.MTIT144.shipmentservice.dto.shipmentResponse;
import com.assignment.MTIT144.shipmentservice.dto.trackOrderRequest;
import com.assignment.MTIT144.shipmentservice.dto.trackOrderResponse;

@Service
public class shippingServiceImpl {

    @Autowired
    private RestTemplate restTemplate;
    
    public shipmentResponse createShipment(shipmentRequest shipmentRequest) {
    	var trackOrderRequest = new trackOrderRequest();
    	trackOrderRequest.setReciptId(shipmentRequest.getReciptId());
    	trackOrderRequest.setDescription(shipmentRequest.getDescription());
    	trackOrderRequest.setExpectedDate(shipmentRequest.getExpectedDate());
    	trackOrderRequest.setStatus(shipmentRequest.getStatus());
    	
    	  ResponseEntity<trackOrderResponse> trackOrderResponse= restTemplate.postForEntity("http://localhost:8093/trackOrders",trackOrderRequest, trackOrderResponse.class);

    	  var shipmentResponse = new shipmentResponse();
    	  
    	  shipmentResponse.setMesssage("shipment made successfully");
          shipmentResponse.setShipmentId(UUID.randomUUID().toString());
          shipmentResponse.setTrackOrderId(trackOrderResponse.getBody().getTrackOrderId());
          
          return shipmentResponse;
    	
    }
    
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
