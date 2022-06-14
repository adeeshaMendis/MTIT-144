package com.assignment.MTIT144.paymentservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assignment.MTIT144.paymentservice.dto.errorResponse;
import com.assignment.MTIT144.paymentservice.dto.paymentRequest;
import com.assignment.MTIT144.paymentservice.dto.paymentResponse;
import com.assignment.MTIT144.paymentservice.dto.response;
import com.assignment.MTIT144.paymentservice.service.paymentServiceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/payment")
public class paymentController {
	private List<paymentRequest> paymentList = new ArrayList<>(Arrays.asList(

            new paymentRequest("visa",null, 200.00,"1", "10", "colombo","+94718263205",""),
            new paymentRequest("master", null, 0, "2", "20","nolimit", "+94718142650", ""),
            new paymentRequest("frimi", null, 0, "3", "30","emerald", "+94726598036", "")

    ));
    /**
     * Method to find average
     * @param request- Parametre accepts type payment request
     */

    @Autowired
    private paymentServiceImpl paymentService;

//For inserting data
    
    @PostMapping(consumes="application/json",produces="application/json")
    public @ResponseBody response createPayment(@RequestBody paymentRequest request){

       
        if(request.getPayType().equals("")||request.getPayDate().equals("")||request.getProductID().equals("") || request.getQuantity().equals("") || request.getAmount()<0)
        {
            //returns type error response
            var paymentResponse = new errorResponse();
            paymentResponse.setMesssage("Please fill all details");
            return paymentResponse;
        }else{

            System.out.println("Payment Details:-"+request);

      
            var paymentResponse = new paymentResponse();
            paymentResponse.setOrderId(UUID.randomUUID().toString());
            paymentResponse.setMesssage("Successfully made payment");
    
            return paymentService.createPayment(request);
        }




    }
    
    
    //For retrieving data
    @GetMapping(consumes="application/json",produces="application/json")
    public @ResponseBody paymentRequest returnPayment(@RequestParam(required = false) String id) {

    	
    	return paymentList.stream().filter(payment->payment.getProductID().equals(id)).findFirst().get();
    	
    }
    
    //for deleting data
    @DeleteMapping(consumes="application/json",produces="application/json")
    public @ResponseBody String delPayment(@RequestParam(required = false) String id) {

    	
    	 paymentList.removeIf(payment->payment.getProductID().equals(id));
    	 
    	 return "successfully deleted";
    	
    }
    
    //for updating data
    @PutMapping(consumes="application/json",produces="application/json")
public @ResponseBody String paymentupdateRequest(@RequestParam(required = false) String id,@RequestBody paymentRequest request) {

    	int counter=0;
    	for(paymentRequest paymentrequest:paymentList) {
    		if (paymentrequest.getProductID().equals(id)) {
    			paymentList.set(counter, request);
    		}
    		counter++;
    	}
    	
    	return "successfully updated";
    }
    
}
