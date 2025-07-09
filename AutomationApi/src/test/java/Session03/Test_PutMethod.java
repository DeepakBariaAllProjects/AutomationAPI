package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PutMethod {

	@Test
	public void Test04() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Rajesh");
		jsonObject.put("job", "QA");
		RestAssured.baseURI= "https://reqres.in/api/users/3";
		RestAssured.given().header("content-type","application/json").contentType(ContentType.JSON)
		.body(jsonObject.toJSONString()).when()
		.put().then()
		.statusCode(200);
	}
}
