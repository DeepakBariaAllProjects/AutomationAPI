package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostMethod {

	@Test
	public void test03() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Deepak");
		jsonObject.put("job", "QA");
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured.given().header("content-type","application/json").contentType(ContentType.JSON)
		.body(jsonObject.toJSONString()).when().post().then().statusCode(201);
	}
}
