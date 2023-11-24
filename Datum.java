package com.omrbranch.pojo.address;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {
	 public int id;
	    public String address_code;
	    public int user_id;
	    public String first_name;
	    public String last_name;
	    public String mobile;
	    public String apartment;
	    public String address;
	    public int country_id;
	    public int state_id;
	    public int city_id;
	    public String zipcode;
	    public Object lat;
	    public Object lng;
	    @JsonProperty("default") 
	    public int mydefault;
	    public String status;
	    public String address_type;
	    public String created_at;
	    public String updated_at;
	    public String city;
	    public String state;
	    public String country;
	    public int is_selected;
		public int getId() {
			return id;
		}
		public String getAddress_code() {
			return address_code;
		}
		public int getUser_id() {
			return user_id;
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
		public String getAddress() {
			return address;
		}
		public int getCountry_id() {
			return country_id;
		}
		public int getState_id() {
			return state_id;
		}
		public int getCity_id() {
			return city_id;
		}
		public String getZipcode() {
			return zipcode;
		}
		public Object getLat() {
			return lat;
		}
		public Object getLng() {
			return lng;
		}
		public int getMydefault() {
			return mydefault;
		}
		public String getStatus() {
			return status;
		}
		public String getAddress_type() {
			return address_type;
		}
		public String getCreated_at() {
			return created_at;
		}
		public String getUpdated_at() {
			return updated_at;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String getCountry() {
			return country;
		}
		public int getIs_selected() {
			return is_selected;
		}


}
