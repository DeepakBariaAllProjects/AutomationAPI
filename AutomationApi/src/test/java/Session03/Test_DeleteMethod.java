package Session03;

import io.restassured.RestAssured;

public class Test_DeleteMethod {

	public void Test06() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RestAssured.given().when().delete().then().statusCode(204);
	}
}
