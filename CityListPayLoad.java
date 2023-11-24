package com.omrbranch.payload.citylist;

import com.omrbranch.pojo.citylist.CityList_Input_Pojo;

public class CityListPayLoad {
	public CityList_Input_Pojo cityListPayLoad(String stateId) {
		CityList_Input_Pojo cityList_Input_Pojo=new CityList_Input_Pojo(stateId);
		return cityList_Input_Pojo;
		

	}
	


}
