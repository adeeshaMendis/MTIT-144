package com.assignment.MTIT144.inventoryservice.dto;

public class inventoryRequest {
    private String name,category,qty,make;

    public inventoryRequest() {

    }
    
	public inventoryRequest(String name, String category, String qty, String make) {
		super();
		this.name = name;
		this.category = category;
		this.qty = qty;
		this.make = make;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "inventoryResponse [name=" + name + ", category=" + category + ", qty=" + qty + ", make=" + make + "]";
	}
}
