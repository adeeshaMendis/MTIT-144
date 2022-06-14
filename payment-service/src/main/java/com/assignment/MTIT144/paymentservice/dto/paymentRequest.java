package com.assignment.MTIT144.paymentservice.dto;

import java.util.Date;


public class paymentRequest {
    private String payType;
    private Date payDate;
    private double amount;
    private String productID;
    private String quantity;
    private String address;
    private String phone_no;

    private String payDetails;
    
    public paymentRequest() {
    	
    }

    public paymentRequest(String payType, Date payDate, double amount, String productID, String quantity,
			String address, String phone_no, String payDetails) {
		super();
		this.payType = payType;
		this.payDate = payDate;
		this.amount = amount;
		this.productID = productID;
		this.quantity = quantity;
		this.address = address;
		this.phone_no = phone_no;
		this.payDetails = payDetails;
	}

	/*
    Getters and setters created for the private attributes
     */
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getPayDetails() {
        return payDetails;
    }

    public void setPayDetails(String payDetails) {
        this.payDetails = payDetails;
    }

    @Override
    public String toString() {
        return "paymentRequest{" +
                "payType='" + payType + '\'' +
                ", payDate=" + payDate +
                ", amount=" + amount +
                ", productID='" + productID + '\'' +
                ", quantity='" + quantity + '\'' +
                ", address='" + address + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", payDetails='" + payDetails + '\'' +
                '}';
    }
}
