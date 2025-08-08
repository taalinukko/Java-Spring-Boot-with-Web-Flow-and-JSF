package com.example.demo.models;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class BillingInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}