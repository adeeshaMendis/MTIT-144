package com.assignment.MTIT144.paymentservice.dto;


public class paymentResponse implements response{
    private String orderId;
    private String payID;
    private String messsage;

      /*
    Getters and setters created for the private attributes
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public String getPayID() {
        return payID;
    }

    public void setPayID(String payID) {
        this.payID = payID;
    }


}
