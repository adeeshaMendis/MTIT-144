package com.assignment.MTIT144.shipmentservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.MTIT144.shipmentservice.dto.response;
import com.assignment.MTIT144.shipmentservice.ShipmentServiceApplication;
import com.assignment.MTIT144.shipmentservice.dto.shipmentRequest;
import com.assignment.MTIT144.shipmentservice.dto.shipmentResponse;
import com.assignment.MTIT144.shipmentservice.service.shippingServiceImpl;



@RestController
@RequestMapping("/shipping")
public class shipmentController {
	
	
	private List<shipmentRequest> shipmentList = new ArrayList<>(Arrays.asList(

            new shipmentRequest("john", "kandy", "28 june 2022", "11.00am", "1","1", "postal", "pending","test desc"),
            new shipmentRequest("peter", "galle", "29 june 2022", "1.00pm", "3","3", "online", "dispatched","test desc"),
            new shipmentRequest("joseph", "colombo", "30 june 2022", "7.00pm", "2","2", "shipping", "canceled","test desc")

    ));
	
	@Autowired
	private shippingServiceImpl shippingserviceimpl;
	//for inserting data
    @PostMapping(consumes="application/json",produces="application/json")
    public @ResponseBody response createShipment(@RequestBody shipmentRequest request){

    	var shipmentResponse = new shipmentResponse();
    	
    	shipmentResponse.setMesssage("successfully made shipment");
    	shipmentResponse.setTrackOrderId(UUID.randomUUID().toString());
    	 
    	return shippingserviceimpl.createShipment(request);
    }
    
    
    //for retrieving data
    @GetMapping(consumes="application/json",produces="application/json")
    public @ResponseBody shipmentRequest returnShipment(@RequestParam(required = false) String id) {

    	
    	return shipmentList.stream().filter(shipment->shipment.getOrderID().equals(id)).findFirst().get();
    	
    }
    
    //for deleting data
    @DeleteMapping(consumes="application/json",produces="application/json")
    public @ResponseBody String delShipment(@RequestParam(required = false) String id) {

    	
    	shipmentList.removeIf(shipment->shipment.getOrderID().equals(id));
    	 
    	 return "successfully deleted";
    	
    }
    
    //for updating data
    @PutMapping(consumes="application/json",produces="application/json")
public @ResponseBody String shipmentupdateRequest(@RequestParam(required = false) String id,@RequestBody shipmentRequest request) {

    	int counter=0;
    	for(shipmentRequest shipmentrequest:shipmentList) {
    		if (shipmentrequest.getOrderID().equals(id)) {
    			shipmentList.set(counter, request);
    		}
    		counter++;
    	}
    	
    	return "successfully updated";
    }

}
