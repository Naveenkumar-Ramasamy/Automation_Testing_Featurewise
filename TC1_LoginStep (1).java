package com.omrbranch.step;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.globaldata.GlobalDatas;
import com.omrbranch.pojo.login.Login_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass {
	Response response;
	static String logtoken;
	
	static GlobalDatas globalDatas=new GlobalDatas();


	@Given("User should add header")
	public void userShouldAddHeader() {
		addHeader("accept", "application/json");
	}
	@When("User should add basic authentication for login")
	public void userShouldAddBasicAuthenticationForLogin() throws FileNotFoundException, IOException {
		addBasicAuth(getPropertyFileValue("username"),getPropertyFileValue("password") );

	}
	@When("User should send {string} request for login endpoint")
	public void userShouldSendRequestForLoginEndpoint(String reqType) {
		 response = addReqType(reqType,EndPoints.POSTMANBASICAUTHLOGIN );
		 String resBodyAsPrettyString = getResBodyAsPrettyString(response);
			System.out.println(resBodyAsPrettyString);

		int statusCode = getStatusCode(response);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);

	}
		@Then("User should verify the login response body firstName present as {string} and get the logtoken saved")
	public void userShouldVerifyTheLoginResponseBodyFirstNamePresentAsAndGetTheLogtokenSaved(String expFirstName) {
			Login_Output_Pojo login_Output_Pojo=response.as(Login_Output_Pojo.class);
			String firstName = login_Output_Pojo.getData().getFirst_name();
			System.out.println(firstName);
			logtoken = login_Output_Pojo.getData().getLogtoken();
			TC1_LoginStep.globalDatas.setLogtoken(logtoken);
			//System.out.println(logtoken);
			org.junit.Assert.assertEquals("Verify firstname", expFirstName,firstName);
			

	}




}
