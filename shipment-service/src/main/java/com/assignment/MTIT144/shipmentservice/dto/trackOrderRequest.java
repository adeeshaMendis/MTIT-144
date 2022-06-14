package com.assignment.MTIT144.shipmentservice.dto;

public class trackOrderRequest {
    private String reciptId;
    private String status;
    private String expectedDate;
    private String description;
	@Override
	public String toString() {
		return "trackOrderRequest [reciptId=" + reciptId + ", status=" + status + ", expectedDate=" + expectedDate
				+ ", description=" + description + "]";
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
}
