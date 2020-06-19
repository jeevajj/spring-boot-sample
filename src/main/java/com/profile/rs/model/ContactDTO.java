package com.profile.rs.model;

public class ContactDTO {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private int pincode;
	private int contactNumber;

	public ContactDTO() {
	}

	public ContactDTO(String addressLine1, String addressLine2, String city, String country, int pincode, int contactNumber) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.contactNumber = contactNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public ContactDTO setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public ContactDTO setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public String getCity() {
		return city;
	}

	public ContactDTO setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public ContactDTO setCountry(String country) {
		this.country = country;
		return this;
	}

	public int getPincode() {
		return pincode;
	}

	public ContactDTO setPincode(int pincode) {
		this.pincode = pincode;
		return this;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public ContactDTO setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

}
