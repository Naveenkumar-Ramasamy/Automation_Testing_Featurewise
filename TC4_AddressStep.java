package com.omrbranch.step;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;


import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.EndPoints;

import com.omrbranch.payload.address.AddressPayLoad;
import com.omrbranch.pojo.address.AddAddress_Output_Pojo;
import com.omrbranch.pojo.address.DeleteUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.GetUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Output_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TC4_AddressStep extends BaseClass {
	static AddressPayLoad addressPayLoad=new AddressPayLoad();
	String addressid;
	Response response;
	

//Verify add user address to the application through api
	@Given("User should add header and bearer authorization for accessing address endpoint")
	public void userShouldAddHeaderAndBearerAuthorizationForAccessingAddressEndpoint() {
		//1.add address
				List<Header> listHeaders=new ArrayList<>();
				Header h1=new Header("accept", "application/json");
				Header h2=new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
				Header h3=new Header("Content-Type", "application/json");
				listHeaders.add(h1);
				listHeaders.add(h2);
				listHeaders.add(h3);
				Headers header=new Headers(listHeaders);
				addHeaders(header);
				   
	     
	}
	
	
	@When("User should add request body for new address {string},{string},{string},{string},{int} {int} {int},{string},{string} and {string}")
	public void userShouldAddRequestBodyForNewAddressAnd(String first_name, String last_name, String mobile, String apartment, int state,
			int city, int country, String zipcode, String address, String address_type) {
		addBody(addressPayLoad.addAddressPayLoad(first_name, last_name, mobile, apartment, TC1_LoginStep.globalDatas.getStateId(), TC1_LoginStep.globalDatas.getCityId(), country, zipcode, address, address_type));
	}
	@When("User should send {string} request for addUserAddress end point")
	public void userShouldSendRequestForAddUserAddressEndPoint(String reqType) {
	 response = addReqType(reqType, EndPoints.ADDUSERADDRESS);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	     
	}
	@Then("User should verify the addUserAddress response message matches {string}")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatches(String expAddressMgs) {
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		
		AddAddress_Output_Pojo address_Output_Pojo=response.as(AddAddress_Output_Pojo.class);
		String message = address_Output_Pojo.getMessage();
		Assert.assertEquals("verify Address added successfully",expAddressMgs,message );
	     
	     
	}

	
//Verify update user address to the application through api
	@Given("User should add header and bearer authorization for accessing update address endpoint")
	public void userShouldAddHeaderAndBearerAuthorizationForAccessingUpdateAddressEndpoint() {
		List<Header> listHeaders=new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		Header h3=new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers header=new Headers(listHeaders);
		addHeaders(header);
		  
	     
	}
	
	@When("User should add request body for update old address {string}, {string},{string},{string},{string},{int} {int} {int},{string},{string} and {string}")
	public void userShouldAddRequestBodyForUpdateOldAddressAnd(String address_id, String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		addBody(addressPayLoad.updateAddressPayLoad(address_id, first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type));
	}

	@When("User should send {string} request for updateUserAddress end point")
	public void userShouldSendRequestForUpdateUserAddressEndPoint(String reqType) {
		response = addReqType(reqType, EndPoints.UPDATEUSERADDRESS);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	     
	     
	}
	@Then("User should verify the updateUserAddress response message matches {string}")
	public void userShouldVerifyTheUpdateUserAddressResponseMessageMatches(String expUpdateAddressMgs) {
		ResponseBody body = response.getBody();
		String prettyString = body.asPrettyString();
		System.out.println(prettyString);
		
		UpdateUserAddress_Output_pojo updateUserAdress_Output_pojo = response.as(UpdateUserAddress_Output_pojo.class);
		String message = updateUserAdress_Output_pojo.getMessage();
		System.out.println(message);
		Assert.assertEquals("verify Address update successfully",expUpdateAddressMgs,message );
	     
	}

	
//Verify get all user address to the application through api
	@Given("User should add header for accessing get all address endpoint")
	public void userShouldAddHeaderForAccessingGetAllAddressEndpoint() {
		List<Header> listHeaders=new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers header=new Headers(listHeaders);
		addHeaders(header);
		
	     
	     
	}
	@Given("User should send {string} request for getAllUserAddress end point")
	public void userShouldSendRequestForGetAllUserAddressEndPoint(String reqType) {
		 response = addReqType(reqType,EndPoints.GETUSERADDRESS);
		int statusCode = getStatusCode(response); 
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	     
	}
	@Then("User should verify the getAllUserAddress response message matches {string}")
	public void userShouldVerifyTheGetAllUserAddressResponseMessageMatches(String okMgs) {
		GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
		String message = getUserAddress_Output_Pojo.getMessage();
		System.out.println(message);
		Assert.assertEquals("verify OK",okMgs,message );
	     
	     
	}

//Verify delete user address to the application through api

	@Given("User should add header and bearer authorization for accessing get all address endpoint")
	public void userShouldAddHeaderAndBearerAuthorizationForAccessingGetAllAddressEndpoint() {
		List<Header> listHeaders=new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		Header h3=new Header("Content-Type", "application/json");
		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers header=new Headers(listHeaders);
		addHeaders(header);
		
	     
	}
	@When("User should delete request body for delete address {string}")
	public void userShouldDeleteRequestBodyForDeleteAddress(String addressid) {
		addBody(addressPayLoad.deletePayLoad(addressid));
	     
	}
	@When("User should send {string} request for deleteUserAddress end point")
	public void userShouldSendRequestForDeleteUserAddressEndPoint(String reqType) {
		 response = addReqType(reqType,EndPoints.DELETEADDRESS);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	     
	}
	@Then("User should verify the deleteUserAddress response message matches {string}")
	public void userShouldVerifyTheDeleteUserAddressResponseMessageMatches(String okMgs) {
		DeleteUserAddress_Output_Pojo deleteUserAddress_Output_Pojo = response.as(DeleteUserAddress_Output_Pojo.class);
		String message = deleteUserAddress_Output_Pojo.getMessage();
		Assert.assertEquals("verify OK", okMgs,message); 
	     
	}




	



	

	




}
