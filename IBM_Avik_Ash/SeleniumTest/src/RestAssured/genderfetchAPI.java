package RestAssured;

import static org.junit.Assert.*;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.junit.Test;

public class genderfetchAPI {

	public void fetchgender(String name,String gender) {
		
		RestAssured.baseURI="https://api.genderize.io/";
		//RestAssured.given().queryParam("name", name).get().then().extract().response();
		RequestSpecification myreq=RestAssured.given();
		myreq.queryParam("name", name);
		Response response = myreq.get("");
		System.out.println(response.toString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		assertEquals(200,response.getStatusCode());
		assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
		for(Header h:response.getHeaders()) {
			System.out.print("name:="+h.getName());
			System.out.print(" value:=" +h.getValue());
			System.out.println();
		}
		ResponseBody resbody =response.body();
		JsonPath jspath=resbody.jsonPath();
		assertEquals(gender,jspath.getString("gender"));
		
	}
	
	@Test
	public void test() {
		fetchgender("avik","male");
	}
	
}
