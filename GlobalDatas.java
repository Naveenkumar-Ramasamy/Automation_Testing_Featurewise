package com.omrbranch.globaldata;

public class GlobalDatas {
	private int statusCode;
	private String logtoken;
	private String addressId;
	private String stateIdText;
	private int stateId;
	private	int cityId;
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public void setLogtoken(String logtoken) {
		this.logtoken = logtoken;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
	public void setStateIdText(String stateIdText) {
		this.stateIdText = stateIdText;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public String getLogtoken() {
		return logtoken;
	}
	public String getAddressId() {
		return addressId;
	}
	
	public String getStateIdText() {
		return stateIdText;
	}
	public int getStateId() {
		return stateId;
	}
	public int getCityId() {
		return cityId;
	}



}
