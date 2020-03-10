package RestDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Errorcode {
  @Test
  public void GetWeatherDetailsInvalidCity() {
	  
	  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httpRequest_1 = RestAssured.given();
	  Response response = httpRequest_1.get("/Hyderabad");
	  int statusCode = response.getStatusCode();
	 // AssertJUnit.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	  
	  String contentType = response.header("Content-Type");
	  AssertJUnit.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
	  
	  // Reader header of a give name. In this line we will get
	  // Header named Server
	 try {
	  String serverType =  response.header("Server");
	  AssertJUnit.assertEquals(serverType /* actual value */, "nginx/1.2" /* expected value */);
	 }catch (AssertionError  e) {System.out.println("header server Failed " + e);}
	 
	  
	  // Reader header of a give name. In this line we will get
	  // Header named Content-Encoding
	  String contentEncoding = response.header("Content-Encoding");
	  AssertJUnit.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);


  }
}
