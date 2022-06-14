package com.assignment.MTIT144.productservice.dto;



public class ProductResponse {

    private String message, productId;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public String getProductId() {
        return productId;
    }
}
