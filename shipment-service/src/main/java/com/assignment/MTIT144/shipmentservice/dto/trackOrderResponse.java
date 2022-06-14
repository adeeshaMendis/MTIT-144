package com.assignment.MTIT144.shipmentservice.dto;

public class trackOrderResponse {
    private String trackOrderId;
    private String message;
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
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "trackOrderResponse [trackOrderId=" + trackOrderId + ", message=" + message + "]";
	}
}
