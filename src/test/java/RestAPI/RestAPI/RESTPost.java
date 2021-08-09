package RestAPI.RestAPI;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; 

public class RESTPost {
	
	@Test
	public void postRequest() {
		Map<String,Object> map= new HashMap<String, Object>();
		map.put("name", "achal");
		map.put("job", "ITSector");
		System.out.println(map);
		
		JSONObject request= new JSONObject();
		System.out.println(request);
		//Syso(request.toJSONString() // in this case add map in line 18 while object initialization of JSONObject
	//	System.out.println(request.toJSONString(map));
		
		given().
		body(request.toJSONString(map)).when(). 
		post("https://reqres.in/api/users").
		then().
		statusCode(201).log().all();	
	}

	@Test
	public void putRequest() {
		Map<String,Object> map= new HashMap<String, Object>();
		map.put("name", "achal");
		map.put("job", "ITSector");
		System.out.println(map);
		
		JSONObject request= new JSONObject();
		System.out.println(request);
		//Syso(request.toJSONString() // in this case add map in line 18 while object initialization of JSONObject
	//	System.out.println(request.toJSONString(map));
		
		given().
		body(request.toJSONString(map)).when(). 
		post("https://reqres.in/api/users/2").
		then().
		statusCode(201).log().all();
		
	}
}
