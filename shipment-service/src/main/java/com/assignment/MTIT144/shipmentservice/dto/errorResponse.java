package com.assignment.MTIT144.shipmentservice.dto;

public class errorResponse implements response {
    private String messsage;

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
}
