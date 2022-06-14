package com.assignment.MTIT144.inventoryservice.controller;

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

import com.assignment.MTIT144.inventoryservice.dto.inventoryRequest;
import com.assignment.MTIT144.inventoryservice.dto.inventoryResponse;
import com.assignment.MTIT144.inventoryservice.dto.response;
import com.assignment.MTIT144.inventoryservice.service.inventoryServiceImpl;

@RestController
@RequestMapping("/inventory")
public class inventoryController {
	
	
	private List<inventoryRequest> inventoryList = new ArrayList<>(Arrays.asList(

            new inventoryRequest("shirt", "1", "300","deedat"),
            new inventoryRequest("frock", "2", "500","nolimit"),
            new inventoryRequest("skirt", "3", "200","emerald")

    ));
	 
    @Autowired
	private inventoryServiceImpl inventoryService;
//	For inserting data
    @PostMapping(consumes="application/json",produces="application/json")
    public @ResponseBody response createInventory(@RequestBody inventoryRequest request){
    	
        //returns type  payment response
        var inventoryResponse = new inventoryResponse();
//        System.out.print(request);
        inventoryResponse.setProductID(UUID.randomUUID().toString());
        inventoryResponse.setMesssage("Successfully made inventory");
        // returns type payment response from payment service implementation class
        return inventoryService.createInventory(request);
    }
    //For retrieving data
    @GetMapping(consumes="application/json",produces="application/json")
    public @ResponseBody inventoryRequest returnInventory(@RequestParam(required = false) String id) {

    	
    	return inventoryList.stream().filter(inventory->inventory.getCategory().equals(id)).findFirst().get();
    	
    }
    
    //for deleting data
    @DeleteMapping(consumes="application/json",produces="application/json")
    @ResponseBody
    public String delInventory(@RequestParam(required = false) String id) {

    	
    	 inventoryList.removeIf(inventory->inventory.getCategory().equals(id));
    	 System.out.print(inventoryList);
    	 return "successfully deleted";
    	
    }
    
    //for updating data
    @PutMapping(consumes="application/json",produces="application/json")
public @ResponseBody String inventoryupdateRequest(@RequestParam(required = false) String id,@RequestBody inventoryRequest request) {

    	int counter=0;
    	for(inventoryRequest inventoryrequest:inventoryList) {
    		if (inventoryrequest.getCategory().equals(id)) {
    			inventoryList.set(counter, request);
    		}
    		counter++;
    	}
    	
    	return "successfully updated";
    }
}
