package com.omrbranch.pojo.address;

public class UpdateUserAddress_Input_pojo {
	public String address_id;
    public String first_name;
    public String last_name;
    public String mobile;
    public String apartment;
    public int state;
    public int city;
    public int country;
    public String zipcode;
    public String address;
    public String address_type;
    
    
	public UpdateUserAddress_Input_pojo(String address_id, String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		super();
		this.address_id = address_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
		this.apartment = apartment;
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.address = address;
		this.address_type = address_type;
	}
	public String getAddress_id() {
		return address_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getMobile() {
		return mobile;
	}
	public String getApartment() {
		return apartment;
	}
	public int getState() {
		return state;
	}
	public int getCity() {
		return city;
	}
	public int getCountry() {
		return country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getAddress() {
		return address;
	}
	public String getAddress_type() {
		return address_type;
	}


}
