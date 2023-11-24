package com.omrbranch.payload.serach;

import com.omrbranch.pojo.product.Serach_Input_pojo;

public class SerachPayLoad {
	public Serach_Input_pojo serachProductPayLoad(String product) {
		Serach_Input_pojo input_pojo=new Serach_Input_pojo(product);
		return input_pojo;
		
		

	}
	
}
