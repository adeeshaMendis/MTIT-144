package com.assignment.MTIT64.trackOrderservice.controller;

import com.assignment.MTIT64.trackOrderservice.dto.TrackOrderRequest;
import com.assignment.MTIT64.trackOrderservice.dto.TrackOrderResponse;
import org.springframework.web.bind.annotation.*;

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
    //post request annotation- consumes and produces a json type of an application body
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody TrackOrderResponse createTrackOrder(@RequestBody TrackOrderRequest trackOrderRequest){

        System.out.println("Track Order Details: " +trackOrderRequest);

        var trackOrderResponse = new TrackOrderResponse();

        //crete unique identifier and returning as delivery Id
        trackOrderResponse.setTrackOrderId(UUID.randomUUID().toString());

        //Setting the message to success
        trackOrderResponse.setMessage("Successfully Track the order delivery");

        //returning the object created
        return trackOrderResponse;
    }
}
