package com.omrbranch.step;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.omrbranch.base.BaseClass;

import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.payload.address.AddressPayLoad;
import com.omrbranch.payload.citylist.CityListPayLoad;
import com.omrbranch.pojo.citylist.CityList_Input_Pojo;
import com.omrbranch.pojo.citylist.CityList_Output_Pojo;
import com.omrbranch.pojo.citylist.Datum;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC3_CityListStep extends BaseClass {
	CityListPayLoad cityPayLoad=new CityListPayLoad();
	CityList_Output_Pojo list_Output_Pojo=new CityList_Output_Pojo();
	Response response;
	int cityId;

	@Given("User should add headers for cityList")
	public void userShouldAddHeadersForCityList() {
		List<Header> listHeaders=new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers header=new Headers(listHeaders);
		addHeaders(header);
	}
	

	@When("User should add request body state id")
	public void userShouldAddRequestBodyStateId() {
		
		addBody(cityPayLoad.cityListPayLoad(TC1_LoginStep.globalDatas.getStateIdText()));  
	}
	@When("User should send {string} request for cityList endpoint")
	public void userShouldSendRequestForCityListEndpoint(String reqType) {
		response = addReqType(reqType,EndPoints.CITYLIST);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the cityList response message matches {string} and saved city id")
	public void userShouldVerifyTheCityListResponseMessageMatchesAndSavedCityId(String expCityName) {
		CityList_Output_Pojo cityList_Output_Pojo = response.as(CityList_Output_Pojo.class);
		//find the city id by cityName
		ArrayList<Datum> data = cityList_Output_Pojo.getData();
		for (Datum datum : data) {
			String cityName = datum.getName();
			//System.out.println(cityName);
			cityId = datum.getId();
			//System.out.println(cityId);
			TC1_LoginStep.globalDatas.setCityId(cityId);
			String cityIdText = String.valueOf(cityId);
			if (cityName.equals(cityIdText)) {
				System.out.println(cityId);
				Assert.assertEquals("Verify Cityname", expCityName,cityIdText);
				break;
				
			}
			
		}
		
	    
	}





	
}
