package com.omrbranch.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	static RequestSpecification reqspec;
	static Response res;
	
	
	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
		Object o = p.get(key);
		String v = (String) o;
		System.out.println(v);
		return v;
	}
	public void addHeader(String key, String value) {
		reqspec = RestAssured.given().header(key,value);
	    
	}
	
	public void addHeaders(Headers headers) {
		reqspec=RestAssured.given().headers(headers);
	}
	
	public void addBasicAuth(String username, String password) {
		reqspec = reqspec.auth().preemptive().basic(username, password);

	}
	public void addPathParam(String key, String value) {
		reqspec  = reqspec.pathParam(key, value);

	}
	
	public void addQueryParam(String key, String value) {
		reqspec  =reqspec.queryParam(key, value);
	
	}
	
	public void addBody(Object body) {
		reqspec  =reqspec.body(body);
		
	}
	public Response addReqType(String reqType, String endpoint) {
		switch (reqType) {
		case "GET":
		    res = reqspec.get(endpoint);
			break;
		case "POST":
		    res = reqspec.post(endpoint);
			break;
		case "PUT":
		    res = reqspec.put(endpoint);
			break;
		case "PATCH":
		    res = reqspec.patch(endpoint);
			break;
		case "DELETE":
		    res = reqspec.delete(endpoint);
			break;

		default:
			break;
		}
		return res;
	}
	
	public int getStatusCode(Response element) {
		int statusCode = element.getStatusCode();
		return statusCode;

	}
	public String getResBodyAsString(Response element) {
		String asString = element.asPrettyString();
		return asString;
		
	}
	public String getResBodyAsPrettyString(Response element) {
		String asPrettyString = element.asPrettyString();
		return asPrettyString;
		
	}


}
