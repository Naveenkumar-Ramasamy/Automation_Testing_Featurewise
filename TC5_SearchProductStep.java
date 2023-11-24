package com.omrbranch.step;

import java.util.ArrayList;
import java.util.List;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.payload.serach.SerachPayLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TC5_SearchProductStep extends BaseClass {
	static SerachPayLoad serachPayLoad=new SerachPayLoad();
	Response response;
	

	@Given("User should add header  for accessing serach endpoint")
	public void userShouldAddHeaderForAccessingSerachEndpoint() {
		List<Header> listHeaders=new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Content-Type","application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers header=new Headers(listHeaders);
		addHeaders(header);
		
	   
	}
	@When("User should add request body for serach products {string}")
	public void userShouldAddRequestBodyForSerachProducts(String product) {
		addBody(serachPayLoad.serachProductPayLoad(product));   
	}
	@When("User should send {string} request for serach products end point")
	public void userShouldSendRequestForSerachProductsEndPoint(String reqType) {
	 response = addReqType(reqType,EndPoints.SERACHPRODUCT);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);

	    
	}
	




	




}
