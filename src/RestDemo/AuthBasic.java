package RestDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;




public class AuthBasic {
  @Test
  public void authbasic() {
	  
	  int empid = 15410;
	  
	  RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
	  RequestSpecification request = RestAssured.given();
	  
	  JSONObject requestParams = new JSONObject();
	  requestParams.put("name", "Zion"); // Cast
	  requestParams.put("age", 23);
	  requestParams.put("salary", 12000);
	  
	  request.body(requestParams.toJSONString());
	  Response response = request.put("/update/"+ empid);
	  
	  int statusCode = response.getStatusCode();
	  System.out.println(response.asString());
	  AssertJUnit.assertEquals(statusCode, 200); 
	  //System.out.println("Headers "  + response.headers());
	  
	  Headers Allheader = response.headers();
	  
	  for (Header header : Allheader )
	  {
		  System.out.println(header.getName() +" : " +header.getValue()); 
	  }
	  
	  
	  
	  
  }
}
