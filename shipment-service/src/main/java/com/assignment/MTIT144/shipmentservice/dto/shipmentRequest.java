package com.assignment.MTIT144.shipmentservice.dto;

public class shipmentRequest {
    private String recipientName;
    private String deliveryAddress;
    private String expectedDate;
    private String expectedTime;
    private String orderID;
    private String reciptId;
    private String deliveryType;
    private String status;
    private String description;
    
//    public shipmentRequest() {
//    	
//    }
//    
    
	public shipmentRequest(String recipientName, String deliveryAddress, String expectedDate, String expectedTime,
			String orderID, String reciptId, String deliveryType, String status, String description) {
		super();
		this.recipientName = recipientName;
		this.deliveryAddress = deliveryAddress;
		this.expectedDate = expectedDate;
		this.expectedTime = expectedTime;
		this.orderID = orderID;
		this.reciptId = reciptId;
		this.deliveryType = deliveryType;
		this.status = status;
		this.description = description;
	}
	/**
	 * @return the recipientName
	 */
    
    
	public String getRecipientName() {
		return recipientName;
	}
	/**
	 * @param recipientName the recipientName to set
	 */
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	/**
	 * @return the expectedDate
	 */
	public String getExpectedDate() {
		return expectedDate;
	}
	/**
	 * @param expectedDate the expectedDate to set
	 */
	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}
	/**
	 * @return the expectedTime
	 */
	public String getExpectedTime() {
		return expectedTime;
	}
	/**
	 * @param expectedTime the expectedTime to set
	 */
	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}
	/**
	 * @return the orderID
	 */
	public String getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the reciptId
	 */
	public String getReciptId() {
		return reciptId;
	}
	/**
	 * @param reciptId the reciptId to set
	 */
	public void setReciptId(String reciptId) {
		this.reciptId = reciptId;
	}
	/**
	 * @return the deliveryType
	 */
	public String getDeliveryType() {
		return deliveryType;
	}
	/**
	 * @param deliveryType the deliveryType to set
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "shipmentRequest [recipientName=" + recipientName + ", deliveryAddress=" + deliveryAddress
				+ ", expectedDate=" + expectedDate + ", expectedTime=" + expectedTime + ", orderID=" + orderID
				+ ", reciptId=" + reciptId + ", deliveryType=" + deliveryType + ", status=" + status + ", description="
				+ description + "]";
	}
}
