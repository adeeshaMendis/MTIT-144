package com.assignment.MTIT144.trackOrderservice.dto;

public class TrackOrderRequest {
    private String reciptId;
    private String status;
    private String expectedDate;
    private String expectedTime;
    private String description;
	public String getReciptId() {
		return reciptId;
	}
	public void setReciptId(String reciptId) {
		this.reciptId = reciptId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}
	public String getExpectedTime() {
		return expectedTime;
	}
	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TrackOrderRequest [reciptId=" + reciptId + ", status=" + status + ", expectedDate=" + expectedDate
				+ ", expectedTime=" + expectedTime + ", description=" + description + "]";
	}
    
    

}
