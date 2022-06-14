package com.assignment.MTIT144.trackOrderservice.controller;

import org.springframework.web.bind.annotation.*;

import com.assignment.MTIT144.trackOrderservice.dto.TrackOrderRequest;
import com.assignment.MTIT144.trackOrderservice.dto.TrackOrderResponse;

/**
 * The type Track Order Controller
 */
import java.util.UUID;

@RestController
@RequestMapping("trackOrders")
public class TrackOrderController {

    /**
     * @param trackOrderRequest
     * @return the trackOrder response
     */

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody TrackOrderResponse createTrackOrder(@RequestBody TrackOrderRequest trackOrderRequest){

        System.out.println("Track Order Details: " +trackOrderRequest);

        var trackOrderResponse = new TrackOrderResponse();

    
        trackOrderResponse.setTrackOrderId(UUID.randomUUID().toString());

    
        trackOrderResponse.setMessage("Successfully Track the order delivery");

       
        return trackOrderResponse;
    }
}
