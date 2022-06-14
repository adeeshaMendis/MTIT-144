package com.assignment.MTIT144.productservice.controller;

import org.springframework.web.bind.annotation.*;

import com.assignment.MTIT144.productservice.dto.ProductRequest;
import com.assignment.MTIT144.productservice.dto.ProductResponse;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ProductResponse CreateProduct(@RequestBody ProductRequest productRequest){

        System.out.println("The Created Product is : " + productRequest);

        var productResponse = new ProductResponse();
        productResponse.setProductId(UUID.randomUUID().toString());
        productResponse.setMessage("The Product has been created Successfully");
        return productResponse;
    }
}
