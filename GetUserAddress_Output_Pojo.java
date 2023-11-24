package com.omrbranch.pojo.address;

import java.util.ArrayList;



public class GetUserAddress_Output_Pojo {
	public int status;
    public String message;
    public ArrayList<Datum> data;
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public ArrayList<Datum> getData() {
		return data;
	}

}
