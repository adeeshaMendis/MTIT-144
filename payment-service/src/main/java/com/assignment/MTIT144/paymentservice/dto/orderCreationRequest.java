package com.assignment.MTIT144.paymentservice.dto;


public class orderCreationRequest {

    private String productID;
    private double amount;
    private String quantity;
    private String address;
    private String phone_no;

    /*
  Getters and setters created for the private attributes
   */
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return "orderRequest{" +
                "productID='" + productID + '\'' +
                ", amount=" + amount +
                ", quantity='" + quantity + '\'' +
                ", address='" + address + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}
