package com.assignment.MTIT144.paymentservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.MTIT144.paymentservice.dto.orderCreationRequest;
import com.assignment.MTIT144.paymentservice.dto.orderCreationResponse;
import com.assignment.MTIT144.paymentservice.dto.paymentRequest;
import com.assignment.MTIT144.paymentservice.dto.paymentResponse;

import java.util.UUID;

/**
 * @author IT18194272 M.W Jinadasa
 * This class is for payment service implementation which connects to othe micro service
 */

@Service
public class paymentServiceImpl {

    //autowired to rest template
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Method to find create payment and bind details to order micro service
     * @param paymentRequest- This parameter accept s the payment request details
     */
    public paymentResponse createPayment(paymentRequest paymentRequest){ 
        var orderCreationRequest= new orderCreationRequest();

        //set details to order request from payment request data
        orderCreationRequest.setAmount(paymentRequest.getAmount());
        orderCreationRequest.setAddress(paymentRequest.getAddress());
        orderCreationRequest.setPhone_no(paymentRequest.getPhone_no());
        orderCreationRequest.setProductID(paymentRequest.getProductID());
        orderCreationRequest.setQuantity(paymentRequest.getQuantity());

        //connects to order service rest api endpoint
        ResponseEntity<orderCreationResponse> orderCreationResponse = restTemplate.postForEntity("http://localhost:9182/order",orderCreationRequest, orderCreationResponse.class);

        var paymentResponse = new paymentResponse();
        // sets details to payment response
        paymentResponse.setPayID(UUID.randomUUID().toString());
        paymentResponse.setOrderId(orderCreationResponse.getBody().getOrderId());
        paymentResponse.setMesssage("Successfully made payment");
        // returns type payment response
        return paymentResponse;
    }


    /**
     * Method to find create rest template using rest template builder
     * @param builder- This parameter accepts the type rest template  builder pattern
     */

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
