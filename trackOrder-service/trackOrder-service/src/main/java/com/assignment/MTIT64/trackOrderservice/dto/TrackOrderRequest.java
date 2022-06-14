package com.assignment.MTIT64.trackOrderservice.dto;

public class TrackOrderRequest {
    private String billId;
    private String status;
    private String expectedDate;
    private String description;

    /**
     * Getter Setter methods for TrackOrderRequest
     **/
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Generating string
     **/
    @Override
    public String toString() {
        return "TrackOrderRequest{" +
                "billId='" + billId + '\'' +
                ", Status='" + status + '\'' +
                ", expectedDate='" + expectedDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
