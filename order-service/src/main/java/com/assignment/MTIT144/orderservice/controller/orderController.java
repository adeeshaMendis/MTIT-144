package com.assignment.MTIT144.orderservice.controller;

import org.springframework.web.bind.annotation.*;

import com.assignment.MTIT144.orderservice.dto.orderRequest;
import com.assignment.MTIT144.orderservice.dto.orderResponse;

import java.util.UUID;

@RestController
@RequestMapping("/order")


public class orderController {

    /**
     * Method to find average
     * @param request- Parametre accepts type order request
     */

    @PostMapping(consumes="application/json",produces="application/json")
    //This is the response body for the order which return json output of type order response
    public @ResponseBody
    orderResponse createOrder(@RequestBody orderRequest request){

        System.out.println("Payment Details"+request);

        var orderResponse = new orderResponse();
        //Sets order details
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setMesssage("Successfully made order");

        return orderResponse;
    }
}
