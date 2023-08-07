package RestAssured;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class VerifyPostRest {
@Test
public void verifypost() {	
	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	String reqBody="{\"title\":\"abc\",\"body\":\"far\",\"userid\":\"1\"}";  
	Response resp = RestAssured.given().body(reqBody).post("/posts").then().extract().response(); 
	System.out.println("status code: "+resp.getStatusCode()); 
	ResponseBody respBody= resp.body(); 
	JsonPath respPath = respBody.jsonPath(); 
	System.out.println("id form response:"+respPath.getInt("id")); }	
}

