package RestAssured;

import static org.junit.Assert.*;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.junit.Test;

public class CountStateApi {
	

	public void fetchstate(String state) {
		int counter=0;
		RestAssured.baseURI="http://universities.hipolabs.com";
		Response response=RestAssured.given().queryParam("country","india").get("/search").then().extract().response();
		System.out.println(response.toString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		assertEquals(200,response.getStatusCode());
		assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
		/*for(Header h:response.getHeaders()) {
			System.out.print("name:="+h.getName());
			System.out.print(" value:=" +h.getValue());
			System.out.println();
		}
		*/
		ResponseBody resbody =response.body();
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
		}
		System.out.println("Count of state is:" +counter);

	}
	
	public void fetchuniversity(String university) {
		int counter1=0;
		boolean found = false;
		String statefinal = null;
		RestAssured.baseURI="http://universities.hipolabs.com";
		Response response=RestAssured.given().queryParam("country","india").get("/search").then().extract().response();
		System.out.println(response.toString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		assertEquals(200,response.getStatusCode());
		assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
		/*for(Header h:response.getHeaders()) {
			System.out.print("name:="+h.getName());
			System.out.print(" value:=" +h.getValue());
			System.out.println();
		}
		*/
		ResponseBody resbody =response.body();
		JsonPath jspath=resbody.jsonPath();
		List<Object> univlist=jspath.getList("name");
		List<Object> statelist1=jspath.getList("state-province");
		//assertEquals(gender,jspath.getString("gender"));
		System.out.println("Count is:" +univlist.size());
		//System.out.println(statelist.get(0));
		for(int i=0;i<univlist.size();i++) {
		 	if(univlist.get(i)!=null && statelist1.get(i)!=null) {
		 		if(univlist.get(i).equals(university)) {
		 			found=true;
		 			statefinal=statelist1.get(i).toString();
					counter1=counter1+1;
					break;
				}
		 	}
		}
		System.out.println("Count of university is:" +counter1);
		if(found) {
			System.out.println("State for corresponding University:" +statefinal);
			System.out.println("University found");
		}
		else {
			System.out.println("University not found");
		}

	}
	
	@Test
	public void test() {
		fetchstate("Punjab");
		fetchuniversity("NorthCap University");
	}
	
}
