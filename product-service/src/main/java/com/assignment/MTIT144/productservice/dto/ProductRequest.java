package com.assignment.MTIT144.productservice.dto;

public class ProductRequest {

    private String name,category;

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

	@Override
	public String toString() {
		return "ProductRequest [name=" + name + ", category=" + category + "]";
	}





}
