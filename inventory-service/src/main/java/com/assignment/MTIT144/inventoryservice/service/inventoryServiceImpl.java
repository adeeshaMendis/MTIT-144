package com.assignment.MTIT144.inventoryservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.MTIT144.inventoryservice.dto.inventoryRequest;
import com.assignment.MTIT144.inventoryservice.dto.inventoryResponse;
import com.assignment.MTIT144.inventoryservice.dto.productCreationRequest;
import com.assignment.MTIT144.inventoryservice.dto.productCreationResponse;

@Service
public class inventoryServiceImpl {

    @Autowired
    private RestTemplate restTemplate;
    
    public inventoryResponse createInventory(inventoryRequest inventoryRequest ) {
    	System.out.print("hello");
    	var productCreationRequest = new productCreationRequest();
    	

    	productCreationRequest.setCategory(inventoryRequest.getCategory());

    	productCreationRequest.setName(inventoryRequest.getName());


        ResponseEntity<productCreationResponse> productCreationResponse = restTemplate.postForEntity("http://localhost:8073/products",productCreationRequest, productCreationResponse.class);
        
        var inventoryResponse = new inventoryResponse();
        inventoryResponse.setProductID(productCreationResponse.getBody().getProductId());
        inventoryResponse.setInventoryId(UUID.randomUUID().toString());
        inventoryResponse.setMesssage("successfully created inventory");
        
        return inventoryResponse; 

    }
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
