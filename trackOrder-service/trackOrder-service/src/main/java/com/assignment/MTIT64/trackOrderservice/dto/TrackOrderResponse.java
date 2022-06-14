package com.assignment.MTIT64.trackOrderservice.dto;

public class TrackOrderResponse {
    private String trackOrderId;
    private String message;

    /**
     * Getter Setter methods for TrackOrderResponse
     **/
    public String getTrackOrderId() {
        return trackOrderId;
    }

    public void setTrackOrderId(String trackOrderId) {
        this.trackOrderId = trackOrderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
