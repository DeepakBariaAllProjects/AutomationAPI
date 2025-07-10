package Session04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class CheckForValidResponse {

	@Test
	public void GetsingleUser() {
		//Specify base URL
		RestAssured.baseURI= "https://reqres.in/api/users/2";
		
		//Get Request specification of the request
		RequestSpecification requestSpec  = RestAssured.given();
		
		//call get  method 
		 Response response = requestSpec.get();
		 
		 //gets response code 
		 int statusCode  = response.getStatusCode();
		 
		 //validate actual status code with expected
		 Assert.assertEquals(statusCode, 200);
		
	}
}
