package RestAssured;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthenticationAPI {
	public void authencheck(String userid,String password) {
		int counter=0;
		RestAssured.baseURI="https://postman-echo.com";
		Response response=RestAssured.given().auth().preemptive().basic(userid, password).get("/basic-auth").then().extract().response();
		ResponseBody resbody=response.body();
		JsonPath jspath=resbody.jsonPath();
		assertEquals(true,jspath.getBoolean("authenticated"));
		//assertEquals(201,response.getStatusCode());
		//System.out.println(response.toString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		//assertEquals(200,response.getStatusCode());
		//assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
		/*for(Header h:response.getHeaders()) {
			System.out.print("name:="+h.getName());
			System.out.print(" value:=" +h.getValue());
			System.out.println();
		}
		*/
		/*ResponseBody resbody =response.body();
		JsonPath jspath=resbody.jsonPath();
		List<Object> statelist=jspath.getList("state-province");
		//assertEquals(gender,jspath.getString("gender"));
		System.out.println("Count is:" +statelist.size());
		//System.out.println(statelist.get(0));
		for(int i=0;i<statelist.size();i++) {
		 	if(statelist.get(i)!=null) {
		 		if(statelist.get(i).equals(state)) {
					counter=counter+1;
				}
		 	}
		}*/
		//System.out.println("Count of state is:" +counter);

	}
	
	@Test
	public void test() {
		authencheck("postman","password");
	}
}
