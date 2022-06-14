package com.assignment.MTIT144.shipmentservice.dto;

public class shipmentResponse implements response {
    private String shipmentId;
    private String messsage;;
    private String trackOrderId;
	/**
	 * @return the shipmentId
	 */
	public String getShipmentId() {
		return shipmentId;
	}
	/**
	 * @param shipmentId the shipmentId to set
	 */
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	
	/**
	 * @return the messsage
	 */
	public String getMesssage() {
		return messsage;
	}
	/**
	 * @param messsage the messsage to set
	 */
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	/**
	 * @return the trackOrderId
	 */
	public String getTrackOrderId() {
		return trackOrderId;
	}
	/**
	 * @param trackOrderId the trackOrderId to set
	 */
	public void setTrackOrderId(String trackOrderId) {
		this.trackOrderId = trackOrderId;
	}
}
