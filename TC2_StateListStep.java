package com.omrbranch.step;

import java.util.ArrayList;

import org.testng.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.EndPoints;
import com.omrbranch.pojo.statelist.Datum;
import com.omrbranch.pojo.statelist.GetStateList_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_StateListStep extends BaseClass {
	Response response;
	int stateId;

	@Given("User should add headers for stateList")
	public void userShouldAddHeadersForStateList() {
		addHeader("accept", "application/json");    
	}
	@When("User should send {string} request for stateList endpoint")
	public void userShouldSendRequestForStateListEndpoint(String reqType) {
response = addReqType(reqType,EndPoints.STATELIST);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	
	@Then("User should verify the stateList response message matches {string} and saved state id")
	public void userShouldVerifyTheStateListResponseMessageMatchesAndSavedStateId(String expStateName) {
		GetStateList_Output_Pojo stateList_Output_Pojo = response.as(GetStateList_Output_Pojo.class);
		// find the state id for tamil nadu
		ArrayList<Datum> data = stateList_Output_Pojo.getData();
		
		//iterate all statelist
		for (Datum datum : data) {
			String stateName = datum.getName();
			stateId = datum.getId();
			//System.out.println(stateName);
			//System.out.println(stateId);
			TC1_LoginStep.globalDatas.setStateId(stateId);
			String stateIdText = String.valueOf(stateId);
			TC1_LoginStep.globalDatas.setStateIdText(stateIdText);
			if (stateName.equals(stateIdText)) {
				System.out.println(stateIdText);
				org.junit.Assert.assertEquals("Verify statename", expStateName,stateIdText);
				break;
				
			}
				
		}
		
	
		
		
	}




	


}
