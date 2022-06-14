package com.assignment.MTIT144.inventoryservice.dto;

public class inventoryResponse implements response{
    private String inventoryId;
    private String productID;
    private String messsage;
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	@Override
	public String toString() {
		return "inventoryResponse [inventoryId=" + inventoryId + ", productID=" + productID + ", messsage=" + messsage
				+ "]";
	}
	
	
}
