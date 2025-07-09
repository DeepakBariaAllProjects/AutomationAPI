package Session03;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PatchMethod {

	public void Test05() {
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("name", "Rajesh");
	jsonObject.put("job", "QA");
	RestAssured.baseURI= "https://reqres.in/api/users/3";
	RestAssured.given().header("content-type","application/json").contentType(ContentType.JSON)
	.body(jsonObject.toJSONString()).when()
	.patch().then()
	.statusCode(200);
	}
}
